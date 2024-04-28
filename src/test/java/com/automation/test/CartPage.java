package com.automation.test;

import org.testng.annotations.Test;

public class CartPage extends BasePage {

    @Test(groups = "smoke", priority = 1)
    public void VerifyProductDetails() {

        System.out.println("Test8 - Verify product details");
    }

    @Test(priority = 3)
    public void ClickOnTheCheckoutButtonAndVerifyUserIsOnCheckOutPage() {
              System.out.println("Test9- Click on the checkout button and verify user is on CheckOut Page");
//        System.out.println(10/0);
    }

    @Test(priority = 2, dependsOnMethods = "ClickOnTheCheckoutButtonAndVerifyUserIsOnCheckOutPage")
    public void ClickOnContinueShoppingAndVerifyUserIsOnHomePage() {

        System.out.println("Test10 - Click on continue shopping and verify user is on HomePage");
    }


}
