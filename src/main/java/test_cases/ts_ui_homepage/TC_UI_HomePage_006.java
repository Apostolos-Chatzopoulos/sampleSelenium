package test_cases.ts_ui_homepage;

import org.testng.annotations.Test;
import test_utils.BaseTestCase;

/**
 * Created by apostolos chatzopoulos.
 */
public class TC_UI_HomePage_006 extends BaseTestCase {

    @Test
    public void goToNiewsAndPress() {
        // navigate to Intrasoft home page, click 'News & Press' and verify content
        page.homePage();
        page.menu()
                .goTonewsAndPress();
        page.newsAndPress()
                .verifyPageOpens();
    }

}
