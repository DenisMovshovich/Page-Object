package steps;

import org.openqa.selenium.WebElement;
import pages.SearchResultsPage;

public class SearchResultsSteps extends BaseSteps {

    private final SearchResultsPage searchResultsPage = new SearchResultsPage();

    public SearchResultsSteps verifyThatTopResultContainsCorrectText(String text) {
        searchResultsPage.assertThatTopResultContainsCorrectText(text);
        return this;
    }

    public SearchResultsSteps verifyThatTopResultContainsProperAttributeText(String text) {
        searchResultsPage.assertThatTopResultContainsProperAttributeText(text);
        return this;
    }

    public SearchResultsSteps verifyThatElementExists(WebElement webElement) {
        searchResultsPage.assertThatElementExists(webElement);
        return this;
    }

    public SearchResultsSteps updateSearchResultsPage() {
        searchResultsPage.updatePage();
        return this;
    }

}
