package test_cases.ts_ui_homepage;

import org.testng.annotations.Test;
import test_utils.BaseTestCase;

/**
 * Created by apostolos chatzopoulos.
 */
public class TC_UI_HomePage_002 extends BaseTestCase {

    @Test
    public void homePageTestExpandCollapseSearchBar() {
        //navigate to Intrasoft home page
        page.homePage();
        //search for 'customs' and verify results
        page.menu()
                .search("Customs")
                .verifySearchResult("Customs");
    }

}
