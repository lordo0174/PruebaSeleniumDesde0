package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    WebDriver driver;

    By btn_backpack = By.id("add-to-cart-sauce-labs-backpack");
    By btn_bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By cart_badge = By.className("shopping_cart_badge");

    public InventoryPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void añadirMochila()
    {
        driver.findElement(btn_backpack).click();
    }

    public void añadirLuzBici()
    {
        driver.findElement(btn_bikeLight).click();
    }

    public String obtenerContadorCarrito()
    {
        return driver.findElement(cart_badge).getText();
    }

    public String obtenerTextoBotonMochila()
    {
        return driver.findElement(By.id("remove-sauce-labs-backpack")).getText();
    }
}
