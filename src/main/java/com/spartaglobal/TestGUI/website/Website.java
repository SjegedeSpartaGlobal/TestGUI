package com.spartaglobal.TestGUI.website;

import com.spartaglobal.TestGUI.pages.FormPage;
import org.openqa.selenium.WebDriver;

public class Website {
    private WebDriver driver;

    public Website(WebDriver driver) {
        this.driver = driver;
    }

    public FormPage formPage(){
        return new FormPage(this.driver);
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    public void quitDriver(){
        driver.quit();
    }
}
