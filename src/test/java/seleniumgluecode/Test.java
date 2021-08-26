package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Test extends TestBase {

    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void elUsuarioSeEncuentraEnLaPaginaHomeDeImalittletester() throws Throwable {
        /* Usando Getters */
        /*System.out.println(homePage.getTitleHomePage());
        Assert.assertEquals(homePage.getTitleHomePage(), driver.getTitle());*/

        /* Usando Acciones de la clase */
        Assert.assertTrue(homePage.HomePageDisplayed());
    }

    @When("^Hace click sobre el titulo The little tester comics$")
    public void haceClickSobreElTituloTheLittleTesterComics() throws Throwable {
        /* Usando Getters */
        /*driver.findElement(homePage.getTitleComicsLocator()).click();*/

        /* Usando Acciones de la clase */
        homePage.clickTitle();
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void seDebeRedirigirAlaPantallaComics() throws Throwable {
        /* Usando Getters */
        /*WebElement pageTitle = driver.findElement(comicsPage.getPageTitleLocater());
        Assert.assertTrue("Error", pageTitle.isDisplayed());
        Assert.assertEquals(comicsPage.getTitlePage(), pageTitle.getText());*/

        /* Usando Acciones de la clase */
        Assert.assertTrue("Error", comicsPage.isTitleComicsDisplayAndEqualsComic());
    }
}
