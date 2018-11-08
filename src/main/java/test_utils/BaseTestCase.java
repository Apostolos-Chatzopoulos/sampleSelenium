package test_utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import test_utils.common.Property;
import test_utils.common.Wait;

/**
 * Created by vpetrou on 1/3/2018.
 */
public class BaseTestCase {

    public WebDriver driver;
    public Page page;

    @BeforeTest
    public void beforeTest() {
        //OPEN BROWSER AND APPLICATION URL
        System.out.println("browser:" + Property.getBrowser());
        if (Property.getBrowser().equalsIgnoreCase("chrome")) {

            //get file according to OS
            String webdriverFileName = "";
            if (Property.getApplicationOS().equalsIgnoreCase("mac")) {
                webdriverFileName = "chromedriver_mac";
            } else {
                webdriverFileName = "chromedriver.exe";
            }

            // set the location of chrome driver file (resources)
            System.setProperty("webdriver.chrome.driver", Property.getApplicationPath() + "/src/main/resources/drivers/" + webdriverFileName);
            // create a new driver (chrome driver)
            driver = new ChromeDriver();
        }
        //only for mac that supports many Desktops
        if (Property.getApplicationOS().equalsIgnoreCase("mac")) {
            focusBrowser(driver);
        }
        // open web application
        driver.get(Property.getURL());
        //maximize window
        driver.manage().window().maximize();
        // wait for page to load (because sometime we put the correct element locators but unexpectedly script fails.)
        Wait.forPageToLoad(driver);

        page = new Page(driver);
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    private void focusBrowser(WebDriver driver) {
        String currentWindowHandle;
        currentWindowHandle = driver.getWindowHandle();

        ((JavascriptExecutor)driver).executeScript("alert('testFlock.org:7101')");
        driver.switchTo().alert().accept();

        driver.switchTo().window(currentWindowHandle);

    }
}
