package com.gstzy.testScript.docWorkStation;

import com.gstzy.section.docWorkStation.DoctorLogin;
import com.gstzy.section.docWorkStation.Operation;
import com.gstzy.section.docWorkStation.PatientJiaoHao;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PatientBingLiTest {
    public WebDriver driver;
    @BeforeMethod
    public void init() throws Exception {
        driver= CreateDriver.getDriver();
    }
    @Test
    public void execute() throws Exception {
        DoctorLogin.execute(driver, Constant.userName,Constant.passWord);
        //DoctorCheckVersion.execute(driver);
        PatientJiaoHao.execute(driver);
        Operation.patientZhenDuan(driver);
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}
