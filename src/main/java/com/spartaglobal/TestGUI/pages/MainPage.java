package com.spartaglobal.TestGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage{
    private WebDriver driver;
    private final String mainPageURL = "https://www.toolsqa.com/automation-practice-form/";
    private final By HyperLink = By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[5]/a");
    private By PartialHyperLink = By.className(getPartialLinkString());

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public MainPage goToMainPage(){
        driver.navigate().to(mainPageURL);
        return this;
    }

    public MainPage clickLink(){
        driver.findElement(HyperLink).click();
        return this;
    }

    public MainPage clickPartialLink(){
        driver.findElement(PartialHyperLink).click();
        return this;
    }

    private String getLinkString(){
        return "page-template-default page page-id-1715 wp-embed-responsive"+
                " the7-core-ver-1.16.0 image-blur large-hover-icons"+
                " dt-responsive-on srcset-enabled btn-flat custom-btn-color custom-btn-hover-color"+
                " shadow-element-decoration phantom-fade phantom-shadow-decoration phantom-custom-logo-on"+
                "  top-header first-switch-logo-center first-switch-menu-left second-switch-logo-center second-switch-menu-left"+
                " layzr-loading-on popup-message-style dt-fa-compatibility the7-ver-7.3.2 wpb-js-composer js-comp-ver-5.6"+
                " vc_responsive outlined-portfolio-icons is-webkit no-mobile closed-overlay-mobile-header";
    }

    private String getPartialLinkString(){
        return "page-template-default page page-id-1696 wp-embed-responsive the7-core-ver-1.16.0 image-blur"+
                " large-hover-icons dt-responsive-on srcset-enabled btn-flat custom-btn-color custom-btn-hover-color"+
                " shadow-element-decoration phantom-fade phantom-shadow-decoration phantom-custom-logo-on  top-header"+
                " first-switch-logo-center first-switch-menu-left second-switch-logo-center second-switch-menu-left"+
                " layzr-loading-on popup-message-style dt-fa-compatibility the7-ver-7.3.2 wpb-js-composer"+
                " js-comp-ver-5.6 vc_responsive outlined-portfolio-icons is-webkit";
    }
}
