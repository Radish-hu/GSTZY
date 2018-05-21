package com.gstzy.section.docWorkStation;
import com.gstzy.pageElement.docWorkStation.CheckVersionElement;
import com.gstzy.util.Constant;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;

public class DoctorCheckVersion {
    public static void execute(WebDriver driver) throws Exception {
        CheckVersionElement checkVersion=new CheckVersionElement(driver);
        checkVersion.aboutSystem().click();
        String newVersion= Constant.newVersion;
        String nowVersion=checkVersion.nowVersion().getText();
        if (nowVersion.equals(newVersion)){
            Log.info("当前版本正常"+nowVersion);
        }else {
            Log.info("版本不正常"+nowVersion);
        }
    }
}
