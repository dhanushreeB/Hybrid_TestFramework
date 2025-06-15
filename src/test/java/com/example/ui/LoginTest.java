package com.example.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
       System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://fakestoreapi.com/login"); // Example URL, real app might be different
    }

    @Test
    public void loginTest() {
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("testpass");
        driver.findElement(By.id("loginButton")).click();
        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


    



}