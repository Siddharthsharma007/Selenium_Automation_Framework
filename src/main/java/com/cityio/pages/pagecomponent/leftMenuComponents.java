package com.cityio.pages.pagecomponent;

import com.cityio.driver.Drivermanager;
import com.cityio.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.cityio.utils.SeleniumUtils.click;

public class leftMenuComponents {

   private By operationsComponent= By.xpath("//*[@id='root']/div/div[2]/main/section/div[2]/div[1]/div[2]/a[1]");



public void operationsComponentM() throws InterruptedException {
  click(operationsComponent,"HomeButton");
}

}
