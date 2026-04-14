package britc.utils;

import java.io.*;
import java.util.Properties;

public class ConfigReader {
    private static Properties prop;
    static {
        try{
            prop=new Properties();
            InputStream is= ConfigReader.class.getClassLoader().getResourceAsStream("config.properties");
            prop.load(is);
        } catch (IOException e) {
            throw new RuntimeException("failed to load the config file");
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }
}