package test_cases.ts_ui_homepage;

import org.testng.annotations.Test;
import test_utils.BaseTestCase;

/**
 * Created by apostolos chatzopoulos on 1/3/2018.
 */
public class TC_UI_HomePage_004 extends BaseTestCase {

    @Test
    public void goToCompanyOverView() {
        // navigate to Intrasoft home page, mouse over 'About', click 'Company Overview' and verify content
        page.homePage();
        page.menu()
                .goToCompanyOverview();
        page.companyOverview()
                .verifyPageOpens();
    }

}
