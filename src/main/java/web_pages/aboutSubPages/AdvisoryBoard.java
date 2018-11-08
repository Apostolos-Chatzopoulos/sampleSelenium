package web_pages.aboutSubPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import test_utils.BaseWebPage;

import static org.testng.Assert.assertTrue;

/**
 * Created by vpetrou on 1/3/2018.
 */
public class AdvisoryBoard extends BaseWebPage {

    WebDriver driver;

    public AdvisoryBoard(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AdvisoryBoard verifyPageOpens() {
        assertTrue(isElementPresent(By.xpath("//h1[contains(.,'Advisory Board')]")));
        return this;
    }
}