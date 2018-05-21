package com.gstzy.section.yunHis;

import com.gstzy.util.Constant;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import com.gstzy.pageElement.yunHis.YunHisCheckVersionElement;
import org.testng.Reporter;

public class YunHisCheckVersin {
    public static void execute(WebDriver driver) throws Exception {
        YunHisCheckVersionElement check=new YunHisCheckVersionElement(driver);
        check.hisAboutSystem().click();
        String nowVersion=check.hisNowVersion().getText();
        if (nowVersion.contains(Constant.yunHisNewVersion)){
            Log.info("云药房版本正常"+nowVersion);
            Reporter.log("云药房版本正常"+nowVersion);
        }else {
            Log.info("云药房版本异常，当前版本："+nowVersion);
            Reporter.log("云药房版本异常，当前版本："+nowVersion);
        }
    }
}
