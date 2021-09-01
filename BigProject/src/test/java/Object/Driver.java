package Object;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driver {
    public WebDriver driver = new ChromeDriver();
    public ExtentReports report;
    public ExtentTest test;

    //  Creating page object

    public PageLogin login = new PageLogin(driver);
    public PageAddEmployee addemployee = new PageAddEmployee(driver);


    // Url
    public static String Login_URL = "http://qa.cilsy.id/symfony/web/index.php/auth/login";

}
