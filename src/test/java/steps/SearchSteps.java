package steps;

import pages.SearchPage;

public class SearchSteps extends BaseSteps {

    // Создание статического экземпляра SearchPage для взаимодействия с методами этой страницы.
    private static final SearchPage searchPage = new SearchPage();

    // Метод для выполнения поиска по ключевому слову.
    // Заполняет поле поиска, нажимает кнопку поиска или клавишу Enter и возвращает экземпляр SearchResultsSteps.
    public static SearchResultsSteps executeSearchByKeyword(String keyword) throws InterruptedException {
        searchPage.fillSearchField(keyword);
        searchPage.pressSearchButtonOrPressEnter();
        return new SearchResultsSteps();
    }

    // Метод для обновления страницы поиска.
    // Обращается к методу updatePage() класса SearchPage.
    public SearchSteps updateSearchPage() {
        searchPage.updatePage();
        return this; // Возвращение экземпляра текущего класса для поддержки паттерна "fluent interface".
    }
}
