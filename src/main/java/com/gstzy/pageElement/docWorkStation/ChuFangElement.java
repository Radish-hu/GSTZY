package com.gstzy.pageElement.docWorkStation;

import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChuFangElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\docWork.properties");
    public ChuFangElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement zhongYaoClass() throws Exception {
        return driver.findElement(objectMap.getLocator("zhongYaoClass"));
    }
    public WebElement proNameInput() throws Exception {
        return driver.findElement(objectMap.getLocator("proNameInput"));
    }
    public WebElement zhongYao_JiLiangInput() throws Exception {
        return driver.findElement(objectMap.getLocator("zhongYao_JiLiangInput"));
    }
    public WebElement zhongYao_XiMuYongFaInput() throws Exception {
        return driver.findElement(objectMap.getLocator("zhongYao_XiMuYongFaInput"));
    }
    public WebElement zhongYao_ZhiFaInput() throws Exception {
        return driver.findElement(objectMap.getLocator("zhongYao_ZhiFaInput"));
    }
    public WebElement yongFaInput() throws Exception {
        return driver.findElement(objectMap.getLocator("yongFaInput"));
    }
    public WebElement zhengJiYiZhuInput() throws Exception {
        return driver.findElement(objectMap.getLocator("zhengJiYiZhuInput"));
    }
    public WebElement beiZhuInput() throws Exception {
        return driver.findElement(objectMap.getLocator("beiZhuInput"));
    }
    public WebElement proDelete() throws Exception {
        return driver.findElement(objectMap.getLocator("proDelete"));
    }
    public WebElement proAdd() throws Exception {
        return driver.findElement(objectMap.getLocator("proAdd"));
    }
    public WebElement keLiJiClass() throws Exception {
        return driver.findElement(objectMap.getLocator("keLiJiClass"));
    }
    public WebElement keLiJi_JiLiangInput() throws Exception {
        return driver.findElement(objectMap.getLocator("keLiJi_JiLiangInput"));
    }
    public WebElement keLiJi_xiMuYongFaInput() throws Exception {
        return driver.findElement(objectMap.getLocator("keLiJi_xiMuYongFaInput"));
    }
    public WebElement xieDingFangClass() throws Exception {
        return driver.findElement(objectMap.getLocator("xieDingFangClass"));
    }
    public WebElement xieDingFang_Count() throws Exception {
        return driver.findElement(objectMap.getLocator("xieDingFang_Count"));
    }
    public WebElement zhongXiChengYaoClass() throws Exception {
        return driver.findElement(objectMap.getLocator("zhongXiChengYaoClass"));
    }
    public WebElement zhongXiChengYao_YongFa() throws Exception {
        return driver.findElement(objectMap.getLocator("zhongXiChengYao_YongFa"));
    }
    public WebElement zhongXiChengYao_JiLiang(String jiLiang) throws Exception {
        return driver.findElement(objectMap.getLocator("zhongXiChengYao_JiLiang"));
    }
    public WebElement zhongXiChengYao_CiShu() throws Exception {
        return driver.findElement(objectMap.getLocator("zhongXiChengYao_CiShu"));
    }
    public WebElement zhongXiChengYao_Day() throws Exception {
        return driver.findElement(objectMap.getLocator("zhongXiChengYao_Day"));
    }
    public WebElement zhongXiChengYao_Count() throws Exception {
        return driver.findElement(objectMap.getLocator("zhongXiChengYao_Count"));
    }
    public WebElement zhongXiChengYao_BeiZhu() throws Exception {
        return driver.findElement(objectMap.getLocator("zhongXiChengYao_BeiZhu"));
    }
    public WebElement zhiLiaoClass() throws Exception {
        return driver.findElement(objectMap.getLocator("zhiLiaoClass"));
    }
    public WebElement zhiLiao_Count() throws Exception {
        return driver.findElement(objectMap.getLocator("zhiLiao_Count"));
    }
    public WebElement zhiLiao_XueWei1() throws Exception {
        return driver.findElement(objectMap.getLocator("zhiLiao_XueWei1"));
    }
    public WebElement zhiLiao_XueWei2() throws Exception {
        return driver.findElement(objectMap.getLocator("zhiLiao_XueWei2"));
    }
    public WebElement zhiLiao_XueWei3() throws Exception {
        return driver.findElement(objectMap.getLocator("zhiLiao_XueWei3"));
    }
    public WebElement zhiLiao_XueWeiFang() throws Exception {
        return driver.findElement(objectMap.getLocator("zhiLiao_XueWeiFang"));
    }
    public WebElement jianChaClass() throws Exception {
        return driver.findElement(objectMap.getLocator("jianChaClass"));
    }
    public WebElement jianYanClass() throws Exception {
        return driver.findElement(objectMap.getLocator("jianYanClass"));
    }
    public WebElement jianYan_ProInput() throws Exception {
        return driver.findElement(objectMap.getLocator("jianYan_ProInput"));
    }
    public WebElement otherClass() throws Exception {
        return driver.findElement(objectMap.getLocator("otherClass"));
    }
    public WebElement other_count() throws Exception {
        return driver.findElement(objectMap.getLocator("other_count"));
    }
    public WebElement shiPinClass() throws Exception {
        return driver.findElement(objectMap.getLocator("shiPinClass"));
    }
    public WebElement shiPin_count() throws Exception {
        return driver.findElement(objectMap.getLocator("shiPin_count"));
    }
    public WebElement baoJianPinClass() throws Exception {
        return driver.findElement(objectMap.getLocator("baoJianPinClass"));
    }
    public WebElement baoJianPin_count() throws Exception {
        return driver.findElement(objectMap.getLocator("baoJianPin_count"));
    }
    public WebElement chuFangCopy() throws Exception {
        return driver.findElement(objectMap.getLocator("chuFangCopy"));
    }
    public WebElement chuFangDelete() throws Exception {
        return driver.findElement(objectMap.getLocator("chuFangDelete"));
    }
    public WebElement deleteConfirm() throws Exception {
        return driver.findElement(objectMap.getLocator("deleteConfirm"));
    }
    public WebElement chuFangList() throws Exception {
        return driver.findElement(objectMap.getLocator("chuFangList"));
    }


}
