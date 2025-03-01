package com.cityio.Reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtendManager {
    private ExtendManager(){}

    private static final ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

   static ExtentTest getExtentTest(){
        return threadLocal.get();
    }
    static void setExtentTest(ExtentTest test){
        threadLocal.set(test);
    }
}
