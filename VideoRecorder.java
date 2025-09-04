//package util;
//
//import org.monte.media.Format;
//import org.monte.media.FormatKeys.MediaType;
//import org.monte.media.math.Rational;
//import org.monte.screenrecorder.ScreenRecorder;
//import java.awt.*;
//import java.io.File;
//
//import static org.monte.media.AudioFormatKeys.*;
//import static org.monte.media.VideoFormatKeys.*;
//
//public class VideoRecorder {
//    private static ScreenRecorder screenRecorder;
//
//    public static void startRecording(String filename) throws Exception {
//        File file = new File("./test-videos/");
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        int width = screenSize.width;
//        int height = screenSize.height;
//        Rectangle captureSize = new Rectangle(0, 0, width, height);
//
//        screenRecorder = new ScreenRecorder(
//                GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration(),
//                captureSize,
//                new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
//                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
//                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
//                        DepthKey, 24, FrameRateKey, Rational.valueOf(15),
//                        QualityKey, 1.0f, KeyFrameIntervalKey, 30),
//                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
//                null,
//                file
//        );
//
//        screenRecorder.start();
//        System.out.println("Recording started...");
//    }
//
//    public static void stopRecording() throws Exception {
//        screenRecorder.stop();
//        System.out.println("Recording stopped.");
//    }
//}
//
