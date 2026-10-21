package dmit2015.view;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumPracticeSeleniumIT {

    private WebDriver driver;
    private WebDriverWait wait;

    private final String baseUrl = "http://localhost:8080";

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void shouldOpenPracticePage() {
        // Activity 1
    }

    @Test
    void shouldSubmitSearchRequest() {
        // Activities 3 and 4
    }

    @Test
    void shouldNavigateHome() {
        // Activity 5
    }

    @Test
    void shouldDisplayValidationMessage() {
        // Activity 6
    }

    @Test
    void shouldClearSearchRequest() {
        // Activity 7
    }

}