package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultsPage extends BasePage {


    @FindBy(xpath = "//*[@id='APjFqb']")
    private WebElement searchField;

    @FindBy(xpath = "//div[@class='yuRUbf']//h3")
    private WebElement firstResultRow;

    @FindBy(xpath = "//img[@class='jfN4p']")
    public WebElement googleLogoButton;

    public SearchResultsPage() {
        super();
    }

    public void assertThatTopResultContainsCorrectText(String expected) {
        assertThat(firstResultRow.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(firstResultRow.getText()).as("Wrong text has been displayed").isEqualTo(expected);
    }

    public void assertThatTopResultContainsProperAttributeText(String expected) {
        assertThat(firstResultRow.getAttribute("class")).as("Wrong attribute text!").contains("LC20lb MBeuO DKV0Md");
    }

    public void assertThatElementExists(WebElement webElement) {
        assertThat(webElement).as("Element does not exist").isNotNull();
    }

    public void clearSearchField() {
        searchField.clear();
    }

}


