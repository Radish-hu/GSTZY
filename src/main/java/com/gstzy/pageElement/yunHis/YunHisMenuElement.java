package com.gstzy.pageElement.yunHis;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YunHisMenuElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\yunHis.properties");
    public YunHisMenuElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement chuFangManage() throws Exception {
       return driver.findElement(objectMap.getLocator("chuFangManageMenu"));
    }
}
