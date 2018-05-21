package com.gstzy.testScript.register;

import com.gstzy.pageElement.register.RegisterMenuElement;
import com.gstzy.section.register.Charge;
import com.gstzy.section.register.IsDisplayWindow;
import com.gstzy.section.register.RegisterLogin;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChargeTest {
    public WebDriver driver;
    @BeforeMethod
    public void init(){
        driver= CreateDriver.getDriver();
    }
    @Test
    public void charge() throws Exception {
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
        Thread.sleep(2000);
        IsDisplayWindow.execute(driver);
        Thread.sleep(2000);
        Charge.charge(driver);
    }
    @Test(enabled = false)
    public void unfinishCharge() throws Exception {
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
        Thread.sleep(2000);
        IsDisplayWindow.execute(driver);
        Thread.sleep(2000);
        Charge.unfinishCharge(driver);
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}
