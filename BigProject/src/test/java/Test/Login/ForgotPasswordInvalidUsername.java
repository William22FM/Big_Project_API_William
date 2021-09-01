package Test.Login;

import Object.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordInvalidUsername extends Driver {

    @Test
    public void forgotPasswordInvalidUsername() throws InterruptedException {

        driver.get(Driver.Login_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        login.clickBtnForgotPass();
        Thread.sleep(2000);

        login.inputUserForgot("Salam");
        login.clikBtnReset();
        Assert.assertTrue(driver.getPageSource().contains("Please contact HR admin in order to reset the password"));
        driver.close();
    }
}
