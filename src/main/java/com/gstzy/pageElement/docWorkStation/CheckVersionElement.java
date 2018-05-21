package com.gstzy.pageElement.docWorkStation;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckVersionElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\docWork.properties");
    public CheckVersionElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement aboutSystem() throws Exception {
        return driver.findElement(objectMap.getLocator("aboutSystem"));
    }
    public WebElement nowVersion() throws Exception {
        return driver.findElement(objectMap.getLocator("nowVersion"));
    }
}
