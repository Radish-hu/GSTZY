package com.gstzy.util;
import org.openqa.selenium.*;

public class JavaScript {
    //修改页面属性值
    public static void setAttribute(WebDriver driver, WebElement element,String attributeName,String value){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])",element,attributeName,value);
    }
    //按钮判断
    public static void buttonCheck(WebDriver driver,WebElement element){
        try {
            if (element.isEnabled()&&element.isDisplayed()){
                System.out.println("使用javascript进行页面元素的单击");
                ((JavascriptExecutor)driver).executeScript("arguments[0].click();",element);
            }else {
                System.out.println("页面无法进行单击操作");
            }
        }catch (StaleElementReferenceException e){
            System.out.println("页面元素没有附加在网页中"+e.getStackTrace());
        }catch (NoSuchElementException e){
            System.out.println("页面中没有找到要操作的页面元素"+e.getStackTrace());
        }catch (Exception e){
            System.out.println("无法完成单击动作"+e.getStackTrace());
        }
    }
}
