package steps;

import pages.SearchPage;

public class SearchSteps extends BaseSteps {

    private static final SearchPage searchPage = new SearchPage();

    public static SearchResultsSteps executeSearchByKeyword(String keyword) throws InterruptedException {
        searchPage.fillSearchField(keyword);
        searchPage.pressSearchButtonOrPressEnter();
        return new SearchResultsSteps();
    }

    public SearchSteps updateSearchPage() {
        searchPage.updatePage();
        return this;
    }
}
