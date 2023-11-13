package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;

public class DriverFactory {

    private static WebDriver driver;
    private static final String DRIVER_PATH = "src/test/resources/";

    public static WebDriver getDriver(Browser browser) {
        File file;

        switch (browser) {
            case CHROME -> {
                file = new File(DRIVER_PATH + "chromedriver.exe");         //        Здесь создается объект `File` для представления пути к исполняемому файлу драйвера браузера. В данном случае, это ChromeDriver. Путь к драйверу указывается в строке `"src/test/resources/chromedriver.exe"`.
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());   //        Эта строка устанавливает системное свойство `webdriver.chrome.driver`, которое указывает Selenium на местоположение исполняемого файла ChromeDriver. `file.getAbsolutePath()` возвращает абсолютный путь к файлу, указанный в предыдущей строке.
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--lang=en");
                driver = new ChromeDriver(chromeOptions);
            }
            case EDGE -> {
                file = new File(DRIVER_PATH + "msedgedriver.exe");
                System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--lang=en");
                driver = new EdgeDriver(edgeOptions);
            }
        }
        return driver;
    }
}
