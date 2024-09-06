package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Checkout {
    private WebDriver driver;

    public Checkout(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[onclick='Billing.save()']")
    private WebElement BillingAddressContinue;
    public Checkout ClickOnBillingAddressContinue(){
        BillingAddressContinue.click();
        return this;
    }

    @FindBy(css = "[onclick='Shipping.save()']")
    private WebElement ShippingContinue;
    public Checkout ClickOnShippingContinue(){
        ShippingContinue.click();
        return this;
    }

    @FindBy(css = "[onclick='ShippingMethod.save()']")
    private WebElement ShippingMethodContinue;
    public Checkout ClickOnShippingMethod(){
        ShippingMethodContinue.click();
        return this;
    }

    @FindBy(id = "shippingoption_1")
    private WebElement NextDayAir;
    public Checkout ClickOnNextDayAir(){
        NextDayAir.click();
        return this;
    }

    @FindBy(css = "[onclick='PaymentMethod.save()']")
    private WebElement PaymentMethod;
    public Checkout ClickOnPaymentMethod(){
        PaymentMethod.click();
        return this;
    }

    @FindBy(css = "[onclick='PaymentInfo.save()']")
    private WebElement PaymentInfo;
    public Checkout ClickOnPaymentInfo(){
        PaymentInfo.click();
        return this;
    }

    @FindBy(css = "[onclick='ConfirmOrder.save()']")
    private WebElement ConfirmOrder;
    public Checkout ClickOnConfirmOrder(){
        ConfirmOrder.click();
        Reporter.log("Order confirmed", true);
        return this;
    }

    @FindBy(xpath = "//h1[text()='Thank you']")
    private WebElement ThankyouMessage;

    public WebElement getThankyouMessage() {
        return ThankyouMessage;
    }

    public Checkout ConfirmationMessage(){
        String OrderConfirmationMessage = getThankyouMessage().getText();
        return this;
    }


}
