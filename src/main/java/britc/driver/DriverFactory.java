package britc.driver;

import britc.utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    private static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<>();

    public static WebDriver initDriver(){
        String browser= ConfigReader.get("browser");

                switch(browser.toLowerCase()){
                    case "chrome":{
                        WebDriverManager.chromedriver().setup();
                        ChromeOptions options =new ChromeOptions();
                        options.addArguments("--start-maximized");
                        tlDriver.set(new ChromeDriver(options));
                        break;
                    }
                    default: throw new RuntimeException("browser not suppported "+browser);
                }

        return tlDriver.get();

    }
    public static WebDriver getDriver() {
        if (tlDriver != null) {
            return tlDriver.get();
        }
        else throw new RuntimeException("driver not initialized");
    }

    public static void quitDriver(){
        if (tlDriver.get()!=null){
            tlDriver.get().quit();
//            tlDriver.remove();
        }
    }
}
