package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotation {
    @BeforeMethod
    public void setup(){
        System.out.println("befor methode ");
    }
    @AfterMethod
    public  void tearDown() {
        System.out.println("After method");
    }

    @Test(priority = 4)
public void test01(){
        System.out.println("test 1");
    }
    @Test(priority = 2,dependsOnMethods = "test01")
    public void test02(){
        System.out.println("test 2");
    }
    @Test(priority = 1)
    public void test03(){
        System.out.println("test 3");
    }
    @Test(priority = 3)
    public void test04(){
        System.out.println("test 4");
    }

}
