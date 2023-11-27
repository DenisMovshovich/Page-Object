package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultsPage extends BasePage {

    // Поиск элемента по XPath и присвоение его переменной googleLogoButton.
    @FindBy(xpath = "//img[@class='jfN4p']")
    public WebElement googleLogoButton;
    // Поиск элемента по XPath и присвоение его переменной searchField.
    @FindBy(xpath = "//*[@id='APjFqb']")
    private WebElement searchField;
    // Поиск элемента по XPath и присвоение его переменной firstResultRow.
    @FindBy(xpath = "//div[@class='kb0PBd cvP2Ce jGGQ5e']//div[@class='yuRUbf']//h3")
    private WebElement firstResultRow;
    // Поиск элементов по XPath и присвоение их переменной resultRows.
    @FindBy(xpath = "//div[@class='kb0PBd cvP2Ce jGGQ5e']//div[@class='yuRUbf']//h3")
    private List<WebElement> resultRows;

    // Конструктор по умолчанию класса SearchResultsPage.
    // Использует конструктор суперкласса для инициализации объекта SearchResultsPage.
    public SearchResultsPage() {
        super();
    }

    // Метод для проверки, что верхний результат содержит ожидаемый текст.
    public void assertThatTopResultContainsCorrectText(String expected) {
        wait.until(ExpectedConditions.visibilityOfAllElements(resultRows)); // Ожидание видимости всех результатов поиска.
        assertThat(firstResultRow.isDisplayed()).as("Element has not been displayed!").isTrue(); // Проверка, что первый результат отображается.
        assertThat(resultRows.stream().map(WebElement::getText).collect(Collectors.toList()).toString())
                .as("Wrong text has been displayed").contains(expected); // Проверка, что текст результатов содержит ожидаемый текст.
    }

    // Метод для проверки, что верхний результат содержит ожидаемый атрибут текста.
    public void assertThatTopResultContainsProperAttributeText(String expected) {
        assertThat(firstResultRow.getAttribute("class")).as("Wrong attribute text!").contains("LC20lb MBeuO DKV0Md");
    }

    // Метод для проверки существования элемента.
    public void assertThatElementExists(WebElement webElement) {
        assertThat(webElement).as("Element does not exist").isNotNull();
    }

    // Метод для очистки строки поиска.
    public void clearSearchField() {
        searchField.clear();
    }
}
