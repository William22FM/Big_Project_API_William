package Test.Login;

import Object.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginEmptyPassword extends Driver {


    @Test
    public void loginEmptyPassword() throws InterruptedException {

        driver.get(Driver.Login_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        login.inputUsername("Admin");
        login.inputPassword("");
        Thread.sleep(2000);

        login.clickBtnLogin();
        Thread.sleep(1000);

        Assert.assertTrue(driver.getPageSource().contains("Password cannot be empty"));
        driver.close();
    }
}
