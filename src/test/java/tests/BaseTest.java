package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import steps.SearchSteps;

import java.io.File;

public abstract class BaseTest {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp() {
        File file = new File("src/test/resources/chromedriver.exe"); //        Здесь создается объект `File` для представления пути к исполняемому файлу драйвера браузера. В данном случае, это ChromeDriver. Путь к драйверу указывается в строке `"src/test/resources/chromedriver.exe"`.
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());//        Эта строка устанавливает системное свойство `webdriver.chrome.driver`, которое указывает Selenium на местоположение исполняемого файла ChromeDriver. `file.getAbsolutePath()` возвращает абсолютный путь к файлу, указанный в предыдущей строке.
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--lang=en");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/ncr");
    }

    @AfterClass
    public void tearDown() {
    if (driver != null) {
            driver.quit();
        }}

}
