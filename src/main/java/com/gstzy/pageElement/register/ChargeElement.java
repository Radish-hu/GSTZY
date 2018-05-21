package com.gstzy.pageElement.register;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChargeElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\register.properties");
    public ChargeElement(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement charge_PatientPhone() throws Exception {
        return driver.findElement(objectMap.getLocator("charge_PatientPhone"));
    }
    public WebElement charge_selectButton() throws Exception {
        return driver.findElement(objectMap.getLocator("charge_selectButton"));
    }
    public WebElement charge_FeiBie() throws Exception {
        return driver.findElement(objectMap.getLocator("charge_FeiBie"));
    }
    public WebElement charge_inputMoneyButton() throws Exception {
        return driver.findElement(objectMap.getLocator("charge_inputMoneyButton"));
    }
    public WebElement charge_chargeListButton() throws Exception {
        return driver.findElement(objectMap.getLocator("charge_chargeListButton"));
    }
    public WebElement charge_saveAndCharge() throws Exception {
        return driver.findElement(objectMap.getLocator("charge_saveAndCharge"));
    }
}
