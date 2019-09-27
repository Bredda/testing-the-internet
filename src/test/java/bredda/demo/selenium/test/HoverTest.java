package bredda.demo.selenium.test;

import bredda.demo.selenium.base.BaseTest;
import bredda.demo.selenium.page.HoverPage;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HoverTest extends BaseTest {

    HoverPage hoverPage;

    @Test
    public void devrait_afficher_info_user_on_hover() {
        final int  userIndex = 1 ;
        hoverPage = new HoverPage(driver);

        hoverPage.ouvrirLaPage();

        HoverPage.UserInfoBloc userInfoBloc = hoverPage.hoverSurImage(userIndex);

        assertThat(userInfoBloc.isDisplayed()).isTrue();
        assertThat(userInfoBloc.getNomUser()).isEqualTo("user1");
        assertThat(userInfoBloc.getUserLink()).contains("/users/" + userIndex );
        assertThat(userInfoBloc.getUserLinkText()).isEqualTo("View profile");



    }
}
