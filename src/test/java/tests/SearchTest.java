package tests;

import org.testng.annotations.Test;
import steps.SearchSteps;

public class SearchTest extends BaseTest {

    // Тест, выполняющий поиск по ключевому слову и проверку результатов без использования паттерна Steps.
    @Test
    public void openGoogleComInChromeTest1() throws InterruptedException {

        // Заполнение строки поиска, нажатие кнопки поиска или клавиши Enter.
        searchPage.fillSearchField("Selenium Java");
        searchPage.pressSearchButtonOrPressEnter();

        // Обновление страницы результатов поиска.
        searchResultsPage.updatePage();

        // Проверка, что верхний результат содержит ожидаемый текст.
        searchResultsPage.assertThatTopResultContainsCorrectText("The Selenium Browser Automation Project");

        // Проверка, что верхний результат содержит ожидаемый атрибут текста.
        searchResultsPage.assertThatTopResultContainsProperAttributeText("LC20lb MBeuO DKV0Md");

        // Проверка существования элемента - логотипа Google.
        searchResultsPage.assertThatElementExists(searchResultsPage.googleLogoButton);

        // Обновление страницы результатов поиска.
        searchResultsPage.updatePage();

        // Очистка строки поиска.
        searchResultsPage.clearSearchField();
    }

    // Тот же тест, но составленный с помощью паттерна Steps.
    @Test
    public void openGoogleComInChromeTest2() throws InterruptedException {

        // Использование паттерна Steps для выполнения тех же шагов.
        SearchSteps
                .executeSearchByKeyword("Selenium Java") // Запуск поиска по ключевому слову.
                .updateSearchResultsPage() // Обновление страницы результатов поиска.
                .verifyThatTopResultContainsCorrectText("The Selenium Browser Automation Project") // Проверка текста верхнего результата.
                .verifyThatTopResultContainsProperAttributeText("LC20lb MBeuO DKV0Md") // Проверка атрибута текста верхнего результата.
                .verifyThatElementExists(searchResultsPage.googleLogoButton) // Проверка существования элемента - логотипа Google.
                .updateSearchResultsPage(); // Обновление страницы результатов поиска.
    }
}
