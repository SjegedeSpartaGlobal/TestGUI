package com.spartaglobal.TestGUI;

import com.spartaglobal.TestGUI.pages.FormPage;
import com.spartaglobal.TestGUI.selinium_config.SeleniumConfig;
import com.spartaglobal.TestGUI.website.Website;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestFormWebsite {
    private static FormPage formpage;
    private static Website website;

    @BeforeClass
    public static void setUp(){
        SeleniumConfig selCon = new SeleniumConfig("chrome");
        WebDriver driver = selCon.getDriver();
        website = new Website(driver);
        formpage = website.formPage().goToFormPage();

    }

    @Test
    public void stage1TestLinkCLicked(){
        Assert.assertEquals("https://www.toolsqa.com/automation-practice-table/",formpage.clickLink().currentURL());
        formpage.goBack();
    }

    @Test
    public void stage2TestPartialLinkCLicked(){
        Assert.assertTrue(formpage.clickPartialLink().partialLinkClicked());
    }

    @Test
    public void stage3TestEnterFirstName(){
        Assert.assertEquals("Samuel", formpage.enterFirstName("Samuel").getFirstName());
    }

    @Test
    public void stage4TestEnterLastName(){
        Assert.assertEquals("Jegede", formpage.enterLastName("Jegede").getLastName());
    }

    @Test
    public void stage5TestEnterDate(){
        Assert.assertEquals("28/3/1992", formpage.enterDate("28/3/1992").getDate());
    }

    @Test
    public void stage6TestSelectGender(){
        Assert.assertTrue(formpage.selectSex("Female").checkSelectedSexButton("Female"));
    }

    @Test
    public void stage7TestSelectYearsOfExp(){
        Assert.assertTrue(formpage.selectExp("6").expSelected("6"));
    }

    @Test
    public void stage8TestSelectProfession(){
        Assert.assertTrue(formpage.selectProf("Automation Tester").profSelected("Automation Tester"));
    }

    @Test
    public void stage9TestSelectTool(){
        Assert.assertTrue(formpage.selectTool("QTP").selectTool("Selenium Webdriver").toolSelected("QTP"));
    }

    @Test
    public void stage10TestSelectContinent(){
        Assert.assertTrue(formpage.selectContinent("Africa").continentSelected("Africa"));
    }

    @Test
    public void stage11TestSubmitButton(){
        Assert.assertTrue(formpage.clickSubmit().submitButtonClicked());
    }

    @AfterClass
    public static void tearDown(){
        website.quitDriver();
    }


}
