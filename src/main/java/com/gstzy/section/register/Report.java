package com.gstzy.section.register;

import com.gstzy.pageElement.register.RegisterMenuElement;
import com.gstzy.pageElement.register.ReportElement;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Report {
    public static void registerPreview(WebDriver driver) throws Exception {
        ReportElement report=new ReportElement(driver);
        report.report().click();
        report.register_preview().click();
        report.register_make_preview().click();
        if (driver.getPageSource().contains("当前日结已为最新")){
            Log.info("未生成挂号日结");
            Reporter.log("未生成挂号日结");
            chargePreview(driver);
        }else {
            report.register_confirm_preview().click();
            Log.info("挂号日结完成");
            Reporter.log("挂号日结完成");
        }
    }
    public static void chargePreview(WebDriver driver) throws Exception {
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        ReportElement report=new ReportElement(driver);
        report.report().click();
        report.charge_preview_tag().click();
        report.charge_preview().click();
        report.charge_make_preview().click();
        if (driver.getPageSource().contains("当前日结已为最新")){
            Log.info("未生成收费日结");
            Reporter.log("未生成收费日结");
        }else {
            report.charge_confirm_preview().click();
            Log.info("收费日结完成");
            Reporter.log("收费日结完成");
        }
    }
}
