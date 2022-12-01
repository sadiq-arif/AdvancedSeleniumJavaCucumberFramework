package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.Utils.BrowserUtil;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {

    private static String EmailXpath = "//input[@id='input-email']";
    private static String PasswordXpath = "//input[@id='input-password']";
    private static String LoginBtnXpath = "//input[@value='Login']";
    private static String ForgottenPasswordXpath = "(//a[text()='Forgotten Password'])[1]";
    private static String alertLoginError = "//div[contains(@class,'alert-danger')]";

    public static void enterEmail(String email) {
        BrowserUtil.enterText(EmailXpath,email);
    }

    public static void enterPassword(String password) {
        BrowserUtil.enterText(PasswordXpath,password);
    }

    public static void clickLoginBtn() {
        BrowserUtil.clickElement(LoginBtnXpath);
    }

    public static void clickForgottenPassword() {
        BrowserUtil.clickElement(ForgottenPasswordXpath);
    }

    public static void validateInvalidLogin(String expectedMessage) {
        BrowserUtil.validateText(alertLoginError,expectedMessage);
    }
}
