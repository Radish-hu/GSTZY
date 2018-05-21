package com.gstzy.pageElement.docWorkStation;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingLiElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\docWork.properties");
    public BingLiElement(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement zhuSu() throws Exception {
        return driver.findElement(objectMap.getLocator("zhuSu"));
    }
    public WebElement xianBingShi() throws Exception {
        return driver.findElement(objectMap.getLocator("xianBingShi"));
    }
    public WebElement guoMinShi() throws Exception {
        return driver.findElement(objectMap.getLocator("guoMinShi"));
    }
    public WebElement jiWangShiCheckBox() throws Exception {
        return driver.findElement(objectMap.getLocator("jiWangShiCheckBox"));
    }
    public WebElement jiWangShi() throws Exception {
        return driver.findElement(objectMap.getLocator("jiWangShi"));
    }
    public WebElement jiaZuShiCheckBox() throws Exception {
        return driver.findElement(objectMap.getLocator("jiaZuShiCheckBox"));
    }
    public WebElement jiaZuShi() throws Exception {
        return driver.findElement(objectMap.getLocator("jiaZuShi"));
    }
    public WebElement jingDaiTaiChanShiCheckBox() throws Exception {
        return driver.findElement(objectMap.getLocator("jingDaiTaiChanShiCheckBox"));
    }
    public WebElement jingDaiTaiChanShi() throws Exception {
        return driver.findElement(objectMap.getLocator("jingDaiTaiChanShi"));
    }
    public WebElement jingDaiTaiChanShiInput() throws Exception {
        return driver.findElement(objectMap.getLocator("jingDaiTaiChanShiInput"));
    }
    public WebElement tiGeCheckBox() throws Exception {
        return driver.findElement(objectMap.getLocator("tiGeCheckBox"));
    }
    public WebElement tiGeCheckInput() throws Exception {
        return driver.findElement(objectMap.getLocator("tiGeCheckInput"));
    }
    public WebElement T() throws Exception {
        return driver.findElement(objectMap.getLocator("T"));
    }
    public WebElement P() throws Exception {
        return driver.findElement(objectMap.getLocator("P"));
    }
    public WebElement R() throws Exception {
        return driver.findElement(objectMap.getLocator("R"));
    }
    public WebElement BP_before() throws Exception {
        return driver.findElement(objectMap.getLocator("BP_before"));
    }
    public WebElement BP_after() throws Exception {
        return driver.findElement(objectMap.getLocator("BP_after"));
    }
    public WebElement sheZhi() throws Exception {
        return driver.findElement(objectMap.getLocator("sheZhi"));
    }
    public WebElement sheTai() throws Exception {
        return driver.findElement(objectMap.getLocator("sheTai"));
    }
    public WebElement maiXiang() throws Exception {
        return driver.findElement(objectMap.getLocator("maiXiang"));
    }
    public WebElement fuZhuCheckBox() throws Exception {
        return driver.findElement(objectMap.getLocator("fuZhuCheckBox"));
    }
    public WebElement fuZhuCheckInput() throws Exception {
        return driver.findElement(objectMap.getLocator("fuZhuCheckInput"));
    }
    public WebElement zhongYiZhenDuan() throws Exception {
        return driver.findElement(objectMap.getLocator("zhongYiZhenDuan"));
    }
    public WebElement xiYiZhenDuan() throws Exception {
        return driver.findElement(objectMap.getLocator("xiYiZhenDuan"));
    }
    public WebElement chuLi() throws Exception {
        return driver.findElement(objectMap.getLocator("chuLi"));
    }

}
