package com.gstzy.pageElement.OperateManager;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewDoctorElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\OperateManager.properties");
    public NewDoctorElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement docManagerMenu() throws Exception {
        return driver.findElement(objectMap.getLocator("docManagerMenu"));
    }
    public WebElement docList() throws Exception {
        return driver.findElement(objectMap.getLocator("docList"));
    }
    public WebElement newDoc() throws Exception {
        return driver.findElement(objectMap.getLocator("newDoc"));
    }
    public WebElement keshi() throws Exception {
        return driver.findElement(objectMap.getLocator("keshi"));
    }
    public WebElement city() throws Exception {
        return driver.findElement(objectMap.getLocator("city"));
    }
    public WebElement mendian() throws Exception {
        return driver.findElement(objectMap.getLocator("mendian"));
    }
    public WebElement zhenjin() throws Exception {
        return driver.findElement(objectMap.getLocator("zhenjin"));
    }
    public WebElement doctorName() throws Exception {
        return driver.findElement(objectMap.getLocator("doctorName"));
    }
    public WebElement doctorPhone() throws Exception {
        return driver.findElement(objectMap.getLocator("doctorPhone"));
    }
    public WebElement zhichen() throws Exception {
        return driver.findElement(objectMap.getLocator("zhichen"));
    }
    public WebElement chuzhenInfo() throws Exception {
        return driver.findElement(objectMap.getLocator("chuzhenInfo"));
    }
    public WebElement registerChoose() throws Exception {
        return driver.findElement(objectMap.getLocator("registerChoose"));
    }
    public WebElement docSave() throws Exception {
        return driver.findElement(objectMap.getLocator("docSave"));
    }
    public WebElement loginUser() throws Exception {
        return driver.findElement(objectMap.getLocator("loginUser"));
    }
    public WebElement loginPassword() throws Exception {
        return driver.findElement(objectMap.getLocator("loginPassword"));
    }
    public WebElement loginButton() throws Exception {
        return driver.findElement(objectMap.getLocator("loginButton"));
    }
}
