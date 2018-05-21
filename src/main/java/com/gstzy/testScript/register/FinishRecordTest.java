package com.gstzy.testScript.register;

import com.gstzy.section.register.Charge;
import com.gstzy.section.register.IsDisplayWindow;
import com.gstzy.section.register.RegisterLogin;
import com.gstzy.section.register.Record;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import com.gstzy.util.KeyBoardUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
    挂号收费系统进行收银台生成未完成订单后再支付并查看打印处方、清单、发票、退款等操作
 */
public class FinishRecordTest {
    public WebDriver driver;
    @BeforeMethod
    public void init(){
        driver= CreateDriver.getDriver();
    }
    @Test
    public void execute() throws Exception {
        RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
        Thread.sleep(1000);
        IsDisplayWindow.execute(driver);
        Charge.unfinishCharge(driver);
        Record.unFinishRecord_QuXiaoDeal(driver);
        Charge.charge(driver);
        Record.details(driver);
        Thread.sleep(2000);
        Record.printChuFang(driver);
        Thread.sleep(1000);
        Record.printQingDan(driver);
        KeyBoardUtil.Esc();
        Record.shouJuFaPiao(driver);
        Thread.sleep(3000);
        Record.backList(driver);
        Thread.sleep(1000);
        Record.chongDa(driver);
        Thread.sleep(1000);
        Record.list_TuiKuan(driver);
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}
