package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNew(By element) throws Exception {
        try {
            driver.findElement(element).click();
        } catch (Exception e) {
            throw new Exception("No se puede clickear en el elemento " + element);
        }
    }

    public void clickNew(WebElement element) throws Exception {
        try {
            element.click();
        } catch (Exception e) {
            throw new Exception("No se puede clickear en el elemento " + element);
        }
    }

    public boolean isDisplayedNew(By element) throws Exception {
        try {
            return driver.findElement(element).isDisplayed();
        } catch (Exception e) {
            throw new Exception("El elemento " + element + " no es visible en el DOM");
        }
    }

    public boolean isDisplayedNew(WebElement element) throws Exception {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            throw new Exception("El elemento " + element + " no es visible en el DOM");
        }
    }

    public String getTextNew(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("No se pudo traer el texto del elemento " + element);
        }

    }

    public String getTextNew(WebElement element) throws Exception {
        try {
            return element.getText();
        } catch (Exception e) {
            throw new Exception("No se pudo traer el texto del elemento " + element);
        }
    }

    public String getTitleNew() throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("No se pudo extraer el título de la paǵina");
        }
    }
}
