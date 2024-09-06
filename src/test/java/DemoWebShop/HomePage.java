package DemoWebShop;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage {
    private WebDriver driver;

public HomePage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver,this);
}

    @FindBy(css = ".ico-login")
    private WebElement LoginButton;
    public HomePage ClickOnLoginButton(){
        LoginButton.click();
        Reporter.log("Login page Was Opened", true);
        return this;
    }

    @FindBy(xpath = "//span[text()='Shopping cart']")
    private WebElement ShoppingCartbtn;
    public HomePage ClickOnShoppingCartBtn(){
        ShoppingCartbtn.click();
        return this;
    }

    @FindBy(xpath = "//span[normalize-space()='Wishlist']`")
    private WebElement WhishListBtn;

    @FindBy(id = "small-searchterms")
    private WebElement SearchBoxTextField;

    @FindBy(css = "input[value='Search']")
    private WebElement SearchBtn;

    @FindBy(partialLinkText = "Apparel & Shoes")
    private WebElement apparelNshoes;
    public HomePage ClickOnApparelNShoes(){
        apparelNshoes.click();
        Reporter.log("apparelNShoes page Was Opened", true);
        return this;
    }

    @FindBy(linkText = "Log out")
    private WebElement LogoutBtn;
    public HomePage ClickOnLogoutBtn(){
        LogoutBtn.click();
        Reporter.log("LoggedOut Successfully", true);
        return this;
    }
    public WebElement getLogoutBtn() {
        return LogoutBtn;
    }

    @FindBy(partialLinkText = "Electronics")
    private WebElement electroniclink;
    public HomePage ClickonElectronics(){
        electroniclink.click();
        Reporter.log("Electronic page Was Opened", true);
        return this;
    }

    @FindBy(partialLinkText = "Digital downloads")
    private WebElement DigitalDownloads;
    public HomePage ClickOnDigitalDowloads(){
        DigitalDownloads.click();
        Reporter.log("Digital Downloads page Was Opened", true);
        return this;
    }

    @FindBy(partialLinkText = "Books")
    private WebElement Books;
    public HomePage ClickOnBooks(){
        Books.click();
        Reporter.log("Books page Was Opened", true);
        return this;
    }

    @FindBy(partialLinkText = "Computers")
    private WebElement Computers;
    public HomePage ClickOnComputers(){
        Computers.click();
        Reporter.log("Computers page Was Opened", true);
        return this;
    }

    @FindBy(partialLinkText = "Jewelry")
    private WebElement Jewelry;
    public HomePage CLickonJewelry(){
        Jewelry.click();
        Reporter.log("Jewellery page Was Opened", true);
        return this;
    }

    @FindBy(partialLinkText = "Gift Cards")
    private WebElement GiftCards;
    public HomePage ClickOnGiftCards(){
        GiftCards.click();
        Reporter.log("GiftCards page Was Opened", true);
        return this;
    }

    @FindBy(linkText = "ojas1@gmail.com")
    private WebElement OjasUser;
    public WebElement getOjasUser() {
        return OjasUser;
    }

    @FindBy(linkText = "Compare products list")
    private WebElement CompareList;
    public HomePage ClickOnCompareList(){
        CompareList.click();
        Reporter.log("Navigated to compare list", true);
        return this;
    }

}
