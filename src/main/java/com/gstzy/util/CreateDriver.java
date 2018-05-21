package com.gstzy.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CreateDriver {
    public static WebDriver getDriver(){
        String chromeDriver="webdriver.chrome.driver";
        String localURL="C:\\Users\\kelun.hu\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe";
        System.setProperty(chromeDriver,localURL);
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.open('','testwindow','width=400,height=200')");
        driver.close();
        driver.switchTo().window("testwindow");
        js.executeScript("window.resizeTo(1920,1080);");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        return driver;
    }
}
