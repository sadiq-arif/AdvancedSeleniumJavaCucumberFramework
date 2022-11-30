package com.qascript.Utils;

import com.qascript.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class BrowserUtil  extends BaseClass {

    static Properties properties = PropertiesUtil.loadFrameworkProperties();

    public static WebElement findAndWaitForElement(String xpath){
        String timeout = properties.getProperty("timeout.maximum");
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver,Long.parseLong(timeout));
            element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
        }
        catch (Exception e){
            System.out.println("Element not found");
        }
        return element;
    }

    public static void clickElement(String element){
        findAndWaitForElement(element).click();
    }

    public static void enterText(String element, String text){
        findAndWaitForElement(element).clear();
        findAndWaitForElement(element).sendKeys(text);
    }
}
