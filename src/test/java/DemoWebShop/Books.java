package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Books {
    private WebDriver driver;

    public Books(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='24.00']/../..//input")
    private WebElement Fiction;
    public Books FictionBookAddToCart(){
        Fiction.click();
        Reporter.log("Fiction book added to cart", true);
        return this;
    }

    public WebElement getFiction() {
        return Fiction;
    }
}
