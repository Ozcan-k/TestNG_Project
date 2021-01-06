package com.Test;

import org.testng.annotations.Test;

public class Depents_Annotation {
   @Test(priority = 1)
    public void logIn(){
        System.out.println("Login Test");
    }
 @Test(priority = 2,dependsOnMethods = "logIn")
    public void homePage(){
        System.out.println("Home Page Test");
    }
@Test(priority = 3)
    public void search(){
        System.out.println("Search Test");
    }
@Test(priority = 4)
    public void results(){
        System.out.println("ResultTest");
    }

}
