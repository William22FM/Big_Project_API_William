package Test.SocialMedia;

import Object.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook extends Driver{

    @Test(priority = 0)
    public void Facebook() throws InterruptedException {

        driver.get(Driver.Login_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Switch browser
        String mainWindow = driver.getWindowHandle();
        login.clickBtnFacebook();
        for (String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(5000);
        String facebook = driver.getCurrentUrl();

        // Assert Link Facebook
        Assert.assertEquals(facebook, "https://www.facebook.com/OrangeHRM");

        Thread.sleep(2000);
        driver.close();
        // Back to mainpage login
        driver.switchTo().window(mainWindow);
    }
}
