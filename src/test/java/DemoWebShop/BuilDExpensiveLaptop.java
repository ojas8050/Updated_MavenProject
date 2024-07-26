package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuilDExpensiveLaptop {
    private WebDriver driver;
    private ActionClass action;

    public BuilDExpensiveLaptop(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "product_attribute_74_5_26_82")
    private WebElement Fastprocesser;
    public void SelectFastProcesser(){
        action.click(Fastprocesser);
    }

    @FindBy(id = "product_attribute_74_6_27_85")
    private WebElement RAM8GB;
    public void Select8GBRAM(){
        action.click(RAM8GB);
    }

    @FindBy(id = "product_attribute_74_3_28_87")
    private WebElement HDD400;
    public void Select400GbHDD(){
        action.click(HDD400);
    }

    @FindBy(id = "product_attribute_74_8_29_88")
    private WebElement ImageViewer;
    public void SelectImageViewer(){
        action.click(ImageViewer);
    }

    @FindBy(id = "product_attribute_74_8_29_89")
    private WebElement OfficeSuit;
    public void SelectOfficeSuit(){
        action.click(OfficeSuit);
    }

    @FindBy(id = "product_attribute_74_8_29_90")
    private WebElement OtherOfficeSuite;
    public void SelectOtherOfficeSuite(){
        action.click(OtherOfficeSuite);
    }

    @FindBy(id = "add-to-cart-button-74")
    private WebElement AddToCart;
    public void ClickOnAddToCart(){
        action.click(AddToCart);
    }

}
