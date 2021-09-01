package Test.SocialMedia;

import Object.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Youtube extends Driver{

    @Test(priority = 3)
    public void Youtube() throws InterruptedException {

        driver.get(Driver.Login_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);


        // Switch browser
        String mainWindow = driver.getWindowHandle();
        login.clickBtnYoutube();
        for (String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String youtube = driver.getCurrentUrl();

        // Assert Link Youtube
        Assert.assertEquals(youtube, "https://www.youtube.com/c/OrangeHRMInc");

        Thread.sleep(2000);
        driver.close();
        // Back to mainpage login
        driver.switchTo().window(mainWindow);
    }
}
