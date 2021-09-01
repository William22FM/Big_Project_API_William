package Test.Login;


import org.testng.Assert;
import org.testng.annotations.Test;
import Object.Driver;


public class LoginBlank extends Driver {

    @Test
    public void loginEmptyUserAndPass() throws InterruptedException {


        driver.get(Driver.Login_URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        login.clickBtnLogin();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getPageSource().contains("Username cannot be empty"));
        driver.close();
    }
}
