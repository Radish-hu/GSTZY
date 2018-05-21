package com.gstzy.pageElement.register;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterElement {
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\register.properties");
    public WebDriver driver;
    public RegisterElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement patientPhone() throws Exception {
        return driver.findElement(objectMap.getLocator("patientPhone"));
    }
    public WebElement patientName() throws Exception {
        return driver.findElement(objectMap.getLocator("patientName"));
    }
    public WebElement selectButton() throws Exception {
        return driver.findElement(objectMap.getLocator("selectButton"));
    }
    public WebElement docName() throws Exception {
        return driver.findElement(objectMap.getLocator("docName"));
    }
    public WebElement firstSource() throws Exception {
        return driver.findElement(objectMap.getLocator("firstSource"));
    }
    public WebElement saveAndCharge() throws Exception {
        return driver.findElement(objectMap.getLocator("saveAndCharge"));
    }
    public WebElement inputMoneyText() throws Exception {
        return driver.findElement(objectMap.getLocator("inputMoneyText"));
    }
    public WebElement inputMoneyButton() throws Exception {
        return driver.findElement(objectMap.getLocator("inputMoneyButton"));
    }
    public WebElement chargeButton() throws Exception {
        return driver.findElement(objectMap.getLocator("chargeButton"));
    }
}
