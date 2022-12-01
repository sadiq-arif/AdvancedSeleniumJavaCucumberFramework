package com.qascript.PageObjects;

import com.qascript.Utils.BrowserUtil;

public class HomePage {

    private static String myAccountText = "//div[@id='content']/h2[1]";

    public static void validateLogin(String expectedText){
        BrowserUtil.validateText(myAccountText,expectedText);
    }
}
