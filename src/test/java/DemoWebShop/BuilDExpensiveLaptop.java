package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuilDExpensiveLaptop {
    private WebDriver driver;

    public BuilDExpensiveLaptop(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "product_attribute_74_5_26_82")
    private WebElement Fastprocesser;
    public BuilDExpensiveLaptop SelectFastProcesser(){
        Fastprocesser.click();
        return this;
    }

    @FindBy(id = "product_attribute_74_6_27_85")
    private WebElement RAM8GB;
    public BuilDExpensiveLaptop Select8GBRAM(){
        RAM8GB.click();
        return this;
    }

    @FindBy(id = "product_attribute_74_3_28_87")
    private WebElement HDD400;
    public BuilDExpensiveLaptop Select400GbHDD(){
        HDD400.click();
        return this;
    }

    @FindBy(id = "product_attribute_74_8_29_88")
    private WebElement ImageViewer;
    public BuilDExpensiveLaptop SelectImageViewer(){
        ImageViewer.click();
        return this;
    }

    @FindBy(id = "product_attribute_74_8_29_89")
    private WebElement OfficeSuit;
    public BuilDExpensiveLaptop SelectOfficeSuit(){
        OfficeSuit.click();
        return this;
    }

    @FindBy(id = "product_attribute_74_8_29_90")
    private WebElement OtherOfficeSuite;
    public BuilDExpensiveLaptop SelectOtherOfficeSuite(){
        OtherOfficeSuite.click();
        return this;
    }

    @FindBy(id = "add-to-cart-button-74")
    private WebElement AddToCart;
    public BuilDExpensiveLaptop ClickOnAddToCart(){
        AddToCart.click();
        Reporter.log("Expensive laptop added to cart", true);
        return this;
    }

}
