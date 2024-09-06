package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class GiftCards {
    private WebDriver driver;

    public GiftCards(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='100.00']/../..//input")
    private WebElement GiftCard100Doller;
    public GiftCards clickOn100DGiftCardAddToCard(){
        GiftCard100Doller.click();
        return this;
    }

    @FindBy(id = "add-to-cart-button-4")
    private WebElement AddtoCart;
    public GiftCards ClickOnAddToCartBtn(){
        AddtoCart.click();
        Reporter.log("Gift card added to cart", true);
        return this;
    }

    @FindBy(id = "giftcard_4_RecipientName")
    private WebElement ReciptentName;
    public GiftCards EnterReciptentName(String Name){
        ReciptentName.sendKeys(Name);
        return this;
    }

}
