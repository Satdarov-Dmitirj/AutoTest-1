package ru.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUiTextBox {
    protected WebDriver driver;
    protected WebDriverWait driverWait;

    public PageUiTextBox(WebDriver driver, WebDriverWait driverWait){
        this.driver = driver;
        this.driverWait = driverWait;
    }

    private static final By INPUT_FULLNAME = By.xpath("//input[@placeholder='Full Name']");
    private static final By INPUT_EMAIL = By.xpath("//input[@placeholder='name@example.com']");
    private static final By INPUT_CURRENT_ADDRESS = By.xpath("currentAddress");
    private static final By INPUT_PERMANENT_ADDRESS = By.xpath("permanentAddress");

    public  void setUserName(String userName){
        driver.findElement(INPUT_FULLNAME).sendKeys(userName);
    }

    public  void setUserEmail(String userEmail){
        driver.findElement(INPUT_EMAIL).sendKeys(userEmail);
    }

    public void setInputCurrentAddress(String currentAddress){
        driver.findElement(INPUT_CURRENT_ADDRESS).sendKeys(currentAddress);
    }

    public void setInputPermanentAddress(String permanentAddress){
        driver.findElement(INPUT_PERMANENT_ADDRESS).sendKeys(permanentAddress);
    }

    public void openBasePage(){
        driver.get("https://demoqa.com/text-box");
    }
}
