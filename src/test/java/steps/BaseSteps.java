package steps;

import org.openqa.selenium.WebDriver;

import static tests.BaseTest.getDriver;

public class BaseSteps {

    WebDriver driver;

    public BaseSteps() {
        driver = getDriver();

    }
}
