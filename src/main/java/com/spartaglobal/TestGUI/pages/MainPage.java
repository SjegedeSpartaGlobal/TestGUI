package com.spartaglobal.TestGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MainPage{
    private WebDriver driver;
    private final String mainPageURL = "https://www.toolsqa.com/automation-practice-form/";
    private final By HyperLinks = By.tagName("Automation Practice Form");
    private final By PartialHyperLink = By.name("");
    private List<String> linkElements = new ArrayList<>();
//    private final By FirstNameLink = By.name("");
//    private WebElement link;
//    private WebElement partialLink;
//    private WebElement firstnameLink;
//    private By sexElements = By.name("sex");
//    private List<String> sexRadioButtonElements = new ArrayList<>();

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public MainPage goToMainPage(){
        driver.navigate().to(mainPageURL);
        return this;
    }

    public MainPage goBack(){
        driver.navigate().back();
        return this;
    }

//    public void setLink(){
//        link = driver.findElement(HyperLink);
//    }
//
//    public void setPartialLink(){
//
//        partialLink = driver.findElement(PartialHyperLink);
//    }
//
//    public void setFirstNameLink(){
//
//        firstnameLink = driver.findElement(FirstNameHyperLink);
//    }
//
//    public MainPage clickLink(){
//        if(link==null){
//            setLink();
//        }
//        link.click();
//        return this;
//    }
//
//    public MainPage clickPartialLink(){
//        if(partialLink==null){
//            setPartialLink();
//        }
//        partialLink.click();
//        return this;
//    }
//
//    public MainPage enterFirstName(String firstname){
//        if(firstnameLink==null){
//            setFirstNameLink();
//        }
//        firstnameLink.sendKeys(firstname);
//        return this;
//    }
//
//    public WebElement getLink() {
//        if(link==null){
//            setLink();
//        }
//        return link;
//    }
//
//    public WebElement getPartialLink() {
//        if(partialLink==null){
//            setPartialLink();
//        }
//        return partialLink;
//    }
//
//    public WebElement getFirstnameLink() {
//        if(firstnameLink==null){
//            setFirstNameLink();
//        }
//        return firstnameLink;
//    }
//
//    public String getFirstNameText(){
//        if(firstnameLink==null){
//            setFirstNameLink();
//        }
//        return firstnameLink.getText();
//    }
//
//    public boolean linkSelected(){
//        if(link==null){
//            setLink();
//        }
//        return link.isEnabled();
//    }
//
//    private void getSexElements(){
//        List<String> radioButtonElements = new ArrayList<>();
//
//        for (WebElement sexElement : driver.findElements(sexElements)) {
//            radioButtonElements.add(sexElement.getAttribute("value"));
//        }
//
//        sexRadioButtonElements =  radioButtonElements;
//    }
//
//    public void selectSex(String sexSelected) {
//        if (sexRadioButtonElements == null) { getSexElements(); }
//
//        if (sexRadioButtonElements.contains(sexSelected)){
//            driver.findElement(By.id("sex-" + sexRadioButtonElements.indexOf(sexSelected))).click();
//        } else {
//            throw new IllegalArgumentException("The requested element was not available. Please use one of the following " + sexRadioButtonElements);
//        }
//    }
//
//    public void checkSelectedSexButton(String selectedSex){
//        if (sexRadioButtonElements == null) { getSexElements(); }
//
//        if (sexRadioButtonElements.contains(selectedSex)){
//            driver.findElement(By.id("sex-" + sexRadioButtonElements.indexOf(selectedSex))).isSelected();
//        } else {
//            throw new IllegalArgumentException("The requested element was not selected. Please use one of the following " + sexRadioButtonElements + " & that it hs been successfully selected");
//        }
//    }
}
