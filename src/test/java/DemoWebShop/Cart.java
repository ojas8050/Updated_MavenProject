package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.time.Duration;
import java.util.List;

public class Cart{

    private WebDriver driver;
    private ActionClass action;
    BrowserActions ba= new BrowserActions(driver);

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
            //ExplicitWait((WebElement) By.cssSelector(".cart-item-row"), Duration.ofSeconds(10));
            List<WebElement> cartItems = driver.findElements(By.cssSelector(".product-name"));

            for (WebElement item : cartItems) {
                String itemText = item.getText();
                Reporter.log(" "+itemText);
                ba.ExplicitWait(item, Duration.ofSeconds(5));
                if (item.getText().equalsIgnoreCase(itemName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}


