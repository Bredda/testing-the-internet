package bredda.demo.selenium.test;

import bredda.demo.selenium.base.BaseTest;
import bredda.demo.selenium.page.DropdownPage;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DropdownTest extends BaseTest {

    DropdownPage dropdownPage;

    @Test
    public void devrait_selectionner_une_valeur_dans_un_dropdown() {
        final String optionTest = "Option 1";
        dropdownPage = new DropdownPage(driver);

        dropdownPage.ouvrirLaPage();
        dropdownPage.selectionnerOptionDuDropdown(optionTest);

        assertThat(dropdownPage.getOptionSelectionnee()).containsOnly(optionTest);

    }
}
