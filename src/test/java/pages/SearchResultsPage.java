package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultsPage extends BasePage {


    @FindBy(xpath = "//*[@id='APjFqb']")
    private WebElement searchField;

    @FindBy(xpath = "//div[@class='kb0PBd cvP2Ce jGGQ5e']//div[@class='yuRUbf']//h3")
    private WebElement firstResultRow;

    @FindBy(xpath = "//div[@class='kb0PBd cvP2Ce jGGQ5e']//div[@class='yuRUbf']//h3")
    private List<WebElement> resultRows;

    @FindBy(xpath = "//img[@class='jfN4p']")
    public WebElement googleLogoButton;

    public SearchResultsPage() {
        super();
    }

    public void assertThatTopResultContainsCorrectText(String expected) {
        wait.until(ExpectedConditions.visibilityOfAllElements(resultRows));
        assertThat(firstResultRow.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(resultRows.stream().map(e->e.getText()).collect(Collectors.toList()).toString())
                .as("Wrong text has been displayed").contains(expected);
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


