package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    private By titleComicsLocator = By.id("menu-item-2008");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    /* Getters */
    public String getTitleHomePage() {
        return this.titleHomePage;
    }

    public By getTitleComicsLocator() {
        return this.titleComicsLocator;
    }

    /* Acciones */
    public boolean HomePageDisplayed() throws Exception {
        return this.getTitleNew().equalsIgnoreCase(this.titleHomePage);
    }

    public void clickTitle() throws Exception {
        this.clickNew(titleComicsLocator);
    }
}
