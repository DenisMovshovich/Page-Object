package steps;

import org.openqa.selenium.WebElement;
import pages.SearchResultsPage;

public class SearchResultsSteps extends BaseSteps {

    // Создание экземпляра SearchResultsPage для взаимодействия с методами этой страницы.
    private final SearchResultsPage searchResultsPage = new SearchResultsPage();

    // Метод для проверки, что верхний результат содержит ожидаемый текст.
    public SearchResultsSteps verifyThatTopResultContainsCorrectText(String text) {
        searchResultsPage.assertThatTopResultContainsCorrectText(text);
        return this; // Возвращение экземпляра текущего класса для поддержки паттерна "fluent interface".
    }

    // Метод для проверки, что верхний результат содержит ожидаемый атрибут текста.
    public SearchResultsSteps verifyThatTopResultContainsProperAttributeText(String text) {
        searchResultsPage.assertThatTopResultContainsProperAttributeText(text);
        return this; // Возвращение экземпляра текущего класса для поддержки паттерна "fluent interface".
    }

    // Метод для проверки существования элемента.
    public SearchResultsSteps verifyThatElementExists(WebElement webElement) {
        searchResultsPage.assertThatElementExists(webElement);
        return this; // Возвращение экземпляра текущего класса для поддержки паттерна "fluent interface".
    }

    // Метод для обновления страницы результатов поиска.
    public SearchResultsSteps updateSearchResultsPage() {
        searchResultsPage.updatePage();
        return this; // Возвращение экземпляра текущего класса для поддержки паттерна "fluent interface".
    }
}
