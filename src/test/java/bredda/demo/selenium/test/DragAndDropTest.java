package bredda.demo.selenium.test;

import bredda.demo.selenium.base.BaseTest;
import bredda.demo.selenium.page.DragAndDropPage;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DragAndDropTest extends BaseTest {

    DragAndDropPage dragAndDropPage;


    @Test
    public void devrait_faire_un_drag_and_drop() {
        dragAndDropPage = new DragAndDropPage(driver);

        dragAndDropPage.ouvrirLaPage();

        assertThat(dragAndDropPage.blocAIsFirst()).isTrue();

        dragAndDropPage.ouvrirLaPage();

        dragAndDropPage.dragAndDropASurB();

        assertThat(dragAndDropPage.blocAIsFirst()).isFalse();

    }
}
