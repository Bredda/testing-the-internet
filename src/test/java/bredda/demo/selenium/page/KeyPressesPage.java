package bredda.demo.selenium.page;

import bredda.demo.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends BasePage {

    private final static By targetInput = By.id("target");
    private final static By resultMessage = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    public void ouvrirLaPage(){
        driver.get("https://the-internet.herokuapp.com/key_presses");
    }

    public void taperLeTexte(final String texte) {
        driver.findElement(targetInput).sendKeys(texte);
    }

    public String getResult() {
        return this.driver.findElement(resultMessage).getText();
    }

}
