package com.gstzy.testScript.docWorkStation;

import com.gstzy.section.docWorkStation.DoctorLogin;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorLoginTest {
    public WebDriver driver;
    @BeforeMethod
    public void init(){
        driver= CreateDriver.getDriver();
    }
    @Test
    public void execute() throws Exception {
        DoctorLogin.execute(driver, Constant.userName,Constant.passWord);
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}
