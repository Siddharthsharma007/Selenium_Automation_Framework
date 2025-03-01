package com.cityio.pages;

import com.cityio.driver.Drivermanager;
import com.cityio.pages.pagecomponent.leftMenuComponents;

public class HomePage {

   private leftMenuComponents leftMenuComponents;

   public HomePage(){
       leftMenuComponents = new leftMenuComponents();
   }

    public  String getTitle(){
       return Drivermanager.getDriver().getTitle();
    }

    public void clikOnOperations() throws InterruptedException {
        leftMenuComponents.operationsComponentM();
    }
}
