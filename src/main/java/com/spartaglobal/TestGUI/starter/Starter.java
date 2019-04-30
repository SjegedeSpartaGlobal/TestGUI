package com.spartaglobal.TestGUI.starter;

import com.spartaglobal.TestGUI.selinium_config.SeleniumConfig;
import com.spartaglobal.TestGUI.website.Website;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Starter {
    public static void main(String[] args){
//        SeleniumConfig seleniumConfig = new SeleniumConfig();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SJegede\\Documents\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        Website website = new Website(chromeDriver);
        website.mainPage().goToMainPage().clickLink();
        website.quitDriver();

    }
}

