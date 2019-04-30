package com.spartaglobal.TestGUI.pages;

import org.openqa.selenium.WebDriver;

public class TablePage {
    private WebDriver driver;
    private final String mainPageURL = "https://www.toolsqa.com/automation-practice-form/";


    public TablePage(WebDriver driver) {
        this.driver = driver;
    }
}
