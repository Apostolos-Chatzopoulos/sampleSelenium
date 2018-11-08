package web_pages.aboutSubPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test_utils.BaseWebPage;

import javax.naming.Context;

import static org.testng.Assert.assertTrue;

/**
 * Created by vpetrou on 1/3/2018.
 */
public class NewsAndPress extends BaseWebPage {

    @FindBy(id = "edit-keywords")
    WebElement searchInputField;
    @FindBy(id = "edit-type")
    WebElement typeButton;


    WebDriver driver;

    public NewsAndPress(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public NewsAndPress verifyPageOpens() {
        assertTrue(isElementPresent(By.xpath("//h1[contains(.,'News & Press')]")));
        return this;
    }

    public NewsAndPress search(String query, String year) {
        searchInputField.sendKeys(query);
        typeButton.click();


        return this;
    }
}