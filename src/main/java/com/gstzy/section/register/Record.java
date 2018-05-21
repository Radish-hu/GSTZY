package com.gstzy.section.register;
import com.gstzy.pageElement.register.RecordElement;
import com.gstzy.pageElement.register.RegisterElement;
import com.gstzy.pageElement.register.RegisterMenuElement;
import com.gstzy.util.Constant;
import com.gstzy.util.KeyBoardUtil;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Record {
    public static void details(WebDriver driver) throws Exception {
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        RecordElement record=new RecordElement(driver);
        Thread.sleep(1000);
        IsDisplayWindow.execute(driver);
        Thread.sleep(1000);
        menu.record().click();
        Thread.sleep(1000);
        record.record_PatientPhone().sendKeys(Constant.patientPhone);
        record.record_SelectButton().click();
        Thread.sleep(1000);
        record.record_details().click();
        Thread.sleep(1000);
    }
    public static void printChuFang(WebDriver driver) throws Exception {
        RecordElement record=new RecordElement(driver);
        record.record_details_ChuFangQingDan().click();
        Thread.sleep(1000);
        record.record_details_PrintChuFang().click();
        if (record.record_info().getText().contains("1张处方，共 1 页，当前打印第1页")){
            Log.info("打印处方成功");
            Reporter.log("打印处方成功");
        }else {
            Log.info("打印处方失败");
        }
        KeyBoardUtil.Esc();
        Thread.sleep(1000);
    }
    public static void printQingDan(WebDriver driver) throws Exception {
        RecordElement record=new RecordElement(driver);
        record.record_details_ChuFangQingDan().click();
        Thread.sleep(1000);
        record.record_details_PrintQingDan().click();
        if (driver.getPageSource().contains("打印错误")){
            Log.info("打印清单成功");
            Reporter.log("打印清单成功");
        }else {
            Log.info("打印清单失败");
        }
        KeyBoardUtil.Esc();
        Thread.sleep(1000);
    }
    public static void shouJuFaPiao(WebDriver driver) throws Exception {
        RecordElement record=new RecordElement(driver);
        record.record_details_FaPiaoButton().click();
        Thread.sleep(2000);
        record.record_details_FaPiaoChoose().click();
        record.record_details_FaPiaoPrint().click();
        if (driver.getPageSource().contains("打印成功")){
            Log.info("打印发票成功");
            Reporter.log("打印发票成功");
        }else {
            Log.info("打印发票失败");
        }
    }
    public static void details_TuiKuan(WebDriver driver) throws Exception {
        RecordElement record=new RecordElement(driver);
        record.record_details_TuiKuan().click();
        Thread.sleep(1000);
        record.record_details_TuiKuanConfirm().click();
        if (record.record_details_dealStatus().getText().contains("退款中")){
            Log.info("收费详情退款操作成功");
            Reporter.log("收费详情退款操作成功");
        }else {
            Log.info("收费详情退款操作失败");
            Reporter.log("收费详情退款操作失败");
        }
    }
    public static void chongDa(WebDriver driver) throws Exception {
        RecordElement record=new RecordElement(driver);
        record.record_ChongDa().click();
        record.record_details_FaPiaoChoose().click();
        record.record_details_FaPiaoPrint().click();
        if (driver.getPageSource().contains("打印错误")){
            Log.info("打印发票成功");
            Reporter.log("打印发票成功");
        }else {
            Log.info("打印发票失败");
        }
    }
    public static void list_TuiKuan(WebDriver driver) throws Exception {
        RecordElement record=new RecordElement(driver);
        record.record_TuiKuan().click();
        record.record_details_TuiKuanConfirm().click();
        if (record.record_dealListStatus().getText().contains("退款中")){
            Log.info("列表退款操作成功");
            Reporter.log("列表退款操作成功");
        }else {
            Log.info("列表退款操作失败");
            Reporter.log("列表退款操作失败");
        }
    }
    public static void unFinishRecord_QuXiaoDeal(WebDriver driver) throws Exception {
        RecordElement record=new RecordElement(driver);
        RegisterMenuElement menu=new RegisterMenuElement(driver);
        Thread.sleep(2000);
        IsDisplayWindow.execute(driver);
        Thread.sleep(2000);
        menu.record().click();
        record.unfinishRecord_tag().click();
        record.record_PatientPhone().sendKeys(Constant.patientPhone);
        record.unfinishRecord_selectButton().click();
        if (record.unfinishRecord_status().getText().contains("未完成")){
            record.unfinishRecord_details().click();
            Thread.sleep(2000);
            record.unfinishRecord_QuXiaoDeal().click();
            Thread.sleep(1000);
            record.unfinishRecord_QuXiaoDeal_confirm().click();
            Thread.sleep(1000);
            if (driver.getPageSource().contains("输入电脑号[F7]")){
                Log.info("取消订单成功");
                Reporter.log("取消订单成功");
            }else {
                Log.info("取消订单不成功");
                Reporter.log("取消订单不成功");
            }
        }
    }
    public static void unFinishRecord_jiXuPay(WebDriver driver) throws Exception {
        RecordElement record=new RecordElement(driver);
        RegisterElement register=new RegisterElement(driver);
        record.unfinishRecord_tag().click();
        if (record.unfinishRecord_status().getText().contains("未完成")){
            record.unfinishRecord_details().click();
            record.unfinishRecord_jiXuPay().click();
            register.inputMoneyButton().click();
            KeyBoardUtil.F12();
            if (driver.getPageSource().contains("订单完成支付")){
                Log.info("订单支付成功");
                Reporter.log("订单支付成功");
            }else {
                Log.info("订单支付不成功");
                Reporter.log("订单支付不成功");
            }
        }
    }
    public static void backList(WebDriver driver) throws Exception {
        RecordElement record=new RecordElement(driver);
        record.record_back().click();
    }
}
