package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(xpath = "//div[4]/center/input[1]")
    private WebElement googleSearchButton;

    @FindBy(xpath = "//div[4]/center/input[2]")
    private WebElement ImFeelingLuckyButton;

    @FindBy(xpath = "//*[@id='gb']/div/div[1]/div/div[1]/a")
    private WebElement gMailButton;

    @FindBy(xpath = "//*[@id='gb']/div/div[1]/div/div[2]/a")
    private WebElement imagesButton;

    @FindBy(xpath = "//div/div[@class='XDyW0e']")
    private WebElement searchByVoiceButton;

    @FindBy(xpath = "//div/div[@class='nDcEnd']")
    private WebElement searchByImageButton;

    @FindBy(xpath = "//*[@id='gbwa']/div/a")
    private WebElement googleAppsButton;

    @FindBy(xpath = "//*[@id='gb']/div/div[2]/div[2]/div/a")
    private WebElement googleAccountButton;


//     Конструктор по умолчанию класса SearchPage.
//     Использует конструктор суперкласса для инициализации объекта SearchPage.
    public SearchPage() {
        super();
    }

    public void fillSearchField(String text) {
        searchField.click();
        searchField.sendKeys(text);
    }

    public void clearSearchField() {
        searchField.click();
        searchField.clear();
    }

    public void pressEnter() {
        searchField.sendKeys(Keys.RETURN);
    }

    public void pressGoogleSearchButton() {
        googleSearchButton.click();
    }

    public void pressImFeelingLuckyButton() {
        ImFeelingLuckyButton.click();
    }

    public void pressGmailButton() {
        gMailButton.click();
    }

    public void pressImagesButton() {
        imagesButton.click();
    }

    public void pressSearchByVoiceButton() {
        searchByVoiceButton.click();
    }

    public void pressGoogleAppsButton() {
        googleAppsButton.click();
    }

    public void pressGoogleAccountButton() {
        googleAccountButton.click();
    }

}
