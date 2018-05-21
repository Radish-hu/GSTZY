package com.gstzy.section.OperateManager;

import com.gstzy.pageElement.OperateManager.NewDoctorElement;
import org.openqa.selenium.WebDriver;

public class OperationLogin {
    public static void login(WebDriver driver,String username,String password) throws Exception {
        NewDoctorElement doctorLogin=new NewDoctorElement(driver);
        doctorLogin.loginUser().sendKeys(username);
        doctorLogin.loginPassword().sendKeys(password);
        doctorLogin.loginButton().click();
    }
}
