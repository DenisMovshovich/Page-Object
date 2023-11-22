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
    public BasePage() {
        // Создается объект driver и присваивается значение, возвращенное методом getDriver().
        driver = getDriver();

        // Используется метод из библиотеки PageFactory для инициализации элементов страницы.
        // В данном случае, элементы инициализируются на основе объекта driver и текущего экземпляра класса BasePage (this).
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void goToUrl(String text) { driver.navigate().to(text); }
    public void updatePage() { driver.navigate().refresh(); }
    public void goBack() { driver.navigate().back(); }
    public void goForward() { driver.navigate().forward(); }

    boolean isElementFound(By by, int timeout) throws InterruptedException {
        List<WebElement> elements = driver.findElements(by);
        for (int i = 0; (i<timeout)&&(elements.isEmpty()); i++) {
            Thread.sleep(1000);
            elements = driver.findElements(by);
        }
        return !elements.isEmpty();
    }
}
