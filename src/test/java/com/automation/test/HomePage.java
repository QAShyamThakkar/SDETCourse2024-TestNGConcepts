package com.automation.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePage extends BasePage{


    @Test
    public static void Verify_User_is_On_HomePage(){
        System.out.println("Test 4- Verify_User_is_On_HomePage" );
    }

    @Test (groups = {"Smoke", "Francis"} )
    public static void userClickOnFirstProductAndSddingToCart(){
        System.out.println("Test 5- User click on First product and adding to cart" );
    }

    @Test
    public static void UserIsAbleToRemoveFromCart(){
        System.out.println("Test6 - User is able to remove from cart");
    }

    @Test
    public static void UserClicksOnCartButton(){
        System.out.println("Test7 - User clicks on cart Button");
    }

}
