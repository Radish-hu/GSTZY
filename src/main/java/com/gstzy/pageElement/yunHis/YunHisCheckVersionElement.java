package com.gstzy.pageElement.yunHis;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YunHisCheckVersionElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\yunHis.properties");
    public YunHisCheckVersionElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement hisAboutSystem() throws Exception {
        return driver.findElement(objectMap.getLocator("hisAboutSystem"));
    }
    public WebElement hisNowVersion() throws Exception {
        return driver.findElement(objectMap.getLocator("hisNowVersion"));
    }
}
