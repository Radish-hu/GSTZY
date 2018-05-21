package com.gstzy.section;
import com.gstzy.pageElement.register.RegisterMenuElement;
import com.gstzy.pageElement.register.CheckVersionElement;
import com.gstzy.util.Constant;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterCheckVersion {
     public static void execute(WebDriver driver) throws Exception {
         RegisterMenuElement menu=new RegisterMenuElement(driver);
         CheckVersionElement checkVersion=new CheckVersionElement(driver);
         //测试环境流程
         /*Thread.sleep(2000);
         menu.logo().click();
         Thread.sleep(1000);*/
         checkVersion.aboutSystem().click();
         String nowVersion=checkVersion.nowVersion().getText();
         try {
             Assert.assertTrue(nowVersion.contains(Constant.newVersion));
             Log.info("版本检测正常");
         }catch (Exception e){
             e.printStackTrace();
             Log.info("版本不正常,当前版本："+nowVersion);
         }
     }
}
