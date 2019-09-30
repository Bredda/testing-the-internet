package bredda.demo.selenium.test;

import bredda.demo.selenium.base.BaseTest;
import bredda.demo.selenium.page.BrokenImagesPage;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BrokenImageTest extends BaseTest {

    BrokenImagesPage brokenImagesPage;

    @Test
    public void devrait_trouver_presence_image_broken() {
        brokenImagesPage = new BrokenImagesPage(driver);

        brokenImagesPage.ouvrirLaPage();

        assertThat(brokenImagesPage.isDisplayingBrokenImages()).isFalse();

    }

}
