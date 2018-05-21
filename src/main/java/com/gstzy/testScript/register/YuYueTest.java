package com.gstzy.testScript;

import com.gstzy.section.RegisterCheckVersion;
import com.gstzy.section.register.IsDisplayWindow;
import com.gstzy.section.register.RegisterLogin;
import com.gstzy.section.register.YuYueQuHao;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.gstzy.pageElement.register.RegisterMenuElement;

public class YuYueTest {
    public WebDriver driver;
    @BeforeMethod
    public void init(){
        driver= CreateDriver.getDriver();
    }
    @Test
    public void execute() throws Exception {
        RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
        RegisterCheckVersion.execute(driver);
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        menu.register().click();
        IsDisplayWindow.execute(driver);
        YuYueQuHao.execute(driver);
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}
