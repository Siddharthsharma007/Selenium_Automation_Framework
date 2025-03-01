package com.cityio.tests;

import com.cityio.driver.Driver;
import com.cityio.driver.Drivermanager;
import com.cityio.pages.HomePage;
import com.cityio.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest{


    @DataProvider
    public static Object[][] getData() {
        return new Object[][]{
                {"8652293353","Cityflo@123"}
        };
    }


    @Test(description = "This is the test for Homepage",dataProvider = "getData")
    public void Homepage(String username,String password) throws InterruptedException {
       LoginPage loginPage = new LoginPage();
       loginPage.LoginApp(username,password);
       HomePage homePage = new HomePage();
        homePage.clikOnOperations();

}
}
