package nopCommerce;

import DemoWebShop.ActionClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoes{
    private WebDriver driver;
    private ActionClass actions;

    public Shoes(WebDriver driver) {
        this.driver = driver;
        this.actions = new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'adidas')]")
    private WebElement AdidasRunningShoes;
    public void ClickOnAdidasShoes(){
        actions.click(AdidasRunningShoes);
    }

    @FindBy(css = "[title='Silver']")
    private WebElement silverOption;
    public void ClickOnSliverOption(){
        actions.click(silverOption);
    }

    @FindBy(id = "product_enteredQuantity_25")
    private WebElement quantity;
    public void EnterQuentity(String putquantity){
        actions.sendKeys(quantity,putquantity);
    }

    @FindBy(id = "add-to-cart-button-25")
    private WebElement AddToCartButton;
    public void ClickOnAddToCartButton(){
        actions.click(AddToCartButton);
    }

    @FindBy(id = "product_attribute_9")
    private WebElement sizeDropDown;
    public WebElement getSizeDropDown() {
        return sizeDropDown;
    }


}
