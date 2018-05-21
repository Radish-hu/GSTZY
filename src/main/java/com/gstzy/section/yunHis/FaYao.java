package com.gstzy.section.yunHis;

import com.gstzy.util.Constant;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import com.gstzy.pageElement.yunHis.FaYaoElement;
import org.testng.Reporter;

public class FaYao {
    public static void peiFaYao(WebDriver driver) throws Exception {
        FaYaoElement faYao=new FaYaoElement(driver);
        //faYao.hisPatientName().sendKeys(Constant.patientName);
        faYao.hisPatientPhone().sendKeys(Constant.patientPhone);
        faYao.hisSelectButton().click();
        if (faYao.statusButton().getText().equals("审方")){
            faYao.shenFang().click();
            faYao.shenFangBeiZhu().sendKeys(Constant.beiZhu);
            faYao.shenFangAndStartTiaoJi().click();
            faYao.tiaoJiOver().click();
            faYao.faYaoOver().click();
        }else if (faYao.statusButton().getText().equals("调剂完成")){
            faYao.tiaoJiOver().click();
            faYao.faYaoOver().click();
        }else if (faYao.statusButton().getText().equals("发药完成")){
            faYao.faYaoOver().click();
        }
    }
    public static void chuFangSelect(WebDriver driver) throws Exception {
        FaYaoElement faYao=new FaYaoElement(driver);
        faYao.hisPatientName().sendKeys(Constant.patientName);
        faYao.chuFangSelectButton().click();
        String patientInfo=faYao.chuFangInfo().getText();
        if (patientInfo.contains(Constant.patientName)){
            Log.info("处方查询成功");
            Reporter.log("处方查询成功");
        }else {
            Log.info("处方查询异常");
            Reporter.log("处方查询异常");
        }
    }
}
