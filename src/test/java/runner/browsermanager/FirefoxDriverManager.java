package runner.browsermanager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {
    @Override
    public void createDriver(){
        System.setProperty("webdriver.gecko.driver","./src/test/resources/firefox/geckodriver");
        driver = new FirefoxDriver();
    }
}
