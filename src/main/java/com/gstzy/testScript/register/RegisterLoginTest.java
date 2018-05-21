package com.gstzy.testScript;
import com.gstzy.pageElement.register.LoginElement;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class RegisterLoginTest {
    public WebDriver driver;
    public LoginElement login;
    @BeforeMethod
    public void beforeMethod(){
        driver= CreateDriver.getDriver();
        driver.get(Constant.guaHaoUrl);
    }
    @Test
    public void loginExe() throws Exception {
        login=new LoginElement(driver);
        login.userName().sendKeys(Constant.userName);
        login.passWord().sendKeys(Constant.passWord);
        login.submit().click();
        Log.startTestCase("登录成功");
    }
    @AfterMethod
    public void destry(){
        driver.quit();
    }
}
