package com.cityio.utils;

import com.cityio.driver.Drivermanager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public final class ScreenshotUtils {

    private ScreenshotUtils(){}

    public static String getScreenshot(){
        return ((TakesScreenshot) Drivermanager.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
