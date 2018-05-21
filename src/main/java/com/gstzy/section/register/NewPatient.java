package com.gstzy.section;

import com.gstzy.pageElement.register.NewPatientElement;
import com.gstzy.section.register.IsDisplayWindow;
import com.gstzy.util.Constant;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.gstzy.pageElement.register.RegisterMenuElement;
public class NewPatient {
    public static void executeClose(WebDriver driver)throws Exception{
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        NewPatientElement patient=new NewPatientElement(driver);
        menu.register().click();
        Thread.sleep(1000);
        menu.registerReportConfirm().click();
        Thread.sleep(1000);
        patient.newPatient().click();
        Thread.sleep(1000);
        patient.cancel().click();
        Assert.assertFalse(driver.getPageSource().contains("新建患者信息"));
        Log.info("取消新建患者");
    }
    public static void executeConfirm(WebDriver driver) throws Exception{
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        NewPatientElement patient=new NewPatientElement(driver);
        menu.register().click();
        Thread.sleep(1000);
        IsDisplayWindow.execute(driver);
        Thread.sleep(1000);
        patient.newPatient().click();
        patient.patientName().sendKeys(Constant.patientName);
        Assert.assertTrue(driver.getPageSource().contains(Constant.patientName));
        patient.patientAge().sendKeys(Constant.patientAge);
        Assert.assertTrue(driver.getPageSource().contains(Constant.patientAge));
        patient.patientPhone().sendKeys(Constant.patientPhone);
        Assert.assertTrue(driver.getPageSource().contains(Constant.patientPhone));
        Thread.sleep(1000);
        patient.confirm().click();
        Assert.assertTrue(driver.getPageSource().contains("新建患者信息"));
        Log.info("新建患者成功");
    }
}
