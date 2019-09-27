package bredda.demo.selenium.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver77.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
