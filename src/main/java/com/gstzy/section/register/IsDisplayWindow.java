package com.gstzy.section.register;

import com.gstzy.pageElement.register.RegisterMenuElement;
import org.openqa.selenium.WebDriver;


public class IsDisplayWindow {
    public static void execute(WebDriver driver) throws Exception {
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        Thread.sleep(2000);
        if (driver.getPageSource().contains("请核对本机当前挂号收据号")){
            menu.confirm_registerShouJu().click();
        }else {
            Thread.sleep(2000);
        }
    }
}
