package bredda.demo.selenium.page;

import bredda.demo.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage extends BasePage {

    private static final By allBlocs = By.cssSelector("#columns .column");
    private static final By blocA = By.id("column-a");
    private static final By blocB = By.id("column-b");

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public void ouvrirLaPage() {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
    }

    public boolean blocAIsFirst() {
        return driver.findElements(allBlocs).get(0).getAttribute("id").equals("column-a");
    }

    public void dragAndDropASurB() {
        Actions actions = new Actions(driver);

        actions.dragAndDrop(driver.findElement(blocA), driver.findElement(blocB)).perform();

        actions.build();


    }



}
