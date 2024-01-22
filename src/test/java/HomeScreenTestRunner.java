import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeScreenTestRunner extends Setup {
    @Test(priority = 1, description = "Check NP Request Description")
    public void getNpReqText(){
        HomeScreen homeScreen = new HomeScreen(driver);
        String np_req_text = homeScreen.getNpReqText();
        Assert.assertTrue(np_req_text.contains("After the number plate of the motor vehicle"));
        System.out.println(np_req_text);
    }

    @Test(priority = 2, description = "Check NP Status Description")
    public void getNpStatusText(){
        HomeScreen homeScreen = new HomeScreen(driver);
        String np_status_text = homeScreen.getNpStatusText();
        Assert.assertTrue(np_status_text.contains("After submitting the request for number plate"));
        System.out.println(np_status_text);
    }

    @Test(priority = 3, description = "Check NP Request Button Activity")
    public void clickNpReqBtn() throws InterruptedException {
        HomeScreen homeScreen = new HomeScreen(driver);
        String req_reg_text = homeScreen.clickNpReqBtn();
        System.out.println(req_reg_text);
        Assert.assertTrue(req_reg_text.contains("Motor Vehicle Registration Number"));

    }
}
