package com.gstzy.testScript.docWorkStation;

import com.gstzy.section.docWorkStation.*;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KaiFangTest {
    public WebDriver driver;
    @BeforeMethod
    public void init(){
        driver= CreateDriver.getDriver();
    }
    @Test
    public void execute(){
        try {
            DoctorLogin.execute(driver, Constant.userName,Constant.passWord);
            PatientJiaoHao.execute(driver);
            Operation.patientZhenDuan(driver);
            ChuFang.zhongYao(driver);
            //ChuFang.keLiJi(driver);
            //ChuFang.xieDingFang(driver);  有误
            //ChuFang.zhongXiChengYao(driver);
            //ChuFang.zhiLiao(driver);
            /*ChuFang.jianCha(driver);
            ChuFang.jianYan(driver);
            ChuFang.other(driver);
            ChuFang.shiPin(driver);
            ChuFang.baoJianPin(driver);
            PrintPreview.execute(driver);*/
            Operation.zhenJie(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}
