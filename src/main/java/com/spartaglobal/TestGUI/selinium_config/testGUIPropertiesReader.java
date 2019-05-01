package com.spartaglobal.TestGUI.selinium_config;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class testGUIPropertiesReader {
    private String chromeDriverPath;
    private String propertiesFileLocation = "resources/testGUI.properties";


    public testGUIPropertiesReader() {
        try {
            Properties testGUIProperties = new Properties();
            testGUIProperties.load(new FileReader(propertiesFileLocation));
            this.chromeDriverPath = testGUIProperties.getProperty("chromeDriverPath");
            System.out.println("hello: "+this.chromeDriverPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public void setChromeDriverPath(String chromeDriverPath) {
        this.chromeDriverPath = chromeDriverPath;
    }
}
