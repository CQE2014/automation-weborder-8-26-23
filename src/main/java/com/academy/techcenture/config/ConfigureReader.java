package com.academy.techcenture.config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigureReader {
    private static Properties properties;
    private static final String PATH = "src/main/resources/config.properties";

    private ConfigureReader(){}

    static {
        try {
            FileInputStream inputStream = new FileInputStream(PATH);
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyName) {return properties.getProperty(keyName);
    }

    public static void main(String[] args) {
        System.out.println(1 % 5);
    }
}

