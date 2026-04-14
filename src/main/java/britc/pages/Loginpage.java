package britc.pages;

import org.openqa.selenium.By;

public class Loginpage extends BasePage{
    private By userNameField= By.id("userName");
    private By pwdField= By.id("password");
    private By loginBtn= By.id("login");

    private By loginToBookStoreText=By.xpath("//h5[normalize-space()='Login in Book Store']");
    public void isLoginPageLoaded(){
        waitForElementVisibility(loginToBookStoreText);
    }
    public void fillUserNameAndPwdAndclickLogin(String userName, String password){
        waitForElementVisibility(userNameField).sendKeys(userName);
        waitForElementVisibility(pwdField).sendKeys(password);
        waitForElementToBeClickable(loginBtn).click();
    }
}
