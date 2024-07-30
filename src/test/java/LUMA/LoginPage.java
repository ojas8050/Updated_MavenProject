package nopCommerce;

import DemoWebShop.ActionClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    private ActionClass action;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "Email")
    private WebElement email;
    public void EnterUsername(String username){
        action.sendKeys(email,username);
    }

    @FindBy(id = "Password")
    private WebElement password;
    public void EnterPassword(String pwd){
        action.sendKeys(password,pwd);
    }

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement Submit;
    public void ClickOnSubmit(){
        action.click(Submit);
    }



}
