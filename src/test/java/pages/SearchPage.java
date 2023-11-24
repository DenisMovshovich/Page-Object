package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage {

    // Поиск элемента по имени "q" и присвоение его переменной searchField.
    @FindBy(name = "q")
    private WebElement searchField;

    // Поиск элемента по имени "btnK" и присвоение его переменной searchButton.
    @FindBy(name = "btnK")
    private WebElement searchButton;

    // Поиск элемента по XPath и присвоение его переменной imFeelingLuckyButton.
    @FindBy(xpath = "//div[4]/center/input[2]")
    private WebElement imFeelingLuckyButton;

    // Поиск элемента по XPath и присвоение его переменной gMailButton.
    @FindBy(xpath = "//*[@id='gb']/div/div[1]/div/div[1]/a")
    private WebElement gMailButton;

    // Поиск элемента по XPath и присвоение его переменной imagesButton.
    @FindBy(xpath = "//*[@id='gb']/div/div[1]/div/div[2]/a")
    private WebElement imagesButton;

    // Поиск элемента по XPath и присвоение его переменной searchByVoiceButton.
    @FindBy(xpath = "//div/div[@class='XDyW0e']")
    private WebElement searchByVoiceButton;

    // Поиск элемента по XPath и присвоение его переменной searchByImageButton.
    @FindBy(xpath = "//div/div[@class='nDcEnd']")
    private WebElement searchByImageButton;

    // Поиск элемента по XPath и присвоение его переменной googleAppsButton.
    @FindBy(xpath = "//*[@id='gbwa']/div/a")
    private WebElement googleAppsButton;

    // Поиск элемента по XPath и присвоение его переменной googleAccountButton.
    @FindBy(xpath = "//*[@id='gb']/div/div[2]/div[2]/div/a")
    private WebElement googleAccountButton;

    // Конструктор по умолчанию класса SearchPage.
    // Использует конструктор суперкласса для инициализации объекта SearchPage.
    public SearchPage() {
        super();
    }

    // Метод для заполнения строки поиска переданным текстом.
    public void fillSearchField(String text) {
        searchField.click(); // Кликнуть на поле поиска.
        searchField.sendKeys(text); // Ввести текст в поле поиска.
    }

    // Метод для очистки строки поиска.
    public void clearSearchField() {
        searchField.click(); // Кликнуть на поле поиска.
        searchField.clear(); // Очистить текст в поле поиска.
    }

    // Метод для нажатия клавиши Enter.
    public void pressEnter() {
        searchField.sendKeys(Keys.RETURN); // Отправить клавишу Enter в поле поиска.
    }

    // Метод для нажатия кнопки поиска или клавиши Enter, если кнопка не найдена.
    public void pressSearchButtonOrPressEnter() throws InterruptedException {
        if (isElementFound(By.name("btnK"), 3)) {
            wait.until(ExpectedConditions.elementToBeClickable(searchButton)); // Ожидание, пока кнопка станет кликабельной.
            searchButton.click(); // Кликнуть на кнопку поиска.
        } else {
            pressEnter(); // Если кнопка не найдена, отправить клавишу Enter.
        }
    }

    // Метод для нажатия кнопки "I'm Feeling Lucky".
    public void pressImFeelingLuckyButton() {
        imFeelingLuckyButton.click(); // Кликнуть на кнопку "I'm Feeling Lucky".
    }

    // Метод для нажатия кнопки "Gmail".
    public void pressGmailButton() {
        gMailButton.click(); // Кликнуть на кнопку "Gmail".
    }

    // Метод для нажатия кнопки "Images".
    public void pressImagesButton() {
        imagesButton.click(); // Кликнуть на кнопку "Images".
    }

    // Метод для нажатия кнопки "Search by Voice".
    public void pressSearchByVoiceButton() {
        searchByVoiceButton.click(); // Кликнуть на кнопку "Search by Voice".
    }

    // Метод для нажатия кнопки "Google Apps".
    public void pressGoogleAppsButton() {
        googleAppsButton.click(); // Кликнуть на кнопку "Google Apps".
    }

    // Метод для нажатия кнопки "Google Account".
    public void pressGoogleAccountButton() {
        googleAccountButton.click(); // Кликнуть на кнопку "Google Account".
    }
}
