package com.gmail.mail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);

    }

    @Test
    public void SecondTest() {
        driver.get("https://www.skyscanner.com/");
        driver.findElement(By.name("fsc-origin-search")).sendKeys("sain");
        driver.findElement(By.xpath("//span[text()='St Petersburg Pulkovo (LED)']")).click();
        driver.findElement(By.name("fsc-destination-search")).sendKeys("los");
        driver.findElement(By.xpath("//small[contains(@class,'bpk-autosuggest')]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'SubmitButton-WxCV2')]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'SubmitButton-WxCV2')]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'SubmitButton-WxCV2')]")).click();


    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}