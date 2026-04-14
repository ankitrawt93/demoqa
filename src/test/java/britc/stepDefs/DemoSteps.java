package britc.stepDefs;

import britc.pages.BooksPage;
import britc.pages.Loginpage;
import britc.pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class DemoSteps {
    BooksPage booksPagep;
    Loginpage loginPage;
    ProfilePage profilePage;
    public DemoSteps(){
        booksPagep=new BooksPage();
        loginPage =new Loginpage();
        profilePage=new ProfilePage();
    }

    @When("User is on DemoQA login page")
    public void UserLandsOnDemoQaPage(){
        booksPagep.isBooksPageLoaded();

    }
//
//    @Then("Page title should show {string}")
//    public void verifyPageTitle(String title){
//        Assert.assertEquals(title,lp.getPageTitle());
//    }

    @And("user clicks on login btn")
    public void userClicksOnLoginPage() {
        booksPagep.clickOnLogin();

    }

    @And("user lands on login page")
    public void userLandsOnLoginPage() {
        loginPage.isLoginPageLoaded();

    }


    @Then("user is able to login with the username {string} and password {string}")
    public void userIsAbleToLoginWithTheUsernameAndPassword(String username, String password) {
        loginPage.fillUserNameAndPwdAndclickLogin(username,password);
        Assert.assertTrue(profilePage.isProfilePageLoaded());
    }


    @And("user clicks on logout button")
    public void userClicksOnLogoutButton() {
    profilePage.clickOnLogOutButton();
    }
}
