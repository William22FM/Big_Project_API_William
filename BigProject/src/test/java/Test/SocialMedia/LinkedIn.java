package Test.SocialMedia;

import Object.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkedIn extends Driver{

    @Test(priority = 1)
    public void LinkedIn() throws InterruptedException {

        driver.get(Driver.Login_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Switch browser
        String mainWindow = driver.getWindowHandle();
        login.clickBtnLinkedin();
        for (String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }
        Thread.sleep(2000);
        String linkedIn = driver.getCurrentUrl();

        // Assert Link LinkedIn
        Assert.assertEquals(linkedIn, "https://www.linkedin.com/signup/cold-join?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fgroups%3Fhome%3D%26gid%3D891077&trk=login_reg_redirect");

        Thread.sleep(2000);
        driver.close();
        // Back to mainpage login
        driver.switchTo().window(mainWindow);
    }
}
