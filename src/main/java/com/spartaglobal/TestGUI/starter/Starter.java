package com.spartaglobal.TestGUI.starter;

import com.spartaglobal.TestGUI.selinium_config.SeleniumConfig;
import com.spartaglobal.TestGUI.website.Website;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Starter {
    public static void main(String[] args){
        SeleniumConfig selCon = new SeleniumConfig("chrome");
        WebDriver driver = selCon.getDriver();
        Website website = new Website(driver);
//        System.out.println(website.formPage().goToFormPage().clickPartialLink().partialLinkClicked());
//        System.out.println(website.formPage().goToFormPage().clickLink().currentURL());
//        System.out.println("Hello: "+website.formPage().goToFormPage().enterFirstName("Samuel").getFirstName());
//        System.out.println(website.formPage().goToFormPage().enterLastName("Jegede").getLastName());
//        System.out.println(website.formPage().goToFormPage().selectSex("Male").checkSelectedSexButton("Male"));
//        System.out.println(website.formPage().goToFormPage().selectSex("Female").checkSelectedSexButton("Female"));
//        System.out.println(website.formPage().goToFormPage().selectExp("5").expSelected("5"));
//        System.out.println(website.formPage().goToFormPage().enterDate("28/03/1992").getDate());
//        System.out.println(website.formPage().goToFormPage().selectProf("Automation Tester").profSelected("Automation Tester"));
//        System.out.println(website.formPage().goToFormPage().selectTool("QTP").selectTool("Selenium IDE").selectTool("Selenium Webdriver").toolSelected("QTP"));
//        System.out.println(website.formPage().goToFormPage().selectContinent("Europe").continentSelected("Europe"));
//        System.out.println(website.formPage().goToFormPage().clickSubmit().submitButtonClicked());
        website.quitDriver();
    }
}

