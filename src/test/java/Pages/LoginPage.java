package Pages;
import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class LoginPage extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement usernameField;

    @FindBy(id="txtPassword")
    public WebElement passwordField;

    @FindBy(xpath="//*[@id='btnLogin']")
    public WebElement loginButton;

    @FindBy(id="spanMessage")
    public WebElement errorMessageLoc;
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
}