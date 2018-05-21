package com.gstzy.section.docWorkStation;

import com.gstzy.pageElement.docWorkStation.BingLiElement;
import com.gstzy.pageElement.docWorkStation.ChuFangElement;
import com.gstzy.pageElement.docWorkStation.DoctorActionElement;
import com.gstzy.util.Constant;
import com.gstzy.util.KeyBoardUtil;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Operation {
    //处方 +
    public static void chuFangCopy(WebDriver driver) throws Exception {
       ChuFangElement cf=new ChuFangElement(driver);
       cf.chuFangCopy().click();
    }
    //处方 x
    public static void chuFangDelete(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.chuFangDelete().click();
        cf.deleteConfirm().click();
    }
    //诊结
    public static void zhenJie(WebDriver driver) throws Exception {
        DoctorActionElement doctor=new DoctorActionElement(driver);
        doctor.zhenJie().click();
        Thread.sleep(1000);
        if (driver.getPageSource().contains("诊结成功")){
            Log.info("诊结完成");
            Reporter.log("诊结完成");
        }else {
            Log.info("诊结按钮未操作");
            Reporter.log("诊结按钮未操作");
        }
    }
    //过号
    public static void guoHao(WebDriver driver) throws Exception {
        DoctorActionElement doctor=new DoctorActionElement(driver);
        doctor.guoHao().click();
    }
    //项目删除
    public static void proDelete(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.proDelete().click();
    }
    //项目添加
    public static void proAdd(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.proAdd().click();
    }
    //未诊病人列表
    public static void noDiagnosisList(WebDriver driver) throws Exception {
        DoctorActionElement doctor=new DoctorActionElement(driver);
        doctor.noDiagnosisList().click();
        if (driver.getPageSource().contains("未诊病人列表")){
            Log.info("未诊病人列表");
        }else {
            Log.info("未诊病人列表未弹出");
        }
        Thread.sleep(1000);
        KeyBoardUtil.Esc();
    }
    //搜索其他患者病历
    public static void selectBingLi(WebDriver driver) throws Exception {
        DoctorActionElement doctor=new DoctorActionElement(driver);
        doctor.selectBingLi().click();
        if (driver.getPageSource().contains("搜索其他患者病历")){
            Log.info("搜索其他患者病历");
        }else {
            Log.info("搜索其他患者病历未弹出");
        }
        Thread.sleep(1000);
        KeyBoardUtil.Esc();
    }
    //已诊病人tag
    public static void yiZhenPatientTag(WebDriver driver) throws Exception {
        DoctorActionElement doctor=new DoctorActionElement(driver);
        ChuFangElement cf=new ChuFangElement(driver);
        doctor.yiZhenPatientTag().click();
    }
    //已诊病人查看操作
    public static void yiZhenPatientSee(WebDriver driver) throws Exception {
        DoctorActionElement doctor=new DoctorActionElement(driver);
        doctor.yiZhenPatientSee().click();
        if (driver.getPageSource().contains("患者信息")){
            Log.info("通过已诊病人查看进入档案页面");
            Reporter.log("通过已诊病人查看进入档案页面");
        }else {
            Log.info("已诊病人查看操作异常");
            Reporter.log("已诊病人查看操作异常");
        }
        doctor.dangAnBack();
    }
    //打印预览
    public static void printPreview(WebDriver driver){
        DoctorActionElement doctor=new DoctorActionElement(driver);
        try {
            doctor.printPreview().click();
            Thread.sleep(1000);
            if (driver.getPageSource().contains("复合病历")){
                Log.info("弹出打印预览页面");
                Reporter.log("弹出打印预览页面");
                doctor.printClose();
            }else {
                doctor.printClose();
                Log.info("打印预览弹窗异常");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //病例信息维护
    public static void patientBingLiSave(WebDriver driver) throws Exception {
        DoctorActionElement doctor=new DoctorActionElement(driver);
        BingLiElement patient=new BingLiElement(driver);
        doctor.patientInfoButton().click();
        Thread.sleep(1000);
        doctor.patientInfoConfirm().click();
        Log.info("用户信息弹窗正常");
        Operation.noDiagnosisList(driver);
        Operation.selectBingLi(driver);
        patient.zhuSu().sendKeys(Constant.zhuSu);
        patient.xianBingShi().sendKeys(Constant.xianBingShi);
        patient.guoMinShi().sendKeys(Constant.guoMinShi);
        patient.jiWangShiCheckBox().click();
        patient.jiWangShi().sendKeys(Constant.jiWangShi);
        patient.jiaZuShiCheckBox().click();
        patient.jiaZuShi().sendKeys(Constant.jiaZuShi);
        patient.jingDaiTaiChanShiCheckBox().click();
        patient.jingDaiTaiChanShi().click();
        patient.jingDaiTaiChanShiInput().sendKeys(Constant.jingDaiTaiChanShi);
        patient.tiGeCheckBox().click();
        patient.T().sendKeys(Constant.T);
        patient.P().sendKeys(Constant.P);
        patient.R().sendKeys(Constant.R);
        patient.BP_before().sendKeys(Constant.BP_before);
        patient.BP_after().sendKeys(Constant.BP_after);
        patient.sheZhi().click();
        KeyBoardUtil.enterKey();
        patient.sheTai().click();
        KeyBoardUtil.enterKey();
        patient.maiXiang().click();
        KeyBoardUtil.enterKey();
        patient.tiGeCheckInput().sendKeys(Constant.tiGeCheck);
        patient.fuZhuCheckBox().click();
        patient.fuZhuCheckInput().sendKeys(Constant.fuZhuCheck);
        patient.chuLi().sendKeys(Constant.chuLi);
        doctor.save();
        Thread.sleep(2000);
        Log.info("保存病历成功");
    }
    //病例清除
    public static void patientBingLiClear(WebDriver driver) throws Exception {
        DoctorActionElement doctor=new DoctorActionElement(driver);
        BingLiElement patient=new BingLiElement(driver);
        patient.zhuSu().sendKeys(Constant.zhuSu);
        doctor.clear().click();
        if (patient.zhuSu().getText()!=Constant.zhuSu){
            Log.info("清除病历信息成功");
        }
    }
    //诊断
    public static void patientZhenDuan(WebDriver driver) throws Exception {
        DoctorActionElement doctor=new DoctorActionElement(driver);
        BingLiElement patient=new BingLiElement(driver);
        if (patient.zhongYiZhenDuan().getText()==null&&patient.xiYiZhenDuan().getText()==null){
            patient.zhongYiZhenDuan().click();
            Thread.sleep(1000);
            KeyBoardUtil.enterKey();
            patient.xiYiZhenDuan().click();
            Thread.sleep(1000);
            KeyBoardUtil.enterKey();
            doctor.save().click();
            Log.info("诊断录入正常");
        }else{
            Thread.sleep(1000);
            doctor.chuFangTag().click();
        }
    }
}
