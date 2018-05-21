package com.gstzy.section.docWorkStation;

import com.gstzy.pageElement.docWorkStation.ChuFangElement;
import com.gstzy.util.Constant;
import com.gstzy.util.KeyBoardUtil;
import com.gstzy.util.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class ChuFang {
    public static void zhongYao(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.zhongYaoClass().click();
        Thread.sleep(1000);
        cf.proNameInput().sendKeys(Constant.zhongYao_ProName);
        Thread.sleep(2000);
        KeyBoardUtil.enterKey();
        cf.zhongYao_JiLiangInput().sendKeys(Constant.jiLiang);
        KeyBoardUtil.tabKey();
        cf.zhongYao_XiMuYongFaInput().click();
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        Thread.sleep(2000);
        cf.zhongYao_ZhiFaInput().clear();
        cf.zhongYao_ZhiFaInput().click();
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        cf.yongFaInput().clear();
        cf.yongFaInput().click();
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        cf.zhengJiYiZhuInput().clear();
        cf.zhengJiYiZhuInput().click();
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        cf.beiZhuInput().sendKeys(Constant.beiZhu);
        Log.info("中药饮片开方成功");
        Reporter.log("中药饮片开方成功");
    }
    public static void keLiJi(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.keLiJiClass().click();
        cf.proNameInput().sendKeys(Constant.keLiJi_ProName);
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        cf.keLiJi_JiLiangInput().sendKeys(Constant.jiLiang);
        Thread.sleep(1000);
        cf.keLiJi_xiMuYongFaInput().click();
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        cf.yongFaInput().click();
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        cf.zhengJiYiZhuInput().click();
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        cf.beiZhuInput().sendKeys(Constant.beiZhu);
        Log.info("颗粒剂开方成功");
        Reporter.log("颗粒剂开方成功");
    }
    public static void xieDingFang(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.xieDingFangClass().click();
        cf.proNameInput().sendKeys(Constant.xieDingFang_ProName);
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        cf.xieDingFang_Count().sendKeys(Constant.jiLiang);
        Log.info("协定方开方成功");
        Reporter.log("协定方开方成功");
    }
    public static void zhongXiChengYao(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.zhongXiChengYaoClass().click();
        Thread.sleep(1000);
        cf.proNameInput().sendKeys(Constant.zhongXiChengYao_ProName);
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        cf.zhongXiChengYao_YongFa().click();
        KeyBoardUtil.enterKey();
        cf.zhongXiChengYao_JiLiang(Constant.jiLiang);
        cf.zhongXiChengYao_CiShu().click();
        KeyBoardUtil.enterKey();
        cf.zhongXiChengYao_BeiZhu().sendKeys(Constant.beiZhu);
        Log.info("中西成药开方成功");
        Reporter.log("中西成药开方成功");
    }
    public static void zhiLiao(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.zhiLiaoClass().click();
        cf.proNameInput().sendKeys(Constant.zhiLiao_ProName);
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        cf.zhiLiao_Count().sendKeys(Constant.jiLiang);
        cf.zhiLiao_XueWei1().click();
        KeyBoardUtil.enterKey();
        cf.zhiLiao_XueWei2().click();
        KeyBoardUtil.enterKey();
        cf.zhiLiao_XueWei3().click();
        KeyBoardUtil.enterKey();
        cf.zhiLiao_XueWeiFang().click();
        KeyBoardUtil.enterKey();
        cf.beiZhuInput().sendKeys(Constant.beiZhu);
        Log.info("治疗开方成功");
        Reporter.log("治疗开方成功");
    }
    public static void jianCha(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.jianChaClass().click();
        cf.proNameInput().sendKeys(Constant.jianCha_ProName);
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        Log.info("检查开方成功");
        Reporter.log("检查开方成功");
    }
    public static void jianYan(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.jianYanClass().click();
        cf.proNameInput().sendKeys(Constant.jianYan_ProName);
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        Log.info("检验开方成功");
        Reporter.log("检验开方成功");
    }
    public static void other(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.otherClass().click();
        cf.proNameInput().sendKeys(Constant.other_ProName);
        Thread.sleep(1000);
        cf.other_count().sendKeys(Constant.jiLiang);
        Log.info("其他开方成功");
        Reporter.log("其他开方成功");
    }
    public static void shiPin(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.shiPinClass().click();
        cf.proNameInput().sendKeys(Constant.shiPin_ProName);
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        cf.shiPin_count().sendKeys(Constant.jiLiang);
        Log.info("食品开方成功");
        Reporter.log("食品开方成功");
    }
    public static void baoJianPin(WebDriver driver) throws Exception {
        ChuFangElement cf=new ChuFangElement(driver);
        cf.baoJianPinClass().click();
        cf.proNameInput().sendKeys(Constant.baoJianPin_ProName);
        Thread.sleep(1000);
        KeyBoardUtil.enterKey();
        cf.baoJianPin_count().sendKeys(Constant.jiLiang);
        Log.info("保健品开方成功");
        Reporter.log("保健品开方成功");
    }
}
