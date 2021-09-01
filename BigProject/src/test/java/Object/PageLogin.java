package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin {
    WebDriver driver;

    public PageLogin (WebDriver driver) {
        this.driver = driver;
    }


    By UsernameLogin = By.id("txtUsername");
    public void inputUsername (String username) {
        driver.findElement(UsernameLogin).sendKeys(username);
    }


    By PasswordLogin = By.id("txtPassword");
    public void inputPassword (String password) {
        driver.findElement(PasswordLogin).sendKeys(password);
    }


    By BtnLogin = By.id("btnLogin");
    public void clickBtnLogin () {
        driver.findElement(BtnLogin).click();
    }


    By BtnForgotPass = By.linkText("Forgot your password?");
    public void clickBtnForgotPass () {
        driver.findElement(BtnForgotPass).click();
    }


    By BtnLinkedin = By.cssSelector("img[alt='LinkedIn OrangeHRM group']");
    public void clickBtnLinkedin () {
        driver.findElement(BtnLinkedin).click();
    }


    By BtnOrangeHRM = By.linkText("OrangeHRM, Inc");
    public void clickBtnOrangeHRM () {
        driver.findElement(BtnOrangeHRM).click();
    }


    By BtnFacebook = By.cssSelector("img[alt='OrangeHRM on Facebook']");
    public void clickBtnFacebook () {
        driver.findElement(BtnFacebook).click();
    }


    By BtnTwitter = By.cssSelector("img[alt='OrangeHRM on twitter']");
    public void clickBtnTwitter () {
        driver.findElement(BtnTwitter).click();
    }


    By BtnYoutube = By.cssSelector("img[alt='OrangeHRM on youtube']");
    public void clickBtnYoutube () {
        driver.findElement(BtnYoutube).click();
    }


    By fieldUserForgot = By.id("securityAuthentication_userName");
    public void inputUserForgot (String username) {
        driver.findElement(fieldUserForgot).sendKeys(username);
    }


    By BtnResetPassword = By.id("btnSearchValues");
    public void clikBtnReset () {
        driver.findElement(BtnResetPassword).click();
    }


    By BtnAlterLogin = By.id("openIdProvider");
    public void clickBtnAlternative () {
        driver.findElement(BtnAlterLogin).click();
    }

    By menuProfile = By.id("welcome");
    public void clickMenuProfile () {
        driver.findElement(menuProfile).click();
    }

    By menuLogout = By.linkText("Logout");
    public void clickMenuLogout () {
        driver.findElement(menuLogout).click();
    }
}
