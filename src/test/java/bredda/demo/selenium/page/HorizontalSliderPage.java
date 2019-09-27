package bredda.demo.selenium.page;

import bredda.demo.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage extends BasePage {

    private final static By slider = By.cssSelector(".sliderContainer input");
    private final static By counter = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    public void ouvrirLaPage() {
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
    }
    public void incrementerXFoisSliderViaClavier(final int times) {
        driver.findElement(slider).click();
        for (int i = 0 ; i < times ; i++ ){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }

    }
    public void decrementerXFoisSliderViaClavier(final int times) {
        driver.findElement(slider).click();
        for (int i = 0 ; i < times ; i++ ){
            driver.findElement(slider).sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void incrementerSliderViaDragAndDrop() {
        // TODO
    }

    public void decrementerSliderViaDragAndDrop() {
        // TODO
    }



    public String getCounter() {
        return driver.findElement(counter).getText();
    }
}
