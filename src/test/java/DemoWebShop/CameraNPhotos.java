package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CameraNPhotos {
    private WebDriver driver;
    private ActionClass action;

    public CameraNPhotos(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

}
