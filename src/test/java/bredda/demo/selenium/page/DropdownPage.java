package bredda.demo.selenium.page;

import bredda.demo.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends BasePage {

    private static final By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void ouvrirLaPage() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    public void selectionnerOptionDuDropdown(final String option) {
        getDropdownElement().selectByVisibleText(option);
    }

    public List<String> getOptionSelectionnee() {
        return getDropdownElement().getAllSelectedOptions().stream().map(WebElement::getText).collect(Collectors.toList());
    }

    private Select getDropdownElement() {
        return new Select(driver.findElement(dropdown));
    }

}
