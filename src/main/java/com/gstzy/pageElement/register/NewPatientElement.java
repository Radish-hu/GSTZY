package com.gstzy.pageElement.register;
import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewPatientElement {
    public WebDriver driver;
    public ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\register.properties");
    public NewPatientElement(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement newPatient() throws Exception {
        return driver.findElement(objectMap.getLocator("newPatient"));
    }
    public WebElement patientName() throws Exception {
        return driver.findElement(objectMap.getLocator("newPatientName"));
    }
    public WebElement patientAge() throws Exception {
        return driver.findElement(objectMap.getLocator("newPatientAge"));
    }
    public WebElement patientPhone() throws Exception {
        return driver.findElement(objectMap.getLocator("newPatientPhone"));
    }
    public WebElement cancel() throws Exception {
        return driver.findElement(objectMap.getLocator("cancel"));
    }
    public WebElement confirm() throws Exception {
        return driver.findElement(objectMap.getLocator("confirm"));
    }
}
