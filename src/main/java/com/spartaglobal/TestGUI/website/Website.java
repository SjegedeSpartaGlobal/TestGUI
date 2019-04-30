package com.spartaglobal.TestGUI.website;

import com.spartaglobal.TestGUI.pages.MainPage;
import com.spartaglobal.TestGUI.pages.TablePage;
import org.openqa.selenium.WebDriver;

public class Website {
    private WebDriver driver;


    public Website(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage mainPage(){
        return new MainPage(this.driver);
    }

    public TablePage tablePage(){
        return new TablePage(this.driver);
    }

    public void quitDriver(){
        driver.quit();
    }
}
