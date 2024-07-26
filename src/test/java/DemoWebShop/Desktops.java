package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Desktops {
    private WebDriver driver;
    private ActionClass action;

    public Desktops(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Build your own expensive computer")
    private WebElement BuildOwnLaptopExpensive;
    public void ClickOnBuildOwnLaptopExpensive(){
        action.click(BuildOwnLaptopExpensive);
    }


}
