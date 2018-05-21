package com.gstzy.section.yunHis;

import com.gstzy.pageElement.register.LoginElement;
import com.gstzy.util.Constant;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class YunHisLogin {
    public static void login(WebDriver driver,String userName,String passWord) throws Exception {
        LoginElement login=new LoginElement(driver);
        driver.get(Constant.yunHisUrl);
        login.userName().sendKeys(userName);
        login.passWord().sendKeys(passWord);
        login.submit().click();
        Thread.sleep(2000);
        if (driver.getPageSource().contains("关于系统")){
            Log.info("云药房登录成功");
            Reporter.log("云药房登录成功");
        }else {
            Log.info("云药房登录异常");
        }
    }
}
