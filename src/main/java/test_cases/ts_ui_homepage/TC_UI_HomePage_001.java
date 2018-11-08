package test_cases.ts_ui_homepage;

import org.testng.annotations.Test;
import test_utils.BaseTestCase;

/**
 * Created by apostolos chatzopoulos.
 */
public class TC_UI_HomePage_001 extends BaseTestCase {

    @Test
    public void homePageTestMainMenuOptionsAndLogo() {
        // navigate to Intrasoft home page, verify logo and all menu options appear
        page.homePage();
        page.menu()
                .verifyMainMenuOptions()
                .verifyLogo();
    }

}
