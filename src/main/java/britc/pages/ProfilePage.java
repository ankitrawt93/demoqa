package britc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProfilePage extends BasePage{
    private By logOutBtn= By.xpath("(//button[normalize-space()='Logout'])");

    public void clickOnLogOutButton(){
        waitForElementToBeClickable(logOutBtn).click();
    }

    // STATE CHECK (for assertion in step class)
    public WebElement getLogoutButton() {
        return waitForElementVisibility(logOutBtn);
    }

    public boolean isProfilePageLoaded() {
        return getLogoutButton().isDisplayed();
    }
}
