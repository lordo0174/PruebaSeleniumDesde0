package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;

public class LoginPage
{
    WebDriver driver;

    By txt_username = By.id("user-name");
    By txt_password = By.id("password");
    By btn_login = By.id("login-button");
    By msg_error = By.cssSelector("[data-test='error']");

    public LoginPage (WebDriver driver)
    {
        this.driver = driver;
    }

    public void ingresarUsuario (String user)
    {
        driver.findElement(txt_username).sendKeys(user);
    }

    public void escribirPassword (String password)
    {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void pulsarLogin()
    {
        driver.findElement(btn_login).click();
    }

    public void loginCompleto (String usuario, String password)
    {
        ingresarUsuario(usuario);
        escribirPassword(password);
        pulsarLogin();
    }

    public String obtenerError()
    {
        return driver.findElement(msg_error).getText();
    }
}
