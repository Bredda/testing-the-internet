package bredda.demo.selenium.page;

import bredda.demo.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final static By usernameInput = By.id("username");
    private final static By passwordInput = By.id("password");
    private final static By loginBtn = By.cssSelector("#login button");
    private final static By flashMessage = By.id("flash");

    public void ouvrirLaPage() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    public void renseignerUsername(final String username) {
        driver.findElement(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys(username);
    }
    public void renseignerPassword(final String password) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }
    public void cliquerLogin() {
        driver.findElement(loginBtn).click();
    }
    public String getFlashMessage() {
        return driver.findElement(flashMessage).getText();
    }
    public boolean isMessageSuccess() {
        return driver.findElement(flashMessage).getAttribute("class").contains("success");
    }
    public boolean isMessageError() {
        return driver.findElement(flashMessage).getAttribute("class").contains("error");
    }
}
