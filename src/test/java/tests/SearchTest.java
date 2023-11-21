package tests;

import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void openGoogleComInChromeTest1() {


        searchPage.fillSearchField("Selenium Java");
        searchPage.pressEnter();
        searchResultsPage.updatePage();
        searchResultsPage.assertThatTopResultContainsCorrectText("The Selenium Browser Automation Project");
        searchResultsPage.assertThatTopResultContainsProperAttributeText("LC20lb MBeuO DKV0Md");
        searchResultsPage.assertThatElementExists(searchResultsPage.GoogleLogoButton);
        searchResultsPage.updatePage();
    }

//    @Test
//    public void openGoogleComInChromeTest2() {
//
//    SearchSteps
//                .executeSearchByKeyword("Selenium Java")
//                .updateSearchResultsPage()
//                .verifyThatTopResultContainsCorrectText("The Selenium Browser Automation Project")
//                .verifyThatTopResultContainsProperAttributeText("LC20lb MBeuO DKV0Md")
//                .verifyThatElementExists(searchResultsPage.GoogleLogoButton)
//                .updateSearchResultsPage();
//
//    }


}