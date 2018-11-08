package test_cases.ts_ui_homepage;

import org.testng.annotations.Test;
import test_utils.BaseTestCase;

/**
 * Created by apostolos chatzopoulos.
 */
public class TC_UI_HomePage_003 extends BaseTestCase {

    @Test
    public void verifyOptionSubmenuOptions() {
        // navigate to Intrasoft home page and verifying the options of 'About' link
        page.homePage();
        page.menu()
                .clickAboutMenu()
                .verifyAboutSubmenu();
    }

}
