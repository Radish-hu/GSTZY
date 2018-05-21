package com.gstzy.testScript.yunHis;

import com.gstzy.section.yunHis.YunHisCheckVersin;
import com.gstzy.section.yunHis.YunHisLogin;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YunHisCheckVersionTest {
    public WebDriver driver;
    @BeforeMethod
    public void init(){
        driver= CreateDriver.getDriver();
    }
    @Test
    public void execute() throws Exception {
        YunHisLogin.login(driver, Constant.userName,Constant.passWord);
        YunHisCheckVersin.execute(driver);
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}
