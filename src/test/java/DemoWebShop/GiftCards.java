package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards {
    private WebDriver driver;
    private ActionClass action;

    public GiftCards(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='100.00']/../..//input")
    private WebElement GiftCard100Doller;
    public void clickOn100DGiftCardAddToCard(){
        action.click(GiftCard100Doller);
    }

    @FindBy(id = "add-to-cart-button-4")
    private WebElement AddtoCart;
    public void ClickOnAddToCartBtn(){
        action.click(AddtoCart);
    }

}
