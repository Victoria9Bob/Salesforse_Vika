package Salesforse.Pages;


import Salesforse.Modals.AccountModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {

    final By NEW_BUTTON = By.xpath("//a[@title='New']");
    final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");


    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    @Override
    public HomePage open() {
        ;
        return null;
    }

    public AccountModal clickNewButton() {
        jsClick(driver.findElement(NEW_BUTTON));
        return new AccountModal(driver);
    }

    public AccountDetailsPage openDetailsTab() {
        driver.findElement(DETAILS_TAB).click();
        return new AccountDetailsPage(driver);
    }

}
