package com.gstzy.pageElement.register;
import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckVersionElement {
    public WebElement element;
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\register.properties");

    public CheckVersionElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement aboutSystem() throws Exception {
        Thread.sleep(1000);
        element=driver.findElement(objectMap.getLocator("aboutSystem"));
        return element;
    }
    public WebElement nowVersion()throws Exception{
        element=driver.findElement(objectMap.getLocator("nowVersion"));
        return element;
    }
}
