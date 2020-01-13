package com.ncl.cruises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ConfigFileReader {

    String propertyFilePath = "./src/main/resources/config.properties";
    Properties properties;

    /**
     *
     * @throws IOException
     */
    public ConfigFileReader() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
        properties = new Properties();
        properties.load(reader);
        reader.close();
    }

    public String getURL(){
        String url = properties.getProperty("url");
        return url;
    }
}
