package com.ncl.cruises;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ShoreExcursionTest extends InvokingBrowser{

    ShoreExcursionRepository shoreExcursionRepository;
    JavascriptExecutor js;

    @Test
    public void ValidateShoreExcursionPage() throws InterruptedException {
        shoreExcursionRepository = PageFactory.initElements(driver, ShoreExcursionRepository.class);
        js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", shoreExcursionRepository.getSeeTheSpectacularTitle());
        Thread.sleep(5000);
        shoreExcursionRepository.getShoreExcursionLink().click();
        Assert.assertEquals(driver.getTitle(), "Shore Excursion Search | Norwegian Cruise Line");
    }

    @Test(dependsOnMethods = "ValidateShoreExcursionPage")
    public void ValidateDestinationDropdown() throws InterruptedException {
        shoreExcursionRepository = PageFactory.initElements(driver, ShoreExcursionRepository.class);
        shoreExcursionRepository.getDestinationDropdown().click();
        shoreExcursionRepository.getDestinationInput().sendKeys("Alaska Cruises");
        Thread.sleep(5000);
        shoreExcursionRepository.getDestinationSuggestion().click();
        Thread.sleep(5000);
        shoreExcursionRepository.getFindExcursionsButton().click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Alaska Cruises | Shore Excursions | Norwegian Cruise Line");
    }

    @Test(dependsOnMethods = "ValidateDestinationDropdown")
    public void ValidateDestinationFilters(){
        shoreExcursionRepository = PageFactory.initElements(driver, ShoreExcursionRepository.class);
        List<WebElement> SelectedFilterItems = shoreExcursionRepository.getDestinationFilters();
        Assert.assertEquals(SelectedFilterItems.size(), 1);
        Assert.assertEquals(shoreExcursionRepository.getDestinationFilterText().getText(), "Alaska Cruises");
        shoreExcursionRepository.getPortFilterButton().click();
        List<WebElement> PortFilterText = shoreExcursionRepository.getPortsByFilterText();
        for (WebElement ele : PortFilterText){
            String PortName = ele.getText();
            if(PortName.contains("Alaska") || PortName.contains("British Columbia")){
                Assert.assertTrue(true);
            }
        }
    }

}
