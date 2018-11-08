package test_cases.ts_ui_homepage;

import org.testng.annotations.Test;
import test_utils.BaseTestCase;

/**
 * Created by apostolos chatzopoulos.
 */
public class TC_UI_HomePage_005 extends BaseTestCase {

    @Test
    public void goToAdvisoryBoard() {
        // navigate to Intrasoft home page, click 'Advisory Board' through 'About' and verify content
        page.homePage();
        page.menu()
                .goToAdvisoryBoard();
        page.advisoryBoard()
                .verifyPageOpens();
    }

}
