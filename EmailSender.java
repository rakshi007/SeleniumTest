package util;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.util.Properties;
import java.io.File;
import java.time.LocalDate;

public class EmailSender {
    public static void sendTestReport(String reportPath, boolean isFailed) {
        final String fromEmail = "rakshithrarchakarahalli@gmail.com";
        final String password = "qwns xlcn qtxu neyx";
        final String toEmail = "rakshithr971111@gmail.com";

        String status = isFailed ? "❌ Test Execution Failed" : "✅ Test Execution Passed";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(status); // ✅ dynamic subject

            String body = "Dear Team,\n\n" +
                    "Please find attached the latest Automation Test Execution Report.\n\n" +
                    "Summary:\n" +
                    "Execution Status : " + status + "\n" +
                    "Date             : " + LocalDate.now() + "\n" +
                    "Environment      : UAT\n\n" +
                    "Kindly review the report and take necessary action if required.\n\n" +
                    "Regards,\n" +
                    "Automation QA Team";

            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(body);

            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(new File(reportPath));

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);
            Transport.send(message);

            System.out.println("✅ Email sent successfully to: " + toEmail);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
