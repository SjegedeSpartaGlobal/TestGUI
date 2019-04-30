package com.spartaglobal.TestGUI.pages;

import org.openqa.selenium.WebDriver;

public class Page {

    protected WebDriver driver;
    private final String mainPageURL = "https://www.toolsqa.com/automation-practice-form/";

    public Page(WebDriver driver) {
        this.driver = driver;
    }
}
