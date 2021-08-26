package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComicsPage extends BasePage {

    private String titlePage = "Category: comics";
    private By pageTitleLocater = By.xpath("//*[@id='page-header']/div/div/div/div/header/h1");

    public ComicsPage(WebDriver driver) {
        super(driver);
    }

    /* Getters */
    public String getTitlePage() {
        return this.titlePage;
    }

    public By getPageTitleLocater() {
        return this.pageTitleLocater;
    }

    /* Acciones */
    public boolean isTitleComicsDisplayAndEqualsComic() throws Exception {
        return this.isDisplayedNew(this.pageTitleLocater) &&
                this.getTextNew(this.pageTitleLocater).equalsIgnoreCase(titlePage);
    }
}
