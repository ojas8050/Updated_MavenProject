package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books {
    private WebDriver driver;
    private ActionClass action;

    public Books(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='24.00']/../..//input")
    private WebElement Fiction;
    public void FictionBookAddToCart(){
        action.click(Fiction);
    }



}
