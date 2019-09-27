package bredda.demo.selenium.test;

import bredda.demo.selenium.base.BaseTest;
import bredda.demo.selenium.page.HorizontalSliderPage;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HorizontalSliderTest extends BaseTest {



    HorizontalSliderPage horizontalSliderPage;

    @Test
    public void devrait_bouger_le_slider() {
        final double STEP = 0.5;
        final int increment = 5;
        final int decrement = 2;
        final double expectedResult = ((increment*STEP)-(decrement*STEP));

        horizontalSliderPage = new HorizontalSliderPage(driver);

        horizontalSliderPage.ouvrirLaPage();

        horizontalSliderPage.incrementerXFoisSliderViaClavier(increment);
        horizontalSliderPage.decrementerXFoisSliderViaClavier(decrement);

        assertThat(horizontalSliderPage.getCounter()).isEqualTo(String.valueOf(expectedResult));

    }

}
