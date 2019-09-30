package bredda.demo.selenium.page;

import bredda.demo.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class BrokenImagesPage extends BasePage {

    private final static By allImages = By.cssSelector("img");

    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    public void ouvrirLaPage() {
        driver.get("https://the-internet.herokuapp.com/broken_images");
    }

    public boolean isDisplayingBrokenImages() {
        return !driver.findElements(allImages).stream().filter(e -> this.isImageBroken(e)).collect(Collectors.toList()).isEmpty();
    }



}
