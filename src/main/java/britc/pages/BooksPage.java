package britc.pages;

import org.openqa.selenium.By;

public class BooksPage extends BasePage {

    private By toolsQAImage= By.cssSelector("img[src='/assets/Toolsqa-DZdwt2ul.jpg']");
    private By loginBtn= By.id("login");

    public void isBooksPageLoaded(){
        waitForElementVisibility(toolsQAImage);
    }

    public void clickOnLogin(){
        waitForElementVisibility(loginBtn).click();
    }

}
