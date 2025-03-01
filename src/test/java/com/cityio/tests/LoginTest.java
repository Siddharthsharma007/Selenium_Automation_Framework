package com.cityio.tests;


import com.cityio.driver.Drivermanager;
import com.cityio.pages.HomePage;
import com.cityio.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class LoginTest extends BaseTest {

    @DataProvider
    public static Object[][] getdata() {
 return new Object[][]{
         {"8652293353","Cityflo@123","I"}

 };

}

    @Test(description = "To check weather the team can login in the Cityflo IO Dashboard",dataProvider = "getdata")
    public void login(String username,String password,String expectedTitle) throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        String actualTitle= loginPage
                .LoginApp(username,password)
                .getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
