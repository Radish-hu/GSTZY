package com.gstzy.testScript.OperateManager;

import com.gstzy.section.OperateManager.NewDoctor;
import com.gstzy.section.OperateManager.OperationLogin;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OperationTest {
    public WebDriver driver;
    @BeforeMethod
    public void init(){
        driver= CreateDriver.getDriver();
        driver.get(Constant.operationManager);
    }
    @Test
    public void execute() throws Exception {
        OperationLogin.login(driver, Constant.userName,Constant.passWord);
        NewDoctor.newDoctor(driver);
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}
