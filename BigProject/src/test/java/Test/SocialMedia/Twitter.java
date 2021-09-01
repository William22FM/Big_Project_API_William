package Test.SocialMedia;

import Object.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Twitter extends Driver{

    @Test(priority = 2)
    public void Twitter() throws InterruptedException {

        driver.get(Driver.Login_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);


        // Switch browser
        String mainWindow = driver.getWindowHandle();
        login.clickBtnTwitter();
        for (String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String twitter = driver.getCurrentUrl();

        // Assert Link Twitter
        Assert.assertEquals(twitter, "https://twitter.com/orangehrm");

        Thread.sleep(2000);
        driver.close();
        // Back to mainpage login
        driver.switchTo().window(mainWindow);
    }
}
