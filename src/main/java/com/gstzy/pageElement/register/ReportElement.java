package com.gstzy.pageElement.register;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\register.properties");
    public ReportElement(WebDriver driver) {
        this.driver = driver;
    }
    //挂号日结-报表预览
    public WebElement register_preview() throws Exception {
        return driver.findElement(objectMap.getLocator("register_preview"));
    }
    //生成预览
    public WebElement register_make_preview() throws Exception {
        return driver.findElement(objectMap.getLocator("register_make_preview"));
    }
    //确定生成
    public WebElement register_confirm_preview() throws Exception {
        return driver.findElement(objectMap.getLocator("register_confirm_preview"));
    }
    //收费日结tag
    public WebElement charge_preview_tag() throws Exception {
        return driver.findElement(objectMap.getLocator("charge_preview_tag"));
    }
    //收费日结-报表预览
    public WebElement charge_preview() throws Exception {
        return driver.findElement(objectMap.getLocator("charge_preview"));
    }
    //生成预览
    public WebElement charge_make_preview() throws Exception {
        return driver.findElement(objectMap.getLocator("charge_make_preview"));
    }
    //确定生成
    public WebElement charge_confirm_preview() throws Exception {
        return driver.findElement(objectMap.getLocator("charge_confirm_preview"));
    }
    public WebElement report() throws Exception {
        return driver.findElement(objectMap.getLocator("report"));
    }
}
