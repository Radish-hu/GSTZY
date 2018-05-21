package com.gstzy.section;
import com.gstzy.pageElement.register.RegisterMenuElement;
import com.gstzy.pageElement.register.RegisterElement;
import com.gstzy.section.register.IsDisplayWindow;
import com.gstzy.util.Constant;
import com.gstzy.util.KeyBoardUtil;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;


public class Register {
    public static void execute(WebDriver driver) throws Exception {
        RegisterElement register=new RegisterElement(driver);
        Thread.sleep(1000);
        register.patientPhone().sendKeys(Constant.patientPhone);
        Thread.sleep(1000);
        register.patientName().sendKeys(Constant.patientName);
        register.selectButton().click();
        Thread.sleep(1000);
        register.docName().sendKeys(Constant.docName);
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        Thread.sleep(1000);
        register.firstSource().click();
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        Thread.sleep(1000);
        register.saveAndCharge().click();
        Thread.sleep(1000);
        register.inputMoneyButton().click();
        Thread.sleep(1000);
        KeyBoardUtil.F12();
        Log.info("挂号成功");
    }
}
