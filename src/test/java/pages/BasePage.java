package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static tests.BaseTest.getDriver;

public abstract class BasePage {

    WebDriver driver;

    // Конструктор класса BasePage.
    public BasePage() {
        // Создается объект driver и присваивается значение, возвращенное методом getDriver().
        driver = getDriver();

        // Используется метод из библиотеки PageFactory для инициализации элементов страницы.
        // В данном случае, элементы инициализируются на основе объекта driver и текущего экземпляра класса BasePage (this).
        PageFactory.initElements(driver, this);
    }

    public void goToUrl(String text) { driver.navigate().to(text); }
    public void updatePage() { driver.navigate().refresh(); }
    public void goBack() { driver.navigate().back(); }
    public void goForward() { driver.navigate().forward(); }

}
