package com.cityio.driver;

import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class Unablenotifications {

    public static ChromeOptions UnableBrowserNameChrome(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        return options;
    }


    public static void UnableBrowserNameSafari() throws IOException {
        Runtime.getRuntime().exec("osascript -e 'tell application \"System Events\" to click button \"Don’t Allow\" of window 1 of application process \"Safari\"'");
    }



}
