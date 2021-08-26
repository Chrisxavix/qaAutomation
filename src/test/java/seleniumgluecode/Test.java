package seleniumgluecode;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.bson.Document;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Test {

    private ChromeDriver driver = Hooks.getDriver();

    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void elUsuarioSeEncuentraEnLaPaginaHomeDeImalittletester() throws Throwable {
        Assert.assertEquals("imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.", driver.getTitle());
    }

    @When("^Hace click sobre el titulo The little tester comics$")
    public void haceClickSobreElTituloTheLittleTesterComics() throws Throwable {
        driver.findElement(By.id("menu-item-2008")).click();
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void seDebeRedirigirAlaPantallaComics() throws Throwable {
        WebElement pageTitle = driver.findElement(By.className("page-title"));
        Assert.assertTrue("Error", pageTitle.isDisplayed());
        Assert.assertEquals("Category: comics", pageTitle.getText());
    }
}
