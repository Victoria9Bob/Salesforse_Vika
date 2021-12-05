package Salesforse.Modals;

import Salesforse.Elements.Drobdown;
import Salesforse.Elements.Input;
import Salesforse.Models.Account;
import Salesforse.Pages.AccountsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModal extends BaseModal {

    final static By SAVE_BUTTON = By.cssSelector("button[title='Save']");

    public AccountModal(WebDriver driver) {
        super(driver);
    }

    public AccountModal fillForm(Account account) {
        if (account.getAccountName() != null) {
            new Input(driver, "Account Name").write(account.getAccountName());
        }
        if (account.getWebsite() != null) {
            new Input(driver, "Website").write(account.getWebsite());
        }
        if (account.getDescription() != null) {
            new Input(driver, "Description").writeTextArea(account.getDescription());
        }
        if (account.getPhone() != null) {
            new Input(driver, "Phone").write(account.getPhone());
        }
        if (account.getType() != null) {
            new Drobdown(driver, "Type").selectOption(account.getType().getName());
        }
        if (account.getIndustry() != null) {
            new Drobdown(driver, "Industry").selectOption(account.getIndustry().getName());
        }
        if (account.getEmployees() != null) {
            new Input(driver, "Employees").write(account.getEmployees());
        }
        return this;
    }

    public AccountsPage clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountsPage(driver);
    }
}

