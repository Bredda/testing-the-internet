package bredda.demo.selenium;

import bredda.demo.selenium.base.BaseTest;
import bredda.demo.selenium.page.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MyTest extends BaseTest {

    @Test
    public void devrait_trouver_element_par_css() {
        WebElement heading = driver.findElement(HomePage.heading);
        assertThat(heading).isNotNull();
    }

    @Test
    public void devrait_trouver_une_liste_d_element_par_css() {
        List<WebElement> links = driver.findElements(HomePage.links);
        assertThat(links).isNotEmpty();
    }

}
