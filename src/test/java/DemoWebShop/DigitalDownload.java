package DemoWebShop;

import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownload {
    private WebDriver driver;
    private ActionClass action;

    public DigitalDownload(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='10.00']/../..//input[@value='Add to cart']")
    private WebElement Music2;
    public void Music2AddtoCartButton(){
        action.click(Music2);
    }

    @FindBy(xpath = "//span[text()='1.00']/../..//input[@value='Add to cart']")
    private WebElement rdAlbum;
    public void thirdAlbumAddToCartButton(){
        action.click(rdAlbum);
    }

    @FindBy(xpath = "//span[text()='3.00']/../..//input[@value='Add to cart']")
    private WebElement MusicTwo;
    public void MusicTwoAddToCartButton(){
        action.click(MusicTwo);
    }

    @FindBy(xpath = "//span[text()='Shopping cart']")
    private WebElement ShoppingCart;
    public void ClickOnShoppingCart(){
        action.click(ShoppingCart);
    }


}
