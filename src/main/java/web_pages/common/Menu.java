package web_pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test_utils.BaseWebPage;
import test_utils.common.Wait;

import static org.testng.Assert.assertTrue;

/**
 * Created by vpetrou on 1/3/2018.
 */
public class Menu extends BaseWebPage {

    @FindBy(xpath = "//a[contains(.,'About')]")
    WebElement aboutLink;
    @FindBy(xpath = "//a[text() = 'Markets ']")
    WebElement marketsLink;
    @FindBy(xpath = "//a[text() = 'Services ']")
    WebElement servicesLink;
    @FindBy(xpath = "//a[text() = 'Products']")
    WebElement productsLink;
    @FindBy(xpath = "//a[text() = 'Careers']")
    WebElement careersLink;
    @FindBy(xpath = "//a[text() = 'INTRAblog']")
    WebElement intraBlogLink;
    @FindBy(xpath = "//a[text() = 'Contact']")
    WebElement contactLink;
    @FindBy(xpath = "//a[contains(@class,'logo')]")
    WebElement logoLink;
    @FindBy(xpath = "//span[contains(@class,'search-lens')]")
    WebElement searchButtonLink;
    @FindBy(id = "edit-keywords")
    WebElement searchInputField;
    @FindBy(id = "edit-submit-search")
    WebElement searchButton;

    @FindBy(xpath = "//a[contains(.,'Company Overview')]")
    WebElement companyOverviewLink;
    @FindBy(xpath = "//a[contains(.,'2018 - Year of Coding')]")
    WebElement yearOfInnovation2018Link;
    @FindBy(xpath = "//a[contains(.,'2017 - Year Of Innovation')]")
    WebElement yearOfInnovation2017Link;
    @FindBy(xpath = "//a[contains(.,'Financial Info')]")
    WebElement financialInfoLink;
    @FindBy(xpath = "//a[contains(.,'Partners & Alliances')]")
    WebElement partnersAndAlliancesLink;
    @FindBy(xpath = "//a[contains(.,'Policies & Certifications')]")
    WebElement policiesAndCertificationsLink;
    @FindBy(xpath = "//a[contains(.,'Corporate Responsibility')]")
    WebElement corporateResponsibilityLink;
    @FindBy(xpath = "//a[contains(.,'News & Press')]")
    WebElement newsAndPressLink;
    @FindBy(xpath = "//a[contains(.,'Advisory Board')]")
    WebElement advisoryBoardLink;

    WebDriver driver;
    Actions builder;

    public Menu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.builder = new Actions(driver);
    }

    public Menu verifyMainMenuOptions() {
        //verify that menu options of main menu are displayed
        assertTrue(aboutLink.isDisplayed());
        assertTrue(marketsLink.isDisplayed());
        assertTrue(servicesLink.isDisplayed());
        assertTrue(productsLink.isDisplayed());
        assertTrue(careersLink.isDisplayed());
        assertTrue(intraBlogLink.isDisplayed());
        assertTrue(contactLink.isDisplayed());
        return this;
    }

    public Menu verifyLogo() {
        //verify that logo options of main menu are displayed
        assertTrue(logoLink.isDisplayed());
        return this;
    }

    public Menu search(String query) {
        searchButtonLink.click();
        assertTrue(searchInputField.isDisplayed());
        searchInputField.sendKeys(query);
        searchButton.click();
        return this;
    }

    public Menu verifySearchResult(String query) {
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'" +  query + "')]")));
        return this;
    }

    public Menu hoverOver(WebElement element) {
        builder.moveToElement(element).perform();
        return this;
    }

    public Menu clickAboutMenu() {
        aboutLink.click();
        return this;
    }

    public Menu verifyAboutSubmenu() {
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'Company Overview')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'2018 - Year of Coding')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'2017 - Year Of Innovation')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'Financial Info')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'Partners & Alliances')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'Policies & Certifications')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'Corporate Responsibility')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'News & Press')]")));
        return this;
    }

    public Menu goToCompanyOverview() {
        hoverOver(aboutLink);
        companyOverviewLink.click();
        Wait.forPageToLoad(driver);
        return this;
    }

    public Menu goTonewsAndPress() {
        hoverOver(aboutLink);
        newsAndPressLink.click();
        Wait.forPageToLoad(driver);
        return this;
    }

    public Menu goToAdvisoryBoard() {
        hoverOver(aboutLink);
        hoverOver(companyOverviewLink);
        advisoryBoardLink.click();
        Wait.forPageToLoad(driver);
        return this;
    }

    public Menu verifyComplanyOverview() {
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'Company Overview')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'2018 - Year of Coding')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'2017 - Year Of Innovation')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'Financial Info')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'Partners & Alliances')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'Policies & Certifications')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'Corporate Responsibility')]")));
        assertTrue(isElementPresent(By.xpath("//a[contains(.,'News & Press')]")));
        return this;
    }
}