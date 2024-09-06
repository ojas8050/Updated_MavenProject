package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    private WebElement unTextField;

    @FindBy(id = "Password")
    private WebElement pwdTextField;

    @FindBy(css = "input[value='Log in']")
    private WebElement loginBtn;

    @FindBy(linkText = "Forgot password?")
    private WebElement forgotPwdLink;

    @FindBy(css = "input[value='Register']")
    private WebElement registerBtn;

    public LoginPage enterUsername(String username) {
        unTextField.sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        pwdTextField.sendKeys(password);
        return this;
    }

    public LoginPage clickOnLogin() {
        loginBtn.click();
        Reporter.log("LoggedIn Successfully", true);
        return this;
    }

}
