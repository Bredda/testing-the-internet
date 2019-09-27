package bredda.demo.selenium.test;

import bredda.demo.selenium.base.BaseTest;
import bredda.demo.selenium.page.LoginPage;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest extends BaseTest {

    private final static String VALID_USER="tomsmith";
    private final static String VALID_PWD="SuperSecretPassword!";

    @Test
    public void devrait_logguer_un_user_valide() {

        LoginPage loginPage = new LoginPage(this.driver);

        loginPage.ouvrirLaPage();
        loginPage.renseignerUsername(VALID_USER);
        loginPage.renseignerPassword(VALID_PWD);
        loginPage.cliquerLogin();

        assertThat(loginPage.getFlashMessage()).contains("You logged into a secure area!");
        assertThat(loginPage.isMessageSuccess()).isTrue();
    }
    @Test
    public void ne_devrait_pas_logguer_un_user_invalide() {

        LoginPage loginPage = new LoginPage(this.driver);

        loginPage.ouvrirLaPage();
        loginPage.renseignerUsername("john");
        loginPage.renseignerPassword("password");
        loginPage.cliquerLogin();

        assertThat(loginPage.getFlashMessage()).contains("Your username is invalid!");
        assertThat(loginPage.isMessageError()).isTrue();
    }


}
