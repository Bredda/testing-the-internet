package bredda.demo.selenium.test;

import bredda.demo.selenium.base.BaseTest;
import bredda.demo.selenium.page.KeyPressesPage;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static org.assertj.core.api.Assertions.assertThat;

public class KeyPressesTest extends BaseTest {

    KeyPressesPage keyPressesPage;

    @Test
    public void devrait_renseigner_dans_input() {
        keyPressesPage = new KeyPressesPage(driver);

        keyPressesPage.ouvrirLaPage();

        keyPressesPage.taperLeTexte(Keys.chord(Keys.ALT, "227"));

        assertThat(keyPressesPage.getResult()).isEqualTo("7");


    }
}
