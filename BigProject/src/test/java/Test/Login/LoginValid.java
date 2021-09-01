package Test.Login;

import Object.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginValid extends Driver {

    @Test
    public void loginEmptyUsername() throws InterruptedException {

        driver.get(Driver.Login_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        login.inputUsername("Admin");
        login.inputPassword("s3Kol4HQA!*");
        Thread.sleep(2000);

        login.clickBtnLogin();
        Thread.sleep(1000);

        Assert.assertTrue(driver.getPageSource().contains("Welcome Zidan"));
        driver.close();
    }
}
