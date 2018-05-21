package com.gstzy.testScript;

import com.gstzy.section.register.RegisterLogin;
import com.gstzy.section.NewPatient;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class NewPatientTest {
    public WebDriver driver;
    @Test(priority = 1)
    public void executeClose() throws Exception {
        driver= CreateDriver.getDriver();
        RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
        NewPatient.executeClose(driver);
    }
    @Test(priority = 2)
    public void executeConfirm() throws Exception {
        driver=CreateDriver.getDriver();
        RegisterLogin.execute(driver,Constant.userName,Constant.passWord);
        NewPatient.executeConfirm(driver);
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}
