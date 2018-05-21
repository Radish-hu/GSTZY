package com.gstzy.pageElement.docWorkStation;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DocMenuElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\docWork.properties");
    public DocMenuElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement menZhenMenu() throws Exception {
        return driver.findElement(objectMap.getLocator("menZhenMenu"));
    }
    public WebElement dangAnMenu() throws Exception {
        return driver.findElement(objectMap.getLocator("dangAnMenu"));
    }
    public WebElement tongJiMenu() throws Exception {
        return driver.findElement(objectMap.getLocator("tongJiMenu"));
    }
    public WebElement qingWenZhenMenu() throws Exception {
        return driver.findElement(objectMap.getLocator("qingWenZhenMenu"));
    }
    public WebElement settingMenu() throws Exception {
        return driver.findElement(objectMap.getLocator("settingMenu"));
    }
}
