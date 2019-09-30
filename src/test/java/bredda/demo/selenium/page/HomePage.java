package bredda.demo.selenium.page;

import bredda.demo.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public final static By heading = By.cssSelector("h1.heading");
    public final static By links = By.cssSelector("ul li a");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void ouvrirLaPage() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    public void cliquerSurLeLien(final String link) {
        driver.findElements(links).stream().filter(e -> e.getText() == link).findFirst().get().click();
    }


}
