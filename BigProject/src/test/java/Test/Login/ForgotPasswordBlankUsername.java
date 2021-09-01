package Test.Login;

import Object.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordBlankUsername extends Driver {

    @Test(priority = 0)
    public void forgotPasswordBlankUsername() throws InterruptedException {

        driver.get(Driver.Login_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        login.clickBtnForgotPass();
        Thread.sleep(2000);

        login.inputUserForgot("");
        login.clikBtnReset();
        Assert.assertTrue(driver.getPageSource().contains("Could not find a user with given details"));
        driver.close();
    }
}
