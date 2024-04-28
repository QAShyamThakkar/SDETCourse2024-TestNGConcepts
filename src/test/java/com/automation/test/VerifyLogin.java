package com.automation.test;

import org.testng.annotations.*;

public class VerifyLogin extends BasePage{   //b /A /123, //B //123 //A, A B, 123

    @BeforeTest
    public static void beforeTest1() {
        System.out.println("BeforeTest");
    }

    @AfterTest
    public static void afterTest1() {
        System.out.println("AfterTest");
    }

    @Test (groups = "Smoke")
    public static void VerifyLoginwithValidCredential() {
        System.out.println("Test1 - Successful");

    }

    @Test
    public static void VerifyUserisUnableToLoginInvalidCredential() {
        System.out.println("Test2 - User is not abel to login with invalid credential - Successful");
    }

    @Test
    public static void VerifyUserisUnableToLoginBlankCredential() {
        System.out.println("Test3 - User is not abel to login with Blank credential - Successful");
    }


}
