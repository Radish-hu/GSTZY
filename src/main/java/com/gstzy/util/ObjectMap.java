package com.gstzy.util;
import org.openqa.selenium.By;
import java.io.FileInputStream;
import java.util.Properties;

public class ObjectMap {
    Properties properties;
    public ObjectMap(String propFile){
        properties=new Properties();
        try {
            FileInputStream in=new FileInputStream(propFile);
            properties.load(in);
            in.close();
        }catch (Exception e){
            System.out.println("读取对象文件出错");
            e.printStackTrace();
        }
    }
    public By getLocator(String elementNameInpropFile) throws Exception {
        //根据变量elementNameInpropFile，从属性配置文件中读取对应的配置对象
        String locator=properties.getProperty(elementNameInpropFile);
        //将配置对象中的定位类型存到locatorType变量，将定位表达式的值存入locatorValue变量
        String locatorType=locator.split(">")[0];
        String locatorValue=locator.split(">")[1];
        locatorValue=new String(locatorValue.getBytes("ISO-8859-1"),"UTF-8");
        //System.out.println("获取的定位类型："+locatorType+"/t 获取的定位表达式："+locatorValue);

        //根据locatorType变量值的内容判断返回何种定位方式的By对象
        if (locatorType.toLowerCase().equals("id")){
            return By.id(locatorValue);
        }else if (locatorType.toLowerCase().equals("name")){
            return By.name(locatorValue);
        }else if (locatorType.toLowerCase().equals("className")){
            return By.className(locatorValue);
        }else if (locatorType.toLowerCase().equals("tagName")){
            return By.tagName(locatorValue);
        }else if (locatorType.toLowerCase().equals("linkText")){
            return By.linkText(locatorValue);
        }else if (locatorType.toLowerCase().equals("partialLinkText")){
            return By.partialLinkText(locatorValue);
        }else if (locatorType.toLowerCase().equals("cssSelector")||locatorType.toLowerCase().equals("css")){
            return By.cssSelector(locatorValue);
        }else if (locatorType.toLowerCase().equals("xpath")){
            return By.xpath(locatorValue);
        }else {
            throw new Exception("输入的locator type未在程序中定义："+locatorType);
        }
    }
}
