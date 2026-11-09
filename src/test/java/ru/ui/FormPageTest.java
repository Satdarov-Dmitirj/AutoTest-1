/*package ru.ui;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormPageTest{

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    public FormPageTest(WebDriver driver, WebDriverWait driverWait){
        this.driver = driver;
        this.webDriverWait = driverWait;
    }

    private static final By GENDER_MALE = By.xpath("//input[@id='gender-radio-1']");
    private static final By GENDER_FEMALE = By.xpath("//input[@id='gender-radio-2']");
    private static final By INPUT_FULLNAME = By.xpath("//input[@placeholder='Full Name']");
    private static final By INPUT_EMAIL = By.xpath("//input[@placeholder='name@example.com']");
    private static final By INPUT_CURRENT_ADDRESS = By.id("currentAddress");
    private static final By INPUT_PERMANENT_ADDRESS = By.id("permanentAddress");
    private static final By SUBMIT_BUTTON = By.id("submit");

    public void openBasePage() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    public void setUserName(String userName) {
        driver.findElement(INPUT_FULLNAME).sendKeys(userName);
    }

    public void setUserEmail(String userEmail) {
        driver.findElement(INPUT_EMAIL).sendKeys(userEmail);
    }

    public void setCurrentAddress(String address) {
        driver.findElement(INPUT_CURRENT_ADDRESS).sendKeys(address);
    }

    public void setPermanentAddress(String address) {
        driver.findElement(INPUT_PERMANENT_ADDRESS).sendKeys(address);
    }

    public void selectGenderMale() {
        driver.findElement(GENDER_MALE).click();
    }

    public void selectGenderFemale() {
        driver.findElement(GENDER_FEMALE).click();
    }

    public void submitForm() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(SUBMIT_BUTTON)).click();
    }
}

 */

