package com.qascript.PageObjects;

import com.qascript.Utils.BrowserUtil;

public class HomePage {

    private static String myAccountText = "//div[@id='content']/h2[1]";
    private static String linkLaptopsAndNotebooks = "//a[text()='Laptops & Notebooks']";
    private static String linkShowAllLaptopsAndNotebooks = "//a[text()='Show All Laptops & Notebooks']";
    private static String linkShoppingCart = "//a[@title='Shopping Cart']";

    public static void validateLogin(String expectedText){
        BrowserUtil.validateText(myAccountText,expectedText);
    }

    public static void clickAllLaptopsAndNotebooks() {
        BrowserUtil.hoverAndClickOnElement(linkLaptopsAndNotebooks,linkShowAllLaptopsAndNotebooks);
    }

    public static void clickShoppingCart() {
        BrowserUtil.clickElement(linkShoppingCart);
    }
}
