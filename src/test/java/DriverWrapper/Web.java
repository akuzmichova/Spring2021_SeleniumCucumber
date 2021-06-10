package DriverWrapper;

import Utils.TestConstant;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    // Methods related to Web-launch, close

    private static WebDriver driver = null;

    /**
     * Any method with @Before annotation will run before every scenario
     *
     * @beforeMethod (TestNG) - Any method with beforeMethod annotation will run
     * before every @Test annotation method
     */
    @Before
    public void openUrl() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TestConstant.tenSeconds, TimeUnit.SECONDS);
    }

    public void openUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TestConstant.tenSeconds, TimeUnit.SECONDS);
    }

    /**
     * Any method with @After annotation will run after every scenario
     *
     * @afterMethod (TestNG) - Any method with afterMethod annotation will run
     * after every @Test annotation method
     */
    @After
    public void quitPages() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void closePage() {
        driver.close();
    }


}