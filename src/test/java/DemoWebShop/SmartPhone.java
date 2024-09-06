package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SmartPhone {
    private WebDriver driver;

    public SmartPhone(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "add-to-cart-button-43")
    private WebElement addtocartButton;
    public SmartPhone ClickonAddToCartButton(){
        addtocartButton.click();
        return this;
    }

    @FindBy(xpath = "//span[text()='Shopping cart']")
    private WebElement ShoppingCart;
    public SmartPhone ClickOnShoppingCart(){
        ShoppingCart.click();
        Reporter.log("Smartphone added to cart", true);
        return this;
    }
}
