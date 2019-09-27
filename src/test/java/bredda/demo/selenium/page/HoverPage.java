package bredda.demo.selenium.page;

import bredda.demo.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage extends BasePage {

    private final static By userImages = By.cssSelector(".figure");
    private final static By userInfoBlocElement = By.cssSelector(".figcaption");


    public class UserInfoBloc {
        private WebElement userInfo;
        private final By nameForSpecificCaption = By.tagName("h5");
        private final By linkForSpecificCaption = By.tagName("a");

        private UserInfoBloc(WebElement userInfoBloc){
            this.userInfo = userInfoBloc;
        }
        public boolean isDisplayed() {
            return this.userInfo.isDisplayed();
        }

        public String getNomUser() {
            return this.userInfo.findElement(nameForSpecificCaption).getText().split(" ")[1];
        }
        public String getUserLink() {
            return this.userInfo.findElement(linkForSpecificCaption).getAttribute("href");
        }
        public String getUserLinkText() {
            return this.userInfo.findElement(linkForSpecificCaption).getText();
        }

    }


    public HoverPage(WebDriver driver) {
        super(driver);
    }

    public void ouvrirLaPage() {
        this.driver.get("https://the-internet.herokuapp.com/hovers");
    }

    public UserInfoBloc hoverSurImage(final int index) {
        WebElement userImage = driver.findElements(userImages).get(index-1);
        Actions action = new Actions(driver);
        action.moveToElement(userImage).perform();
        return new UserInfoBloc(userImage.findElement(this.userInfoBlocElement));
    }



}
