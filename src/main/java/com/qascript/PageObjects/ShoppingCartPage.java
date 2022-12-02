package com.qascript.PageObjects;

import com.qascript.Utils.BrowserUtil;
import io.cucumber.java.sl.In;

public class ShoppingCartPage {
    private static String btnCheckout = "//a[text()='Checkout']";
    private static String btnContinueShopping = "//a[text()='Continue Shopping']";
    private static String linkProduct = "//div[@id='content']//table[1]//tbody//tr[1]/td[2]/a";
    private static String txtBoxQuantity = "//div[@id='content']//table[1]//tbody//tr[1]/td[4]//input";
    private static String txtPrice = "//div[@id='content']//table[1]//tbody//tr[1]/td[5]";
    private static String txtTotalPrice = "//div[@id='content']//table[1]//tbody//tr[1]/td[5]";

    public static void clickCheckout() {
        BrowserUtil.clickElement(btnCheckout);
    }

    public static void clickContinueShopping() {
        BrowserUtil.clickElement(btnContinueShopping);
    }

    public static void validateProductName(String expectedProductName) {
        BrowserUtil.validateText(linkProduct,expectedProductName);
    }

    public static void validateProductQuantity(String expectedQuantity) {
        BrowserUtil.validateValue(txtBoxQuantity,expectedQuantity,"value");
    }

    public static void validateProductPrice(String expectedProductPrice) {
        BrowserUtil.validateText(txtPrice,expectedProductPrice);
    }

    public static void validateProductTotalPrice(String expectedProductPrice, String quantity) {
        int totalProductPrice = Integer.parseInt(expectedProductPrice) * Integer.parseInt(quantity);
        BrowserUtil.validateText(txtTotalPrice,String.valueOf(totalProductPrice));
    }

}