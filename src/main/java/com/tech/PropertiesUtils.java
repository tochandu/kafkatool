package com.tech;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
    public static void getAppVersion() throws IOException {


        //to load application's properties, we use this class
        Properties mainProperties = new Properties();

        FileInputStream file;

        //the base folder is ./, the root of the main.properties file
        String path = "sub.properties";

        //load the file handle for main.properties
        file = new FileInputStream(path);

        //load all the properties from this file
        mainProperties.load(file);
        mainProperties.keySet().stream()
                .map(key -> key + "::::"+mainProperties.getProperty(key.toString()))
                        .forEach(System.out::println);
        //we have loaded the properties, so close the file handle
        file.close();


    }
}
