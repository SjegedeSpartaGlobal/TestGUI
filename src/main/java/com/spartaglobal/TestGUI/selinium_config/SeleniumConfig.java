package com.spartaglobal.TestGUI.selinium_config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumConfig {
    private WebDriver driver;
    private testGUIPropertiesReader testGUIProperties = new testGUIPropertiesReader();

    public SeleniumConfig(String browserName) {
        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", testGUIProperties.getChromeDriverPath());
            this.driver = new ChromeDriver();
        }
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
