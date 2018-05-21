package com.gstzy.pageElement.register;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YuYueElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\register.properties");
    public YuYueElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement yuYueQuHao() throws Exception {
        return driver.findElement(objectMap.getLocator("yuYueQuHao"));
    }
    public WebElement yuYuePhone() throws Exception {
        return driver.findElement(objectMap.getLocator("yuYuePhone"));
    }
    public WebElement yuYueSelectButton() throws Exception {
        return driver.findElement(objectMap.getLocator("yuYueSelectButton"));
    }
    public WebElement yuYueFirstSource() throws Exception {
        return driver.findElement(objectMap.getLocator("yuYueFirstSource"));
    }
    public WebElement yuYueSaveAndCharge() throws Exception {
        return driver.findElement(objectMap.getLocator("yuYueSaveAndCharge"));
    }
    public WebElement yuYueConfirm() throws Exception {
        return driver.findElement(objectMap.getLocator("yuYueConfirm"));
    }
    public WebElement yuYueInputMoneyButton() throws Exception {
        return driver.findElement(objectMap.getLocator("yuYueInputMoneyButton"));
    }
    public WebElement yuYueChargeButton() throws Exception {
        return driver.findElement(objectMap.getLocator("yuYueChargeButton"));
    }
}
