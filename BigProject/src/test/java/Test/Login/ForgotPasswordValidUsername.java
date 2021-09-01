package Test.Login;

import Object.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordValidUsername extends Driver {

    @Test
    public void forgotPasswordValidUsername() throws InterruptedException {

        driver.get(Driver.Login_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        login.clickBtnForgotPass();
        Thread.sleep(2000);

        login.inputUserForgot("Admin");
        login.clikBtnReset();
        Assert.assertTrue(driver.getPageSource().contains("Password reset email could not be sent"));
        driver.close();
    }
}
