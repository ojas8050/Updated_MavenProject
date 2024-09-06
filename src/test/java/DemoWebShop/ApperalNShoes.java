package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ApperalNShoes {
    private WebDriver driver;

    public ApperalNShoes(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='24.00']/../..//input")
    private WebElement ShirtAddToCartButton;
    public ApperalNShoes ClickOnShirtAddToCartButton(){
        ShirtAddToCartButton.click();
        return this;
    }

    @FindBy(id = "add-to-cart-button-10")
    private WebElement AddtoCartBtn;
    public ApperalNShoes ClickOnAddTocart(){
        AddtoCartBtn.click();
        Reporter.log("Shirt added to cart", true);
        return this;
    }

}
