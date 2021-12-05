package Salesforse.Modals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseModal {


    WebDriver driver;
    WebDriverWait wait;

    public BaseModal(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

}
