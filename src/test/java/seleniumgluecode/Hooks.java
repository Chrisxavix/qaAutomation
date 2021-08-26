package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browsermanager.DriverManager;
import runner.browsermanager.DriverManagerFactory;
import runner.browsermanager.DriverType;

public class Hooks {
    private static WebDriver driver;
    private DriverManager driverManager;

    @Before
    public void setUp() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        driver.get("https://imalittletester.com");
    }

    @After
    public void tearDown(Scenario scenario){
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
