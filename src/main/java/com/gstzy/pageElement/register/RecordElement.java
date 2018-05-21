package com.gstzy.pageElement.register;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecordElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\register.properties");
    public RecordElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement record_PatientPhone() throws Exception {
        return driver.findElement(objectMap.getLocator("record_PatientPhone"));
    }
    public WebElement record_SelectButton() throws Exception {
        return driver.findElement(objectMap.getLocator("record_SelectButton"));
    }
    public WebElement record_dealListStatus() throws Exception {
        return driver.findElement(objectMap.getLocator("record_dealListStatus"));
    }
    public WebElement record_details() throws Exception {
        return driver.findElement(objectMap.getLocator("record_details"));
    }
    public WebElement record_details_ChuFangQingDan() throws Exception {
        return driver.findElement(objectMap.getLocator("record_details_ChuFangQingDan"));
    }
    public WebElement record_details_PrintChuFang() throws Exception {
        return driver.findElement(objectMap.getLocator("record_details_PrintChuFang"));
    }
    public WebElement record_details_PrintQingDan() throws Exception {
        return driver.findElement(objectMap.getLocator("record_details_PrintQingDan"));
    }
    public WebElement record_details_FaPiaoButton() throws Exception {
        return driver.findElement(objectMap.getLocator("record_details_FaPiaoButton"));
    }
    public WebElement record_details_FaPiaoChoose() throws Exception {
        return driver.findElement(objectMap.getLocator("record_details_FaPiaoChoose"));
    }
    public WebElement record_details_FaPiaoPrint() throws Exception {
        return driver.findElement(objectMap.getLocator("record_details_FaPiaoPrint"));
    }
    public WebElement record_details_TuiKuan() throws Exception {
        return driver.findElement(objectMap.getLocator("record_details_TuiKuan"));
    }
    public WebElement record_details_TuiKuanConfirm() throws Exception {
        return driver.findElement(objectMap.getLocator("record_details_TuiKuanConfirm"));
    }
    public WebElement record_details_dealStatus() throws Exception {
        return driver.findElement(objectMap.getLocator("record_details_dealStatus"));
    }
    public WebElement record_ChongDa() throws Exception {
        return driver.findElement(objectMap.getLocator("record_ChongDa"));
    }
    public WebElement record_TuiKuan() throws Exception {
        return driver.findElement(objectMap.getLocator("record_TuiKuan"));
    }
    public WebElement record_back() throws Exception {
        return driver.findElement(objectMap.getLocator("record_back"));
    }
    public WebElement unfinishRecord_tag() throws Exception {
        return driver.findElement(objectMap.getLocator("unfinishRecord_tag"));
    }
    public WebElement unfinishRecord_selectButton() throws Exception {
        return driver.findElement(objectMap.getLocator("unfinishRecord_selectButton"));
    }
    public WebElement unfinishRecord_status() throws Exception {
        return driver.findElement(objectMap.getLocator("unfinishRecord_status"));
    }
    public WebElement unfinishRecord_details() throws Exception {
        return driver.findElement(objectMap.getLocator("unfinishRecord_details"));
    }
    public WebElement unfinishRecord_jiXuPay() throws Exception {
        return driver.findElement(objectMap.getLocator("unfinishRecord_jiXuPay"));
    }
    public WebElement unfinishRecord_QuXiaoDeal() throws Exception {
        return driver.findElement(objectMap.getLocator("unfinishRecord_QuXiaoDeal"));
    }
    public WebElement unfinishRecord_QuXiaoDeal_confirm() throws Exception {
        return driver.findElement(objectMap.getLocator("unfinishRecord_QuXiaoDeal_confirm"));
    }
    public WebElement record_info() throws Exception {
        return driver.findElement(objectMap.getLocator("record_info"));
    }

}
