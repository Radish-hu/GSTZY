package com.gstzy.testScript;
import com.gstzy.pageElement.register.NewPatientElement;
import com.gstzy.pageElement.register.RegisterElement;
import com.gstzy.section.register.RegisterLogin;
import com.gstzy.section.NewPatient;
import com.gstzy.section.Register;
import com.gstzy.section.register.YuYueQuHao;
import com.gstzy.util.Constant;
import com.gstzy.util.CreateDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest {
    private WebDriver driver;
    private NewPatientElement patien;
    private RegisterElement register;
    @BeforeMethod
    public void init(){
     driver= CreateDriver.getDriver();
    }
    @Test
    public void execute() {
        try {
            RegisterLogin.execute(driver, Constant.userName,Constant.passWord);
            Thread.sleep(2000);
            //DoctorCheckVersion.execute(driver);
            NewPatient.executeConfirm(driver);
            Register.execute(driver);
            YuYueQuHao.execute(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}
