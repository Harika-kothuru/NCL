package com.ncl.cruises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingBrowser {

    public static WebDriver driver;

    public WebDriver invokeBrowser(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return driver;
    }
}

