package bredda.demo.selenium.test;

import bredda.demo.selenium.base.BaseTest;
import bredda.demo.selenium.page.ContextMenuPage;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContextMenuTest extends BaseTest {

    ContextMenuPage contextMenuPage;

    @Test
    public void devrait_faire_un_click_droit() {
        contextMenuPage = new ContextMenuPage(driver);

        contextMenuPage.ouvrirLaPage();
        contextMenuPage.faireUnClickDroitDansHotspot();

        assertThat(contextMenuPage.isAlertOpened()).isTrue();


    }


}
