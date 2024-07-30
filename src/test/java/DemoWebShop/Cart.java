package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Cart {
    private WebDriver driver;
    private ActionClass action;

    public Cart(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "termsofservice")
    private WebElement TNCCheckBox;
    public void ClickOnTNCCheckBox(){
        action.click(TNCCheckBox);
    }

    @FindBy(id = "checkout")
    private WebElement CheackOutButton;
    public void ClickOnCheckOutButton(){
        action.click(CheackOutButton);
    }

   @FindBy(className = "cart-item-row")
    private WebElement cartItems;

    public WebElement getCartItems() {
        return cartItems;
    }

    public boolean isItemInCart(String itemName) {
        try {
            List<WebElement> cartItems = driver.findElements(By.cssSelector(".product-name"));

            for (WebElement item : cartItems) {
                if (item.getText().equalsIgnoreCase(itemName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}


