package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[@class='yuRUbf']//h3")
    private WebElement resultRow;

    public SearchResultsPage() {
        super();
    }

    public void assertThatTopResultContainsCorrectText(String expected) {
        assertThat(resultRow.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(resultRow.getText()).as("Wrong text has been displayed").isEqualTo(expected);
    }

    public void assertThatTopResultContainsProperAttributeText(String expected) {
        assertThat(resultRow.getAttribute("class")).as("Wrong attribute text!").contains("LC20lb MBeuO DKV0Md");
    }

}


