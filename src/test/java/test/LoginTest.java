package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest
{
    WebDriver driver;
    LoginPage login;

    @BeforeEach
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        login = new LoginPage(driver);
    }

    @Test
    void loginCorrecto()
    {
        login.loginCompleto("standard_user", "secret_sauce");
        assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @Test
    void loginIncorrecto() throws InterruptedException
    {
        login.loginCompleto("standard_user", "contraseña");
        Thread.sleep(2000);
        assertTrue(login.obtenerError().contains("Epic sadface: Username and password do not match any user in this service"));
    }

    @AfterEach
    void tearDown()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }
}
