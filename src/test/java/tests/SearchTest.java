package tests;

import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SearchResultsPage;
import steps.SearchSteps;

public class SearchTest extends BaseTest {

    @Test
    public void openGoogleComInChromeTest1() {

        SearchSteps steps = new SearchSteps();

        steps.executeSearchByKeyword("Selenium Java")
                .verifyThatTopResultContainsCorrectText("The Selenium Browser Automation Project")
                .verifyThatTopResultContainsProperAttributeText("LC20lb MBeuO DKV0Md");
    }

}