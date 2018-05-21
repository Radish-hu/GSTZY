package com.gstzy.section.register;

import com.gstzy.util.Constant;
import com.gstzy.util.KeyBoardUtil;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import com.gstzy.pageElement.register.RegisterMenuElement;
import com.gstzy.pageElement.register.ChargeElement;
import org.testng.Reporter;

public class Charge {
    public static void charge(WebDriver driver) throws Exception {
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        ChargeElement charge=new ChargeElement(driver);
        Thread.sleep(2000);
        menu.charge().click();
        IsDisplayWindow.execute(driver);
        Thread.sleep(1000);
        charge.charge_PatientPhone().sendKeys(Constant.patientPhone);
        charge.charge_selectButton().click();
        Thread.sleep(1000);
        charge.charge_chargeListButton().click();
        charge.charge_FeiBie().click();
        KeyBoardUtil.enterKey();
        Thread.sleep(1000);
        charge.charge_saveAndCharge().click();
        Thread.sleep(1000);
        charge.charge_inputMoneyButton().click();
        KeyBoardUtil.F12();
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        Thread.sleep(1000);
        Log.info("收费完成");
        Reporter.log("收费完成");
    }
    public static void unfinishCharge(WebDriver driver) throws Exception {
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        ChargeElement charge=new ChargeElement(driver);
        Thread.sleep(2000);
        IsDisplayWindow.execute(driver);
        menu.charge().click();
        Thread.sleep(1000);
        charge.charge_PatientPhone().sendKeys(Constant.patientPhone);
        charge.charge_selectButton().click();
        Thread.sleep(1000);
        charge.charge_chargeListButton().click();
        charge.charge_FeiBie().click();
        KeyBoardUtil.enterKey();
        Thread.sleep(1000);
        charge.charge_saveAndCharge().click();
        Thread.sleep(2000);
        KeyBoardUtil.F5();
        Log.info("收银台按F5生成未支付订单完成");
        Reporter.log("收银台按F5生成未支付订单完成");
    }
}
