package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InventoryPage;
import pages.LoginPage;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest
{
    WebDriver driver;
    LoginPage login;
    InventoryPage inventory;

    @BeforeEach
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        login = new LoginPage(driver);
        inventory = new InventoryPage(driver);

        login.loginCompleto("standard_user", "secret_sauce");
    }

    @Test
    void anadirUnProductoAlCarrito()
    {
        inventory.añadirMochila();
        assertEquals ("1", inventory.obtenerContadorCarrito());
    }

    @Test
    void anadirDosProductosAlCarrito()
    {
        inventory.añadirMochila();
        inventory.añadirLuzBici();
        assertEquals("2", inventory.obtenerContadorCarrito());
    }

    @Test
    void botonCambiaTrasAnadirProducto()
    {
        inventory.añadirMochila();
        assertEquals("Remove", inventory.obtenerTextoBotonMochila());
    }

    @AfterEach
    void tearDown()
    {
        if (driver != null) driver.quit();
    }
}