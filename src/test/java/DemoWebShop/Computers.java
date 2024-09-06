package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computers {
    private WebDriver driver;

    public Computers(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(partialLinkText = "Desktops")
    private WebElement Desktops;
    public Computers ClickOnDesktops(){
        Desktops.click();
        return this;
    }
}
