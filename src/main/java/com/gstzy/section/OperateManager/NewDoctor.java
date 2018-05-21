package com.gstzy.section.OperateManager;

import com.gstzy.util.Constant;
import org.openqa.selenium.WebDriver;
import com.gstzy.pageElement.OperateManager.*;

public class NewDoctor {
    public static void newDoctor(WebDriver driver) throws Exception {
        NewDoctorElement newDoctorUser=new NewDoctorElement(driver);
        newDoctorUser.docManagerMenu().click();
        newDoctorUser.newDoc().click();
        newDoctorUser.docList().click();
        newDoctorUser.keshi().click();
        newDoctorUser.city().click();
        newDoctorUser.mendian().click();
        newDoctorUser.zhenjin().sendKeys("0");
        newDoctorUser.doctorName().sendKeys(Constant.doctorName);
        newDoctorUser.doctorPhone().sendKeys(Constant.doctorPhone);
        newDoctorUser.zhichen().click();
        newDoctorUser.chuzhenInfo().click();
        newDoctorUser.registerChoose().click();
        newDoctorUser.docSave().click();
    }
}
