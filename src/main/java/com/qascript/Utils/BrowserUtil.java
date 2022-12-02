package com.qascript.Utils;

import com.qascript.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
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

    public static void validateText(String element, String expectedText) {
        String actualText = findAndWaitForElement(element).getText();
        Assert.assertTrue("Expected Text: "+ expectedText +" is not matching Actual Text: "+ actualText,
                expectedText.equals(actualText));
    }

    public static void hoverAndClickOnElement(String element1, String element2){
        WebElement e1 = findAndWaitForElement(element1);
        WebElement e2 = findAndWaitForElement(element2);

        Actions actions = new Actions(driver);
        actions.moveToElement(e1).click(e2).build().perform();
    }

    public static void validateValue(String element, String expectedValue, String attributeType) {
        String actualValue = findAndWaitForElement(element).getAttribute(attributeType);
        Assert.assertTrue("Expected Value: " + expectedValue + " is not matching with Actual Value: " + actualValue,
                expectedValue.equals(actualValue));
    }
}
