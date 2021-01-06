package com.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class automationpractice_Test {
    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class='login']")).click();
        WebElement emailBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        emailBox.sendKeys("yeni@gmail.com");

        WebElement create_Button = driver.findElement(By.xpath("(//button)[2]"));
        create_Button.click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
        WebElement firstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstName.sendKeys("Hakan");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        lastName.sendKeys("kemal");

        // WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
        //email.sendKeys("yeni@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
        password.sendKeys("kemal123");

        WebElement selectDay = driver.findElement(By.id("days"));
        Select days = new Select(selectDay);
        days.selectByIndex(10);

        WebElement selectMounth = driver.findElement(By.id("months"));
        Select months = new Select(selectMounth);
        months.selectByIndex(2);

        WebElement selectYears = driver.findElement(By.id("years"));
        Select years = new Select(selectYears);
        years.selectByIndex(15);

        WebElement companyBox = driver.findElement(By.id("company"));
        companyBox.sendKeys("Cosmos ING");

        WebElement adressBox = driver.findElement(By.id("address1"));
        adressBox.sendKeys("15.avenue PO 245 ");

       WebElement cityBox = driver.findElement(By.xpath("//input[@name='city']"));
        cityBox.sendKeys("Brooklyn");

       WebElement selectState = driver.findElement(By.xpath("//select[@name='id_state']"));
        Select State = new Select(selectState);
        State.selectByIndex(13);

        WebElement postCode=driver.findElement(By.id("postcode"));
        postCode.sendKeys("ABC123");

       // WebElement countryBox= driver.findElement(By.id("uniform-id_country"));
        //Select country=new Select(countryBox);
        //country.selectByIndex(1);

        WebElement addInformation= driver.findElement(By.id("other"));
        addInformation.sendKeys("nothing");

        WebElement phoneBox=driver.findElement(By.id("phone"));
        phoneBox.sendKeys("12345678");

        WebElement mobilePhoneBox=driver.findElement(By.id("phone_mobile"));
        mobilePhoneBox.sendKeys("0987654321");

        WebElement aliasBox=driver.findElement(By.id("alias"));
        aliasBox.sendKeys("Name");

        WebElement registerButton=driver.findElement(By.id("submitAccount"));
                registerButton.click();

        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        WebElement errorMessage=driver.findElement(By.xpath("//div//ol//li"));

        System.out.println(errorMessage.getText());
        Assert.assertTrue(errorMessage.getText().contains("The Zip/Postal code"));






    }
}
