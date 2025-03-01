package com.cityio.pages;

import com.cityio.Reports.ExtendLogger;
import org.openqa.selenium.By;

import static com.cityio.utils.SeleniumUtils.click;
import static com.cityio.utils.SeleniumUtils.sendkeys;

public class LoginPage {
    private static final By USERNAME = By.id("username");
    private static final By PASSWORD = By.id("password");
    private static final By BUTTON =By.xpath("//button[@class=\"ant-btn css-zl9ks2 ant-btn-primary w-full login-form-button\"]");

    private LoginPage setUsername(String username){
        sendkeys(USERNAME,username,"Username");
        return this;
}
    private LoginPage setPassword(String password){
        sendkeys(PASSWORD,password,"Password");
        return this;
    }

    private HomePage setButton() throws InterruptedException {
        click(BUTTON,"LoginButton");
        return new HomePage();
    }

    public HomePage LoginApp(String username, String password) throws InterruptedException {
        return setUsername(username)
                .setPassword(password)
                .setButton();


    }

}
