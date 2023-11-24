package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pages.SearchPage;
import pages.SearchResultsPage;
import steps.SearchSteps;
import utils.Browser;
import utils.DriverFactory;
import utils.PropertyReader;

import java.io.File;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    // Статическое поле для хранения объекта WebDriver.
    private static WebDriver driver;

    // Поля для хранения объектов страниц.
    SearchPage searchPage;
    SearchResultsPage searchResultsPage;

    // Метод для получения экземпляра WebDriver.
    public static WebDriver getDriver() {
        return driver;
    }

    // Метод, выполняющийся перед всеми тестами, инициализирует WebDriver и открывает страницу по указанному URL.
    @BeforeClass
    public void setUpDriver() {
        // Использует метод getDriver() класса DriverFactory для получения экземпляра WebDriver.
        driver = DriverFactory.getDriver(PropertyReader.getBrowser());

        //        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Открывает указанное URL в браузере.
        driver.get(PropertyReader.getUrl());

        // Инициализация объектов страниц.
        searchPage = new SearchPage();
        searchResultsPage = new SearchResultsPage();
    }

    // Метод, выполняющийся после всех тестов, закрывает браузер.
    @AfterClass
    public void tearDown() {
        // Проверка, что объект WebDriver существует.
        if (driver != null) {
            // Завершение работы WebDriver.
            driver.quit();
        }
    }
}
