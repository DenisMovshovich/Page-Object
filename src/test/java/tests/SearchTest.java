package tests;

import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SearchResultsPage;

public class SearchTest extends BaseTest {

//    @Test(dataProvider = "dataProvider")
    @Test
    public void openGoogleComInChromeTest1() {

        SearchPage searchPage = new SearchPage();
        searchPage.fillSearchField("Selenium Java");
        searchPage.clearSearchField();
        searchPage.fillSearchField("Selenium Java");
        searchPage.pressEnter();
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.assertThatTopResultContainsCorrectText("The Selenium Browser Automation Project");
        searchResultsPage.assertThatTopResultContainsProperAttributeText("LC20lb MBeuO DKV0Md");

    }

}