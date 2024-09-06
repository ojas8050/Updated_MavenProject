package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Desktops {
    private WebDriver driver;


    public Desktops(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Build your own expensive computer")
    private WebElement BuildOwnLaptopExpensive;
    public Desktops ClickOnBuildOwnLaptopExpensive(){
        BuildOwnLaptopExpensive.click();
        return this;
    }


}
