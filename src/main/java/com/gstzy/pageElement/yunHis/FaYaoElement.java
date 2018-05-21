package com.gstzy.pageElement.yunHis;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaYaoElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\yunHis.properties");
    public FaYaoElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement hisPatientName() throws Exception {
        return driver.findElement(objectMap.getLocator("hisPatientName"));
    }
    public WebElement hisPatientPhone() throws Exception {
        return driver.findElement(objectMap.getLocator("hisPatientPhone"));
    }
    public WebElement hisSelectButton() throws Exception {
        return driver.findElement(objectMap.getLocator("hisSelectButton"));
    }
    public WebElement statusButton() throws Exception {
        return driver.findElement(objectMap.getLocator("statusButton"));
    }
    public WebElement shenFangBeiZhu() throws Exception {
        return driver.findElement(objectMap.getLocator("shenFangBeiZhu"));
    }
    public WebElement shenFangAndStartTiaoJi() throws Exception {
        return driver.findElement(objectMap.getLocator("shenFangAndStartTiaoJi"));
    }
    public WebElement tiaoJiOver() throws Exception {
        return driver.findElement(objectMap.getLocator("tiaoJiOver"));
    }
    public WebElement faYaoOver() throws Exception {
        return driver.findElement(objectMap.getLocator("faYaoOver"));
    }
    public WebElement shenFang() throws Exception {
        return driver.findElement(objectMap.getLocator("shenFang"));
    }
    public WebElement chuFangSelectButton() throws Exception {
        return driver.findElement(objectMap.getLocator("chuFangSelectButton"));
    }
    public WebElement chuFangInfo() throws Exception {
        return driver.findElement(objectMap.getLocator("chuFangInfo"));
    }
}
