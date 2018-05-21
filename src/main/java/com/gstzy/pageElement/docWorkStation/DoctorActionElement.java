package com.gstzy.pageElement.docWorkStation;
import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoctorActionElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\docWork.properties");
    public DoctorActionElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement chuFangTag() throws Exception {
        return driver.findElement(objectMap.getLocator("chuFangTag"));
    }
    public WebElement yiZhenPatientTag() throws Exception {
        return driver.findElement(objectMap.getLocator("yiZhenPatientTag"));
    }
    public WebElement yiZhenPatient_xuZhen() throws Exception {
        return driver.findElement(objectMap.getLocator("yiZhenPatient_xuZhen"));
    }
    public WebElement weiZhenPatientCount() throws Exception {
        return driver.findElement(objectMap.getLocator("weiZhenPatientCount"));
    }
    //已诊病人列表-查看
    public WebElement yiZhenPatientSee() throws Exception {
        return driver.findElement(objectMap.getLocator("yiZhenPatient_See"));
    }
    public WebElement yiZhenPatientStatus() throws Exception {
        return driver.findElement(objectMap.getLocator("yiZhenPatientStatus"));
    }
    public WebElement yiZhenPatient_name() throws Exception {
        return driver.findElement(objectMap.getLocator("yiZhenPatient_name"));
    }
    public WebElement yiZhenPatient_phone() throws Exception {
        return driver.findElement(objectMap.getLocator("yiZhenPatient_phone"));
    }
    public WebElement yiZhenPatient_selectButton() throws Exception {
        return driver.findElement(objectMap.getLocator("yiZhenPatient_selectButton"));
    }
    public WebElement kuaiSuTongDaoTag() throws Exception {
        return driver.findElement(objectMap.getLocator("kuaiSuTongDaoTag"));
    }
    public WebElement jiuZhenStatus() throws Exception {
        return driver.findElement(objectMap.getLocator("jiuZhenStatus"));
    }
    public WebElement jiaoZhen() throws Exception {
        return driver.findElement(objectMap.getLocator("jiaoZhen"));
    }
    public WebElement patientInfoButton() throws Exception {
        return driver.findElement(objectMap.getLocator("patientInfoButton"));
    }
    public WebElement patientInfoConfirm() throws Exception {
        return driver.findElement(objectMap.getLocator("patientInfoConfirm"));
    }
    public WebElement guoHao() throws Exception {
        return driver.findElement(objectMap.getLocator("guoHao"));
    }
    public WebElement printPreview() throws Exception {
        return driver.findElement(objectMap.getLocator("printPreview"));
    }
    public WebElement printClose() throws Exception {
        return driver.findElement(objectMap.getLocator("printClose"));
    }
    public WebElement zhenJie() throws Exception {
        return driver.findElement(objectMap.getLocator("zhenJie"));
    }
    public WebElement save() throws Exception {
        return driver.findElement(objectMap.getLocator("save"));
    }
    public WebElement clear() throws Exception {
        return driver.findElement(objectMap.getLocator("clear"));
    }
    public WebElement jiXuKanZhen() throws Exception {
        return driver.findElement(objectMap.getLocator("jiXuKanZhen"));
    }
    public WebElement noDiagnosisList() throws Exception {
        return driver.findElement(objectMap.getLocator("noDiagnosisList"));
    }
    public WebElement selectBingLi() throws Exception {
        return driver.findElement(objectMap.getLocator("selectBingLi"));
    }
    public WebElement dangAnBack() throws Exception {
        return driver.findElement(objectMap.getLocator("dangAn_back"));
    }
}
