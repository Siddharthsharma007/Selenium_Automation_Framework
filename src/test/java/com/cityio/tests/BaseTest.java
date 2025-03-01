package com.cityio.tests;
import com.cityio.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseTest {


    @BeforeMethod
    public void setup(Method method) throws IOException {
        Driver.initDriver();

    }
    @AfterMethod
    public void teardown(){
         Driver.quit();
    }

}
