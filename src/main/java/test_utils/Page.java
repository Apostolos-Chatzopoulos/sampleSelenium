package test_utils;

import org.openqa.selenium.WebDriver;
import web_pages.aboutSubPages.AdvisoryBoard;
import web_pages.aboutSubPages.CompanyOverview;
import web_pages.aboutSubPages.NewsAndPress;
import web_pages.common.Menu;
import web_pages.home.Home;

/**
 * Created by vpetrou on 1/3/2018.
 */
public class Page {

    WebDriver driver;

    private Menu menu;
    private Home homePage;
    private CompanyOverview companyOverview;
    private AdvisoryBoard advisoryBoard;
    private NewsAndPress newsAndPress;


    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public Menu menu() {
        menu = new Menu(driver);
        return menu;
    }

    public Home homePage() {
        homePage = new Home(driver);
        return homePage;
    }

    public CompanyOverview companyOverview() {
        companyOverview = new CompanyOverview(driver);
        return companyOverview;
    }

    public AdvisoryBoard advisoryBoard() {
        advisoryBoard = new AdvisoryBoard(driver);
        return advisoryBoard;
    }

    public NewsAndPress newsAndPress() {
        newsAndPress = new NewsAndPress(driver);
        return newsAndPress;
    }
}
