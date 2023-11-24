package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverFactory {

    // Статическое поле для хранения объекта WebDriver.
    private static WebDriver driver;

    // Метод для получения экземпляра WebDriver в зависимости от указанного браузера.
    public static WebDriver getDriver(Browser browser) {
        switch (browser) {
            // В случае CHROME создается и настраивается объект ChromeDriver.
            case CHROME -> {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--lang=en");
                driver = new ChromeDriver(chromeOptions);
            }
            // В случае EDGE создается и настраивается объект EdgeDriver.
            case EDGE -> {
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--lang=en");
                driver = new EdgeDriver(edgeOptions);
            }
        }
        // Возвращение объекта WebDriver.
        return driver;
    }
}
