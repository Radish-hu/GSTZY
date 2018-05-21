package com.gstzy.util;

import java.util.logging.Logger;

public class Log {
    private static Logger log=Logger.getLogger(Log.class.getName());
    //定义测试用例开始执行的打印方法
    public static void startTestCase(String testCaseName){
        log.info("---------"+testCaseName+"---------");
    }
    //定义测试用例执行结束的打印方法
    public static void endTestCase(String testCaseName){
        log.info("---------"+testCaseName+"---------");
    }
    //定义打印info级别日志的方法
    public static void info(String message){
        log.info(message);
    }
    //定义打印error级别日志的方法
    public static void error(String message){
        Log.error(message);
    }
    //定义打印debug级别日志的方法
    public static void debug(String message){
        Log.debug(message);
    }

}
