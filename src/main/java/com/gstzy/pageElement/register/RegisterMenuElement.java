package com.gstzy.pageElement.register;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterMenuElement {
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\register.properties");
    public WebDriver driver;
    public RegisterMenuElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement register() throws Exception {
        return driver.findElement(objectMap.getLocator("register"));
    }
    public WebElement charge() throws Exception {
        return driver.findElement(objectMap.getLocator("charge"));
    }
    public WebElement record() throws Exception {
        return driver.findElement(objectMap.getLocator("record"));
    }
    public WebElement report() throws Exception {
        return driver.findElement(objectMap.getLocator("report"));
    }
    public WebElement registerReportConfirm() throws Exception {
        return driver.findElement(objectMap.getLocator("registerReportConfirm"));
    }
    public WebElement logo() throws Exception {
        return driver.findElement(objectMap.getLocator("logo"));
    }
    public WebElement confirm_registerShouJu() throws Exception {
        return driver.findElement(objectMap.getLocator("confirm_registerShouJu"));
    }
}
