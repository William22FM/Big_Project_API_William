package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class PageAddEmployee {
        WebDriver driver;

        public PageAddEmployee(WebDriver driver) {
            this.driver = driver;
        }

        //  Locator and method for PIM
        By btnPIM = By.id("menu_pim_viewPimModule");
       public void clickPIM() { driver.findElement(btnPIM).click(); }

        //  Locator and method for Add Employee
        By btnAddEmployee = By.id("menu_pim_viewPimModule");
        public void clickAddEmployee() { driver.findElement(btnAddEmployee).click(); }

        // Locator and method for First Name
        By inputFirstEmployee = By.id("addCandidate_firstName");
        public void employeeInputFirstName(String FirstName) {
            driver.findElement(inputFirstEmployee).sendKeys(FirstName);
        }

        //Locator and method for Middle Name
        By inputMiddleNameEmployee = By.id("addCandidate_middleName");
        public void employeeInputMiddleName(String MiddleName) {
            driver.findElement(inputMiddleNameEmployee).sendKeys(MiddleName);
        }

        // Locator and method for Last Name
        By inputLastNameEmployee = By.id("addCandidate_lastName");
        public void employeeInputLastName(String LastName) {
            driver.findElement(inputLastNameEmployee).sendKeys(LastName);
        }

        // Locator and method for Save Button
        By btnSave = By.id("addCandidate_lastName");
        public void clickbtnSave(String LastName) {
            driver.findElement(btnSave).sendKeys(LastName);
        }



    }


