package com.BasicOperation;

import com.Base.BaseClass;
import org.openqa.selenium.Dimension;

public class BrowserSize extends BaseClass {
    public static void main(String[] args) {
        chrome_launch();
        getMaximizeWindowSize();
        setWindowSize(1000,1020);

        chrome_close();
    }
    public static void getMaximizeWindowSize(){
        int max_width=driver.manage().window().getSize().getWidth();
        int max_height=driver.manage().window().getSize().getHeight();
        System.out.println("Maximize Window Width : "+max_width+"  Height :"+max_height);
    }
   public static void setWindowSize(int width,int height){

        driver.manage().window().setSize(new Dimension(width,height));
    }
}
