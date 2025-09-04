package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties prop;

    // Initialize properties from the file
    public Properties init_prop() {
        prop = new Properties();
        try (FileInputStream ip = new FileInputStream("src/test/resources/Config/config.properties")) {
            prop.load(ip);
        } catch (FileNotFoundException e) {
            System.err.println("Config file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading config file: " + e.getMessage());
        }
        return prop;
    }

    // Get application URL
    public String getAppUrl() {
        if (prop == null) init_prop();
        return prop.getProperty("url");
    }

    // Default superuser username
    public String getUsername() {
        if (prop == null) init_prop();
        return prop.getProperty("username");
    }

    // Default superuser password
    public String getPassword() {
        if (prop == null) init_prop();
        return prop.getProperty("password");
    }

    // ✅ New method to fetch value by key (like username1, password1, etc.)
    public String getProperty(String key) {
        if (prop == null) init_prop();
        return prop.getProperty(key);
    }
}
