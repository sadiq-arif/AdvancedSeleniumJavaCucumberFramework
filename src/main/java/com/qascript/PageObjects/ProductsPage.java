package com.qascript.PageObjects;

import com.qascript.Utils.BrowserUtil;

public class ProductsPage {
    private static String linkMacbook = "//a[text()='MacBook']";
    private static String linkProduct = "//h4/a[contains(@href,'product_id')]";
    private static String btnAddToCart = "//button[@id='button-cart']";
    private static String txtPriceHeading = "(//div[@class='col-sm-4'])[2]//following::li//h2[1]";
    private static String txtProductHeading = "(//div[@class='col-sm-4'])[2]//following::h1[1]";
    private static String txtBoxQuantity = "//input[@id='input-quantity']";

    public static void clickProduct() {
        BrowserUtil.clickElement(linkMacbook);
    }

    public static void validatePrice(String expectedPrice) {
        BrowserUtil.validateText(txtPriceHeading,expectedPrice);
    }

    public static void validateProduct(String expectedName) {
        BrowserUtil.validateText(txtProductHeading,expectedName);
    }

    public static void clickAddToCartBtn() {
        BrowserUtil.clickElement(btnAddToCart);
    }

    public static void enterQuantity(String quantity) {
        BrowserUtil.enterText(txtBoxQuantity,quantity);
    }

    public static void clickProducts() {
//        String xpath = linkProduct.replaceAll("]","and contains(@href,'47')]");
//        int index = 1;
//        String xpath = "(" + linkProduct + ")" + "[" + index + "]";
        for(int i = 0 ; i < 5 ; i++){
            String xpath = "(" + linkProduct + ")" + "[" + i + "]";
            BrowserUtil.clickElement(xpath);
        }
    }
}
