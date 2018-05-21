package com.gstzy.section.register;

import com.gstzy.util.Constant;
import com.gstzy.util.KeyBoardUtil;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import com.gstzy.pageElement.register.YuYueElement;
public class YuYueQuHao {
    public static void execute(WebDriver driver) throws Exception {
        YuYueElement yy=new YuYueElement(driver);
        Thread.sleep(1000);
        KeyBoardUtil.F1();
        yy.yuYuePhone().sendKeys(Constant.patientPhone);
        yy.yuYueSelectButton().click();
        yy.yuYueFirstSource().click();
        KeyBoardUtil.enterKey();
        yy.yuYueSaveAndCharge().click();
        if (driver.getPageSource().contains("已支付")){
            yy.yuYueConfirm().click();
            Log.info("已支付状态取号成功");
        }else {
            yy.yuYueConfirm().click();
            yy.yuYueInputMoneyButton().click();
            yy.yuYueChargeButton().click();
            Log.info("未支付状态操作支付后取号成功");
        }

    }
}
