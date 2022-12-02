package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.Utils.BrowserUtil;
import com.qascript.Utils.ExcelUtil;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;

import java.util.List;

public class LoginPage extends BaseClass {

    private static String EmailXpath = "//input[@id='input-email']";
    private static String PasswordXpath = "//input[@id='input-password']";
    private static String LoginBtnXpath = "//input[@value='Login']";
    private static String ForgottenPasswordXpath = "(//a[text()='Forgotten Password'])[1]";
    private static String alertLoginError = "//div[contains(@class,'alert-danger')]";
    static ExcelUtil excelUtil = new ExcelUtil("src/test/resources/testData/Sample.xlsx");

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

    public static void getUsername(){
        List<String> usernames = excelUtil.readExcelData("Login","Username");
        String username = usernames.get(0);
        System.out.println(usernames.get(0));
        BrowserUtil.enterText(EmailXpath,username);
    }

    public static void getPassword(){
        List<String> passwords = excelUtil.readExcelData("Login","Password");
        String password = passwords.get(1);
        System.out.println(passwords.get(1));
        BrowserUtil.enterText(PasswordXpath,password);
    }
}
