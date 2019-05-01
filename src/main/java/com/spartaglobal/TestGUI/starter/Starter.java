package com.spartaglobal.TestGUI.starter;

import com.spartaglobal.TestGUI.pages.MainPage;
import com.spartaglobal.TestGUI.selinium_config.SeleniumConfig;
import com.spartaglobal.TestGUI.website.Website;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Starter {
    public static void main(String[] args){
//        SeleniumConfig seleniumConfig = new SeleniumConfig();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SJegede\\Documents\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        Website website = new Website(chromeDriver);
//        WebElement element = website.mainPage().goToMainPage().clickPartialLink().goBack().getPartialLink();
//        element.click();
//        website.mainPage().goToMainPage();
//        WebElement element2 = website.mainPage().goToMainPage().getLink();
//        WebElement element = website.mainPage().goToMainPage().clickLink().getLink();
//        website.mainPage().goToMainPage();
//        website.mainPage().goToMainPage().enterFirstName("kgkkgkhkhk");
//        System.out.println(website.mainPage().goToMainPage().clickPartialLink().linkSelected());
        website.mainPage().goToMainPage().selectSex("sex-1");

//        System.out.println(website.getCurrentURL());
        website.quitDriver();

    }
}

