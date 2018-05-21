package com.gstzy.testScript.checkList;

import com.gstzy.section.NewPatient;
import com.gstzy.section.Register;
import com.gstzy.section.RegisterCheckVersion;
import com.gstzy.section.docWorkStation.*;
import com.gstzy.section.register.*;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Check {
    public WebDriver driver;
    @BeforeMethod
    public void init(){
        driver= CreateDriver.getDriver();
    }
    @Test(priority = 1,enabled = false)
    public void register() throws Exception {
        RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
        RegisterCheckVersion.execute(driver);
        NewPatient.executeConfirm(driver);
        Register.execute(driver);
        //YuYueQuHao.execute(driver);
    }
    @Test(priority = 2,enabled = true)
    public void doctor() throws Exception {
        DoctorLogin.execute(driver,Constant.userName,Constant.passWord);
        DoctorCheckVersion.execute(driver);
        PatientJiaoHao.execute(driver);
    }
    @Test(priority = 3,enabled = false)
    public void unFinishCharge() throws Exception {
        RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
        Thread.sleep(2000);
        IsDisplayWindow.execute(driver);
        Thread.sleep(2000);
        Charge.unfinishCharge(driver);
        Thread.sleep(1000);
        Record.unFinishRecord_QuXiaoDeal(driver);
    }
    @Test(priority = 4,enabled = false)
    public void charge() throws Exception {
        RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
        Thread.sleep(2000);
        IsDisplayWindow.execute(driver);
        Thread.sleep(2000);
        Charge.charge(driver);
        Thread.sleep(1000);
    }
    @Test(priority = 5,enabled = false)
    public void record() throws Exception {
        RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
        Thread.sleep(2000);
        IsDisplayWindow.execute(driver);
        Thread.sleep(2000);
        Record.details(driver);
        Record.printChuFang(driver);
        Record.printQingDan(driver);
        Record.shouJuFaPiao(driver);
        Record.backList(driver);
        Record.chongDa(driver);
        Record.list_TuiKuan(driver);
    }
    @Test(priority = 6,enabled = false)
    public void report() throws Exception {
        RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
        Report.registerPreview(driver);
        Report.chargePreview(driver);
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}
