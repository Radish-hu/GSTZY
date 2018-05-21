package com.gstzy.testScript;
import com.gstzy.pageElement.register.CheckVersionElement;
import com.gstzy.section.register.RegisterLogin;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VersionTest {
    public WebDriver driver;
    public CheckVersionElement checkVersion;
    @BeforeMethod
    public void init() throws Exception {
        driver= CreateDriver.getDriver();
        RegisterLogin.execute(driver,Constant.userName,Constant.passWord);
        Thread.sleep(2000);
    }
    @Test
    public void versionTest() throws Exception {
        checkVersion=new CheckVersionElement(driver);
        checkVersion.aboutSystem().click();
        Thread.sleep(2000);
        String nowVersion=checkVersion.nowVersion().getText();
        try {
            Assert.assertTrue(nowVersion.equals(Constant.newVersion));
            Log.startTestCase("版本检测正常");
        }catch (Exception e){
            e.printStackTrace();
            Log.error("版本不正常，当前"+nowVersion);
        }
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }

}
