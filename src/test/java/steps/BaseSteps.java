package steps;

import org.openqa.selenium.WebDriver;

import static tests.BaseTest.getDriver;

public class BaseSteps {

    // Поле для хранения объекта WebDriver.
    WebDriver driver;

    // Конструктор класса BaseSteps.
    // Использует метод getDriver() для получения экземпляра WebDriver.
    public BaseSteps() {
        driver = getDriver();
    }
}
