package britc.pages;

import britc.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

 public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(){
        driver= DriverFactory.getDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public WebElement waitForElementVisibility(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementToBeClickable(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
