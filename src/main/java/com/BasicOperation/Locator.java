package com.BasicOperation;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator extends BaseClass {
    public static void main(String[] args) {
        chrome_launch();
        open_URL("https://demo.opencart.com/index.php?route=account/login");
        //locatior_ID();
       // locatior_name();
        //locatior_xpath();
        locatior_css();
    }
    public static void locatior_ID(){
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("test@testmail.com");

    }
    public static void locatior_name(){
        WebElement Email=driver.findElement(By.name("email"));
        Email.clear();
        Email.sendKeys("test@testmail.com");

    }
    public static void locatior_xpath(){
        WebElement Email=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        Email.clear();
        Email.sendKeys("test@testmail.com");

    }
    public static void locatior_css(){
        WebElement Email=driver.findElement(By.cssSelector("#input-email"));
        Email.clear();
        Email.sendKeys("test@testmail.com");

    }


}
