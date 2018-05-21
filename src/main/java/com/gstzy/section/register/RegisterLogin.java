package com.gstzy.section.register;

import com.gstzy.pageElement.register.LoginElement;
import com.gstzy.util.Constant;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;

public class RegisterLogin {
    public static void execute(WebDriver driver, String userName, String passWord) throws Exception {
        LoginElement login=new LoginElement(driver);
        driver.get(Constant.guaHaoUrl);
        login.userName().sendKeys(userName);
        login.passWord().sendKeys(passWord);
        login.submit().click();
        Log.info("挂号收费系统登录成功");
    }
}
