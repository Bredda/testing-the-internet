package bredda.demo.selenium.test;

import bredda.demo.selenium.base.BaseTest;
import bredda.demo.selenium.page.AddRemoveElementPage;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddRemoveElementTest extends BaseTest {

    AddRemoveElementPage addRemoveElementPage;

    @Test
    public void devrait_ajouter_des_elements() {
        final int nombreElementAAjouter = 4;

        addRemoveElementPage = new AddRemoveElementPage(driver);

        addRemoveElementPage.ouvrirLaPage();

        addRemoveElementPage.ajouterNElement(nombreElementAAjouter);

        assertThat(addRemoveElementPage.getNombreElement()).isEqualTo(nombreElementAAjouter);

    }

}
