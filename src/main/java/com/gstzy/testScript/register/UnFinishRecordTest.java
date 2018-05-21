package com.gstzy.testScript.register;

import com.gstzy.pageElement.register.LoginElement;
import com.gstzy.section.register.RegisterLogin;
import com.gstzy.section.register.Record;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*未完成列表取消订单*/
public class UnFinishRecordTest {
    public WebDriver driver;
    public LoginElement login;
    @BeforeMethod
    public void beforeMethod(){
        driver= CreateDriver.getDriver();
        driver.get(Constant.guaHaoUrl);
    }
    @Test
    public void execute() throws Exception {
        RegisterLogin.execute(driver,Constant.userName,Constant.passWord);
        Thread.sleep(1000);
        Record.unFinishRecord_QuXiaoDeal(driver);
    }
    @AfterMethod
    public void destry(){
        driver.quit();
    }
}
