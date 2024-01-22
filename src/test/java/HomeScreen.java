import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomeScreen {
    @FindBy(className = "android.widget.TextView")
    List<WebElement> np_req;

    public HomeScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getNpReqText() {
        return np_req.get(2).getText();
    }

    public String getNpStatusText() {
        return np_req.get(4).getText();
    }

    public String clickNpReqBtn() throws InterruptedException {
        np_req.get(2).click();
        Thread.sleep(3000);
        return np_req.get(1).getText();
    }
}
