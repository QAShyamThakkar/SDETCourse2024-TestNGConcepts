package com.automation.test;

import org.testng.annotations.Test;

public class CartPage extends BasePage {

    @Test(groups = "smoke", priority = 1)
    public void VerifyProductDetails() {
        driver.get("https://www.amazon.in/");
        System.out.println("Test8 - Verify product details");
    }

    @Test(priority = 3)
    public void ClickOnTheCheckoutButtonAndVerifyUserIsOnCheckOutPage() {
        driver.get("https://www.facebook.com/");
        System.out.println("Test9- Click on the checkout button and verify user is on CheckOut Page");
//        System.out.println(10/0);
    }

    @Test(priority = 2, dependsOnMethods = "ClickOnTheCheckoutButtonAndVerifyUserIsOnCheckOutPage")
    public void ClickOnContinueShoppingAndVerifyUserIsOnHomePage() {
        driver.get("https://www.amazon.in/");
        System.out.println("Test10 - Click on continue shopping and verify user is on HomePage");
    }


}
