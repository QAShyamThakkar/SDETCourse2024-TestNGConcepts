package com.automation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BasePage {

    WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void openChrome(String browser) throws InterruptedException {

        driver = new ChromeDriver();
        System.out.println("opening the "+ browser);
    }

    @Parameters("browser")
    @AfterClass
    public void closeChrome(String browser){
               System.out.println("closing the "+ browser);
    }

}
