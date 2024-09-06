package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DigitalDownload {
    private WebDriver driver;

    public DigitalDownload(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='10.00']/../..//input[@value='Add to cart']")
    private WebElement Music2;
    public DigitalDownload Music2AddtoCartButton() throws InterruptedException {
        Music2.click();
        Thread.sleep(500);
        return this;
    }

    @FindBy(xpath = "//span[text()='1.00']/../..//input[@value='Add to cart']")
    private WebElement rdAlbum;
    public DigitalDownload thirdAlbumAddToCartButton(){
        rdAlbum.click();
        Reporter.log("Digital album added to cart", true);
        return this;
    }

    @FindBy(xpath = "//span[text()='3.00']/../..//input[@value='Add to cart']")
    private WebElement MusicTwo;
    public DigitalDownload MusicTwoAddToCartButton() throws InterruptedException {
        MusicTwo.click();
        Thread.sleep(500);
        return this;
    }

    @FindBy(xpath = "//span[text()='Shopping cart']")
    private WebElement ShoppingCart;
    public DigitalDownload ClickOnShoppingCart(){
        ShoppingCart.click();
        Reporter.log("Navigated To Shopping Cart With 3 items",true);
        return this;
    }
}
