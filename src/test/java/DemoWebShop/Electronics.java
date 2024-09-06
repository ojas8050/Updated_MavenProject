package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics {
    private WebDriver driver;

    public Electronics(WebDriver driver){
            this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(partialLinkText = "Cell phones")
    private WebElement CellPhonelink;

    public Electronics ClickOnCellPhoneLink(){
        CellPhonelink.click();
        return this;
    }

    @FindBy(partialLinkText = "Camera, photo")
    private WebElement CameraNphoto;
    public Electronics ClickOnCameraNPhotos(){
        CameraNphoto.click();
        return this;
    }

}
