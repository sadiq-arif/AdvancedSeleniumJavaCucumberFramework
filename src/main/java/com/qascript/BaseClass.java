package com.qascript;

import com.qascript.Utils.PropertiesUtil;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import java.util.Properties;
import static com.qascript.Utils.GetBrowserDriver.getBrowserDriver;

public class BaseClass {

    public static WebDriver driver;
    static Properties properties = PropertiesUtil.loadApplicationProperties();
    static Properties props = PropertiesUtil.loadFrameworkProperties();

    public static void initializeDriver() {
        String url = properties.getProperty("application.url");
        String browser = props.getProperty("browser.driver");

        driver = getBrowserDriver(browser);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void closeDriver() {
        driver.quit();
    }
}
