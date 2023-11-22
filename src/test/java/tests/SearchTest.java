package tests;

import org.testng.annotations.Test;
import steps.SearchSteps;

public class SearchTest extends BaseTest {

//    @Test
//    public void openGoogleComInChromeTest1() throws InterruptedException {
//
//        searchPage.fillSearchField("Selenium Java");
//        searchPage.pressSearchButtonOrPressEnter();
//        searchResultsPage.updatePage();
//        searchResultsPage.assertThatTopResultContainsCorrectText("The Selenium Browser Automation Project");
//        searchResultsPage.assertThatTopResultContainsProperAttributeText("LC20lb MBeuO DKV0Md");
//        searchResultsPage.assertThatElementExists(searchResultsPage.googleLogoButton);
//        searchResultsPage.updatePage();
//        searchResultsPage.clearSearchField();
//    }


//     Тот же тест, но составленный с помощью паттерна Steps
    @Test
    public void openGoogleComInChromeTest2() throws InterruptedException {

        SearchSteps
                .executeSearchByKeyword("Selenium Java")
                .updateSearchResultsPage()
                .verifyThatTopResultContainsCorrectText("The Selenium Browser Automation Project")
                .verifyThatTopResultContainsProperAttributeText("LC20lb MBeuO DKV0Md")
                .verifyThatElementExists(searchResultsPage.googleLogoButton)
                .updateSearchResultsPage();

    }


}