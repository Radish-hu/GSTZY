package com.gstzy.util;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class KeyBoardUtil {
    //按tab键的封装方法
    public static void tabKey(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        //调用keyPress方法来实现按下tab键
        robot.keyPress(KeyEvent.VK_TAB);
        //调用keyRelease方法来实现释放tab键
        robot.keyRelease(KeyEvent.VK_TAB);
    }
    //按Enter键的封装方法
    public static void enterKey(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        //调用keyPress方法来实现按下enter键
        robot.keyPress(KeyEvent.VK_ENTER);
        //调用keyRelease方法来实现释放enter键
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    /*将指定字符串设为剪切板的内容，然后执行粘贴操作
    * 将页面焦点切换到输入框后，调用此函数可以将指定字符串粘贴到输入框中*/
    public static void ctrlCAndCtrlV(String string){
        StringSelection stringSelection=new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        //以下4行代码表示按下和释放ctrl+v组合键
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
    public static void F5(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_F5);
        robot.keyRelease(KeyEvent.VK_F5);
    }
    public static void Esc(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }
    public static void F1(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_F1);
        robot.keyRelease(KeyEvent.VK_F1);
    }
    public static void F12(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_F12);
        robot.keyRelease(KeyEvent.VK_F12);
    }
    public static void click_double(){
        Robot robot=null;
        try {
            robot=new Robot();
        }catch (Exception e){
            e.printStackTrace();
        }
        //移动鼠标到(10,20)点
        robot.mouseMove(1790,40);

        robot.mousePress(InputEvent.BUTTON1_MASK);//按下左键

        robot.mouseRelease(InputEvent.BUTTON1_MASK);//释放左键

        robot.delay(100);//停顿100毫秒,即0.1秒

        robot.mousePress(InputEvent.BUTTON1_MASK);//按下左键

        robot.mouseRelease(InputEvent.BUTTON1_MASK);//释放左键
    }
}
