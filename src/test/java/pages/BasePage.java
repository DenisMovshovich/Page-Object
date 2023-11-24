package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static tests.BaseTest.getDriver;

public abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    // Конструктор класса BasePage.
    // В этом конструкторе инициализируется WebDriver и WebDriverWait.
    // WebDriver используется для взаимодействия с браузером, а WebDriverWait - для ожидания элементов на странице.
    public BasePage() {
        // Создается объект driver и присваивается значение, возвращенное методом getDriver().
        driver = getDriver();

        // Используется метод из библиотеки PageFactory для инициализации элементов страницы.
        // В данном случае, элементы инициализируются на основе объекта driver и текущего экземпляра класса BasePage (this).
        PageFactory.initElements(driver, this);

        // Инициализируется объект WebDriverWait с таймаутом ожидания в 5 секунд.
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    // Метод для перехода по указанному URL.
    public void goToUrl(String text) {
        driver.navigate().to(text);
    }

    // Метод для обновления страницы.
    public void updatePage() {
        driver.navigate().refresh();
    }

    // Метод для возврата на предыдущую страницу.
    public void goBack() {
        driver.navigate().back();
    }

    // Метод для перехода на следующую страницу.
    public void goForward() {
        driver.navigate().forward();
    }

    // Метод для проверки наличия элемента по заданному локатору в течение указанного времени.
    // Этот метод используется для динамического ожидания появления элемента на странице.
    boolean isElementFound(By by, int timeout) throws InterruptedException {
        // Находит все элементы с заданным локатором.
        List<WebElement> elements = driver.findElements(by);

        // Перебирает цикл до тех пор, пока не найдется элемент или не истечет таймаут.
        for (int i = 0; (i < timeout) && (elements.isEmpty()); i++) {
            // Приостанавливает выполнение теста на 1 секунду.
            Thread.sleep(1000);

            // Повторно ищет элементы с заданным локатором.
            elements = driver.findElements(by);
        }

        // Возвращает true, если элемент найден, и false в противном случае.
        return !elements.isEmpty();
    }
}
