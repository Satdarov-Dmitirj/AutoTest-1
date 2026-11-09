/*package ru.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyFirstTest {

    private WebDriver driver;

    private static final By INPUT_FULLNAME = By.xpath("//input[@placeholder='Full Name']");
    private static final By INPUT_EMAIL = By.xpath("//input[@placeholder='name@example.com']");
    private static final By INPUT_CURRENT_ADDRESS = By.id("currentAddress");
    private static final By INPUT_PERMANENT_ADDRESS = By.id("permanentAddress");
    private static final By SUBMIT_BUTTON = By.id("submit");
    private static final By OUTPUT_NAME = By.id("name");
    private static final By OUTPUT_EMAIL = By.id("email");

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");
    }

    @AfterEach
    public void tearDown() {
       // driver.quit();
    }

    @Test
    public void fillFullNameAndEmail() {
        driver.findElement(INPUT_FULLNAME).sendKeys("Валера");
        driver.findElement(INPUT_EMAIL).sendKeys("Dmitrij_satdraov@mail.ru");
    }

    @Test
    public void submitFormShowsEnteredData() {
        driver.findElement(INPUT_FULLNAME).sendKeys("Валера");
        driver.findElement(INPUT_EMAIL).sendKeys("Dmitrij_satdraov@mail.ru");
        driver.findElement(SUBMIT_BUTTON).click();

        String outputName = driver.findElement(OUTPUT_NAME).getText();
        String outputEmail = driver.findElement(OUTPUT_EMAIL).getText();

        assertTrue(outputName.contains("Валера"));
        assertTrue(outputEmail.contains("Dmitrij_satdraov@mail.ru"));
    }

    @Test
    public void invalidEmailShowsErrorStyle() {
        driver.findElement(INPUT_FULLNAME).sendKeys("Валера");
        driver.findElement(INPUT_EMAIL).sendKeys("не-email");
        driver.findElement(SUBMIT_BUTTON).click();

        WebElement emailField = driver.findElement(INPUT_EMAIL);
        String classAttr = emailField.getAttribute("class");
        String styleAttr = emailField.getAttribute("style");

        System.out.println("class=" + classAttr);
        System.out.println("style=" + styleAttr);
    }

    @Test
    public void fillAddresses() {
        driver.findElement(INPUT_FULLNAME).sendKeys("Валера");
        driver.findElement(INPUT_EMAIL).sendKeys("Dmitrij_satdraov@mail.ru");
        driver.findElement(INPUT_CURRENT_ADDRESS).sendKeys("Москва, ул. Ленина, 1");
        driver.findElement(INPUT_PERMANENT_ADDRESS).sendKeys("Санкт-Петербург, Невский пр., 10");
        driver.findElement(SUBMIT_BUTTON).click();

        WebElement output = driver.findElement(By.id("output"));
        assertTrue(output.isDisplayed());
    }

    @Test
    public void selectDateOfBirthInPracticeForm() {
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthInput.click();

        Select monthSelect = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        monthSelect.selectByVisibleText("May");

        Select yearSelect = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        yearSelect.selectByVisibleText("1995");

        driver.findElement(By.xpath("//*[text()='25' and contains(@class,'react-datepicker__day')]")).click();

        assertEquals("25 May 1995", dateOfBirthInput.getAttribute("value"));
    }

    @Test
    public void addSubject() {
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
        subjectsInput.sendKeys("Maths");
        subjectsInput.sendKeys(Keys.ENTER);

        WebElement addedSubject = driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__multi-value')]//div[text()='Maths']"));
        assertTrue(addedSubject.isDisplayed());
    }
}

 */