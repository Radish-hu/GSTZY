package com.gstzy.section.docWorkStation;

import com.gstzy.pageElement.register.LoginElement;
import com.gstzy.util.Constant;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;

public class DoctorLogin {
    public static void execute(WebDriver driver,String username,String password) throws Exception {
        driver.get(Constant.docUrl);
        LoginElement login=new LoginElement(driver);
        login.userName().sendKeys(username);
        login.passWord().sendKeys(password);
        login.submit().click();
        Log.info("医生站登录成功");
        Thread.sleep(3000);
    }
}
