package bredda.demo.selenium.page;

import bredda.demo.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementPage extends BasePage {

    private final static By addElementBtn = By.cssSelector(".example button");
    private final static By newElements = By.cssSelector("#elements button.added-manually");

    public AddRemoveElementPage(WebDriver driver) {
        super(driver);
    }

    public void ouvrirLaPage() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    public void ajouterNElement(int nombreElementAAjouter) {
        for(int i = 0 ; i < nombreElementAAjouter ; i++) {
            driver.findElement(addElementBtn).click();
        }
    }

    public int getNombreElement() {
        return driver.findElements(newElements).size();
    }

}
