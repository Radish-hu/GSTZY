package com.gstzy.pageElement.register;
import com.gstzy.util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElement {
    private WebElement element=null;
    private ObjectMap objectMap=new ObjectMap("E:\\auto\\gstzy\\src\\main\\java\\com\\gstzy\\register.properties");
    private WebDriver driver;
    public LoginElement(WebDriver driver) {
        this.driver = driver;
    }
    //用户名输入框页面元素对象
    public WebElement userName() throws Exception {
        element=driver.findElement(objectMap.getLocator("login.userName"));
        return element;
    }
    //密码输入框元素对象
    public WebElement passWord() throws Exception {
        element=driver.findElement(objectMap.getLocator("login.password"));
        return element;
    }
    //登录按钮元素对象
    public WebElement submit() throws Exception {
        element=driver.findElement(objectMap.getLocator("login.submit"));
        return element;
    }
}
