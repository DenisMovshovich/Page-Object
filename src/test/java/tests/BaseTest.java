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

public abstract class BaseTest {

    private static WebDriver driver;
    SearchPage searchPage;
    SearchResultsPage searchResultsPage;


    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUpDriver() {
        driver = DriverFactory.getDriver(PropertyReader.getBrowser());
        driver.get(PropertyReader.getUrl());
        searchPage = new SearchPage();
        searchResultsPage = new SearchResultsPage();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
