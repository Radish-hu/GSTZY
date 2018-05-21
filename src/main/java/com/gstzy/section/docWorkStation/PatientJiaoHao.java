package com.gstzy.section.docWorkStation;

import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import com.gstzy.pageElement.docWorkStation.DoctorActionElement;
import com.gstzy.pageElement.docWorkStation.DocMenuElement;

public class PatientJiaoHao {
    public static void execute(WebDriver driver) throws Exception {
        DoctorActionElement doctor=new DoctorActionElement(driver);
        DocMenuElement menu=new DocMenuElement(driver);
        menu.menZhenMenu().click();
        if (!doctor.weiZhenPatientCount().getText().contains("0")){
            if (doctor.jiuZhenStatus().getText().equals("候诊")){
                doctor.jiaoZhen().click();
                Log.info("叫号操作");
                Thread.sleep(1000);
                doctor.patientInfoConfirm().click();
                doctor.noDiagnosisList().click();
                doctor.selectBingLi().click();
                Operation.patientBingLiSave(driver);
                Operation.patientZhenDuan(driver);
                ChuFang.zhongYao(driver);
                Thread.sleep(2000);
                Operation.printPreview(driver);
                Operation.zhenJie(driver);
            }else if (doctor.jiuZhenStatus().getText().equals("应诊")) {
                doctor.jiXuKanZhen().click();
                Log.info("继续看诊操作");
                Thread.sleep(1000);
                doctor.patientInfoConfirm().click();
                doctor.noDiagnosisList().click();
                doctor.selectBingLi().click();
                Thread.sleep(3000);
                doctor.chuFangTag().click();
                ChuFang.zhongYao(driver);
                Thread.sleep(2000);
                Operation.printPreview(driver);
                Operation.zhenJie(driver);
            }
        } else{
            Operation.yiZhenPatientTag(driver);
            Operation.yiZhenPatientSee(driver);
            doctor.yiZhenPatient_xuZhen().click();
            Thread.sleep(3000);
            doctor.chuFangTag().click();
            ChuFang.zhongYao(driver);
            Operation.zhenJie(driver);
            Log.info("已诊病人续诊");
        }
    }
}
