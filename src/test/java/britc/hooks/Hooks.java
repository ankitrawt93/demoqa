package britc.hooks;

import britc.driver.DriverFactory;
import britc.utils.ConfigReader;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void setup(){

        String url = ConfigReader.get("url");
        DriverFactory.initDriver();
        WebDriver driver = DriverFactory.getDriver();
        driver.get(url);
    }

    @After
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
