package Pages;



import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashBoardPage extends CommonMethods {
    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement empListOption;

    @FindBy(xpath="//*[@id='menu_pim_addEmployee']")
    public WebElement addEmployeeOption;

    @FindBy(id="welcome")
    public WebElement welcomeMessageOption;

    public DashBoardPage(){
        PageFactory.initElements(driver,this);
    }



}
