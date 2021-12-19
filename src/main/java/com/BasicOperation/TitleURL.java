package com.BasicOperation;

import com.Base.BaseClass;

public class TitleURL extends BaseClass {
    public static void main(String[] args) {
     firefox_launch();
     open_URL("https://demo.opencart.com");
     title_verification("Your Store");
     url_verification("https://demo.opencart.com");
     firefox_close();
    }

    public static void title_verification(String ExpectedTitle){
        //String ExpectedTitle="My Store";
       String ActualTitle= driver.getTitle(); //Return String valie
        System.out.println(ActualTitle);

        if(ExpectedTitle.equals(ActualTitle) ){
            System.out.println("Title Verificaion passed");
        }
        else{
            System.out.println("Title Verification Failed "+" Actual Title : "+ActualTitle);
        }

    }
    public static void url_verification(String ExpectedUrl){
      //  String ExpectedUrl="URL";
        String ActualUrl= driver.getCurrentUrl(); //Return String valie
        System.out.println(ActualUrl);

        if(ExpectedUrl.equals(ActualUrl) ){
            System.out.println("URL Verificaion passed");
        }
        else{
            System.out.println("URL Verification Failed"+"Actual URL :"+ActualUrl);
        }

    }
}
