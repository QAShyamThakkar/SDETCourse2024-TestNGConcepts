package com.automation.test;

import org.testng.annotations.Test;

public class CartPage_ParallelTesting extends BasePage{

    @Test (groups = "smoke")
    public void VerifyProductDetails() {
        driver.get("https://www.amazon.in/");
        System.out.println("Test8 - Verify product details");
    }

    @Test
    public void ClickOnTheCheckoutButtonAndVerifyUserIsOnCheckOutPage() {
        driver.get("https://www.facebook.com/");
        System.out.println("Test9- Click on the checkout button and verify user is on CheckOut Page");
//        System.out.println(10/0);
    }

    @Test
    public void ClickOnContinueShoppingAndVerifyUserIsOnHomePage() {
        driver.get("https://www.amazon.in/");
        System.out.println("Test10 - Click on continue shopping and verify user is on HomePage");
    }

    @Test
    public void testMethod() {
        driver.get("https://www.facebook.com/");
        System.out.println("Test Method");
    }


}
