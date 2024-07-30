package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    private ActionClass actions;

public HomePage(WebDriver driver){
    this.driver = driver;
    this.actions = new ActionClass(driver);
    PageFactory.initElements(driver,this);
}

    @FindBy(css = ".ico-login")
    private WebElement LoginButton;

    @FindBy(xpath = "//span[normalize-space()='Shopping cart']")
    private WebElement ShoppingCartbtn;
    public void ClickOnShoppingCartBtn(){
        actions.click(ShoppingCartbtn);
    }

    @FindBy(xpath = "//span[normalize-space()='Wishlist']`")
    private WebElement WhishListBtn;

    @FindBy(id = "small-searchterms")
    private WebElement SearchBoxTextField;

    @FindBy(css = "input[value='Search']")
    private WebElement SearchBtn;

    @FindBy(partialLinkText = "Apparel & Shoes")
    private WebElement apparelNshoes;

    public WebElement getLogoutBtn() {
        return LogoutBtn;
    }

    @FindBy(linkText = "Log out")
    private WebElement LogoutBtn;

    public void ClickOnLoginButton(){
        actions.click(LoginButton);
    }
    public void ClickOnApparelNShoes(){
        actions.click(apparelNshoes);
    }

    public void ClickOnLogoutBtn(){
        actions.click(LogoutBtn);
    }

    @FindBy(partialLinkText = "Electronics")
    private WebElement electroniclink;
    public void ClickonElectronics(){
        actions.click(electroniclink);
    }

    @FindBy(partialLinkText = "Digital downloads")
    private WebElement DigitalDownloads;
    public void ClickOnDigitalDowloads(){
        actions.click(DigitalDownloads);
    }

    @FindBy(partialLinkText = "Books")
    private WebElement Books;
    public void ClickOnBooks(){
        actions.click(Books);
    }

    @FindBy(partialLinkText = "Computers")
    private WebElement Computers;
    public void ClickOnComputers(){
        actions.click(Computers);
    }

    @FindBy(partialLinkText = "Jewelry")
    private WebElement Jewelry;
    public void CLickonJewelry(){
        actions.click(Jewelry);
    }

    @FindBy(partialLinkText = "Gift Cards")
    private WebElement GiftCards;
    public void ClickOnGiftCards(){
        actions.click(GiftCards);
    }

    @FindBy(linkText = "ojas1@gmail.com")
    private WebElement OjasUser;

    public WebElement getOjasUser() {
        return OjasUser;
    }


}
