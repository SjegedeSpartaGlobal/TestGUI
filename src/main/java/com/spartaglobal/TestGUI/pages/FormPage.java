package com.spartaglobal.TestGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class FormPage {
    private WebDriver driver;
    private final String MainPageURL = "https://www.toolsqa.com/automation-practice-form/";
    private final By PartialLink = By.partialLinkText("Partial");
    private final By Link = By.linkText("Link Test");
    private final By FirstName = By.name("firstname");
    private final By LastName = By.name("lastname");
    private final By SexElements = By.name("sex");
    private List<String> sexRadioElements = new ArrayList<>();
    private final By ExpElements = By.name("exp");
    private List<String> expRadioElements = new ArrayList<>();
    private final By DateElement = By.id("datepicker");
    private final By ProfElements = By.name("profession");
    private List<String> profCheckBoxElements = new ArrayList<>();
    private final By ToolElements = By.name("tool");
    private List<String> toolCheckBoxElements = new ArrayList<>();
    private final By ContinentElements = By.name("continents");
    private final By SubmitButtonELement = By.id("submit");



    public FormPage(WebDriver driver){
        this.driver = driver;

    }

    public FormPage goToFormPage(){
        driver.navigate().to(MainPageURL);
        return this;
    }

    public FormPage goBack(){
        driver.navigate().back();
        return this;
    }

    public FormPage clickPartialLink(){
        driver.findElement(PartialLink).click();
        return this;
    }

    public  boolean partialLinkClicked(){
        return driver.findElement(PartialLink).isEnabled();
    }

    public FormPage clickLink(){
        driver.findElement(Link).click();
        return this;
    }

    public String currentURL(){
        return driver.getCurrentUrl();
    }

    public FormPage enterFirstName(String name){
        driver.findElement(FirstName).sendKeys(name);
        return this;
    }

    public String getFirstName(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(FirstName).getAttribute("value");
    }

    public FormPage enterLastName(String name){
        driver.findElement(LastName).sendKeys(name);
        return this;
    }

    public String getLastName(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(LastName).getAttribute("value");
    }

    public FormPage enterDate(String date){
        driver.findElement(DateElement).sendKeys(date);
        return this;
    }

    public String getDate(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(DateElement).getAttribute("value");
    }

    public FormPage clickSubmit(){
        driver.findElement(SubmitButtonELement).click();
        return this;
    }

    public boolean submitButtonClicked(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(SubmitButtonELement).isEnabled();
    }

    private void getSexElements(){
        List<String> newRadioElements = new ArrayList<>();
        for (WebElement sexElement : driver.findElements(SexElements)) {
            newRadioElements.add(sexElement.getAttribute("value"));
        }

        sexRadioElements =  newRadioElements;
    }

    public FormPage selectSex(String sexSelected) {
        int index;
        if (sexRadioElements.size() == 0) { getSexElements(); }

        if (sexRadioElements.contains(sexSelected)){
            index = sexRadioElements.indexOf(sexSelected);
            driver.findElement(By.id("sex-"+index)).click();
        } else {
            throw new IllegalArgumentException("The requested element was not available. Please use one of the following " + sexRadioElements);
        }
        return this;
    }

    public boolean checkSelectedSexButton(String sexSelected){
        boolean selected = false;
        int index;
        if (sexRadioElements.size() == 0) { getSexElements(); }

        if (sexRadioElements.contains(sexSelected)){
            index = sexRadioElements.indexOf(sexSelected);
            selected = driver.findElement(By.id("sex-" + index)).isSelected();
        } else {
            throw new IllegalArgumentException("The requested element was not selected. Please use one of the following " + sexRadioElements + " & that it hs been successfully selected");
        }
        return selected;
    }

    private void getExpElements(){
        List<String> newRadioElements = new ArrayList<>();
        for (WebElement expElement : driver.findElements(ExpElements)) {
            newRadioElements.add(expElement.getAttribute("value"));
        }

        expRadioElements =  newRadioElements;
    }

    public FormPage selectExp(String selectedExp) {
        int index;
        if (expRadioElements.size() == 0) { getExpElements(); }
        if (expRadioElements.contains(selectedExp)){
            index = expRadioElements.indexOf(selectedExp);
            driver.findElement(By.id("exp-"+index)).click();
        } else {
            throw new IllegalArgumentException("The requested element was not available. Please use one of the following " + expRadioElements);
        }
        return this;
    }

    public boolean expSelected(String selectedExp) {
        int index;
        if (expRadioElements.size() == 0) { getExpElements(); }
        if (expRadioElements.contains(selectedExp)) {
            index = expRadioElements.indexOf(selectedExp);
            if (driver.findElement(By.id("exp-" + index)).isSelected()) {
                return true;
            }
        }
        return false;
    }

    private void getProfCheckBoxElements(){
        List<String> newCheckBoxElements = new ArrayList<>();
        for (WebElement profElement : driver.findElements(ProfElements)) {
            newCheckBoxElements.add(profElement.getAttribute("value"));
        }

        profCheckBoxElements =  newCheckBoxElements;
    }

    public FormPage selectProf(String selectedProf) {
        int index;
        if (profCheckBoxElements.size() == 0) { getProfCheckBoxElements(); }
        if (profCheckBoxElements.contains(selectedProf)){
            index = profCheckBoxElements.indexOf(selectedProf);
            driver.findElement(By.id("profession-"+index)).click();
        } else {
            throw new IllegalArgumentException("The requested element was not available. Please use one of the following " + profCheckBoxElements);
        }
        return this;
    }

    public boolean profSelected(String selectedProf) {
        int index;
        if (profCheckBoxElements.size() == 0) { getProfCheckBoxElements(); }
        if (profCheckBoxElements.contains(selectedProf)){
            index = profCheckBoxElements.indexOf(selectedProf);
            if(driver.findElement(By.id("profession-"+index)).isSelected()){
                return true;
            }
        }
        return false;
    }

    private void getToolCheckBoxElements(){
        List<String> newCheckBoxElements = new ArrayList<>();
        for (WebElement toolElement : driver.findElements(ToolElements)) {
            newCheckBoxElements.add(toolElement.getAttribute("value"));
        }

        toolCheckBoxElements =  newCheckBoxElements;
    }

    public FormPage selectTool(String selectedTool) {
        int index;
        if (toolCheckBoxElements.size() == 0) { getToolCheckBoxElements(); }
        if (toolCheckBoxElements.contains(selectedTool)){
            index = toolCheckBoxElements.indexOf(selectedTool);
            driver.findElement(By.id("tool-"+index)).click();
        } else {
            throw new IllegalArgumentException("The requested element was not available. Please use one of the following " + toolCheckBoxElements);
        }
        return this;
    }

    public boolean toolSelected(String selectedTool) {
        int index;
        if (toolCheckBoxElements.size() == 0) { getToolCheckBoxElements(); }
        if (toolCheckBoxElements.contains(selectedTool)) {
            index = toolCheckBoxElements.indexOf(selectedTool);
            if (driver.findElement(By.id("tool-" + index)).isSelected()) {
                return true;
            }
        }
        return false;
    }


    public FormPage selectContinent(String selectedContinent) {
        Select continentList = new Select(driver.findElement(ContinentElements));
        continentList.selectByVisibleText(selectedContinent);
        return this;
    }

    public boolean continentSelected(String selectedContinent) {
        Select continentList = new Select(driver.findElement(ContinentElements));
        if(selectedContinent.equals(continentList.getFirstSelectedOption().getText())){
            return true;
        };
        return false;
    }

}
