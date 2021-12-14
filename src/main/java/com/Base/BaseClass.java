package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {
    public static WebDriver driver ;
   // public static WebDriver driver = new ChromeDriver();
   // public static WebDriver driver1 = new FirefoxDriver();
    public static void main(String[] args) {
       chrome_launch();
       opera_launch();
       edge_launch();
       firefox_launch();
       open_testProject();
       //chrome_close();
       //firefox_close();
       chrome_quit();
      firefox_quit();
      //opera_close();
      opera_quit();
      //edge_close();
      edge_quit();

    }
    public static void chrome_launch(){
   System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
   driver=new ChromeDriver();
        driver.get("https://google.com");
    }
    public static void opera_launch(){
        System.setProperty("webdriver.opera.driver","./src/main/resources/Drivers/operadriver.exe");
        driver=new OperaDriver();
        driver.get("https://google.com");
    }
    public static void edge_launch(){
        System.setProperty("webdriver.edge.driver","./src/main/resources/Drivers/msedgedriver.exe");
        driver=new EdgeDriver();
        driver.get("https://google.com");
    }

      public static void firefox_launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/Drivers/geckodriver.exe");
        driver=new FirefoxDriver();
          driver.get("https://google.com");
    }
    public static void opera_close(){
        driver.quit();

    }
    public static void opera_quit(){
        driver.quit();

    }
    public static void edge_close(){
        driver.quit();

    }
    public static void edge_quit(){
        driver.quit();

    }
    public static void chrome_close(){
        driver.quit();

    }
    public static void chrome_quit(){
        driver.quit();

    }
    public static void firefox_close(){
        driver.close();
    }
    public static void firefox_quit(){
        driver.quit();

    }
    public static void open_testProject()
    {
       driver.get("https://google.com");
    }
}
