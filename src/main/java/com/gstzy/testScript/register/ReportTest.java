package com.gstzy.testScript.register;

import com.gstzy.pageElement.register.RegisterMenuElement;
import com.gstzy.section.register.IsDisplayWindow;
import com.gstzy.section.register.RegisterLogin;
import com.gstzy.section.register.Report;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReportTest {
    public WebDriver driver;
    @BeforeMethod
    public void init(){
        driver= CreateDriver.getDriver();
    }
    @Test(priority = 1)
    public void execute() throws Exception {
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
        Thread.sleep(3000);
        IsDisplayWindow.execute(driver);
        Thread.sleep(1000);
        Report.registerPreview(driver);
    }
    @Test(priority = 2)
    public void execute1() throws Exception {
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
        Thread.sleep(3000);
        IsDisplayWindow.execute(driver);
        Thread.sleep(1000);
        Report.chargePreview(driver);
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}
