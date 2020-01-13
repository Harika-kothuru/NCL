package com.ncl.cruises;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class InvokingApplication extends InvokingBrowser{

    ConfigFileReader configFileReader;

    /**
     *
     * @throws IOException
     */
    @BeforeSuite
    public void invokeApplication() throws IOException {
        configFileReader = new ConfigFileReader();
        invokeBrowser();
        driver.get(configFileReader.getURL());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getTitle(), "Cruises & Cruise Deals | Plan Your Cruise Vacation | NCL");
    }

    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }
}
