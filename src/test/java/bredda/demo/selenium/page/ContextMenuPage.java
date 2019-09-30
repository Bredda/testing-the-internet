package bredda.demo.selenium.page;

import bredda.demo.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {

    private static final By hotSpot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void ouvrirLaPage() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
    }

    public void faireUnClickDroitDansHotspot() {
        Actions actions = new Actions(driver);
        WebElement hostpotEl = driver.findElement(hotSpot);

        actions.contextClick(hostpotEl).perform();
    }

    public boolean isAlertOpened() {
        return driver.switchTo().alert().getText().equals("You selected a context menu");
    }


}
