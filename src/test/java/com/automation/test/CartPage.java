package com.automation.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartPage {

    @Test
    public static void VerifyProductDetails(){
        System.out.println("Test8 - Verify product details");
    }

    @Test (groups = {"Smoke", "Shyam"})
    public static void ClickOnTheCheckoutButtonAndVerifyUserIsOnCheckOutPage(){
        System.out.println("Test9- Click on the checkout button and verify user is on CheckOut Page");
    }

    @Test
    public static void ClickOnContinueShoppingAndVerifyUserIsOnHomePage(){
        System.out.println("Test10 - Click on continue shopping and verify user is on HomePage");
    }



}
