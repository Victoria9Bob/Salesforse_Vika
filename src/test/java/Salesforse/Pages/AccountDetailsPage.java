package Salesforse.Pages;

import Salesforse.Elements.LightiningFormatedTextElement;
import Salesforse.Models.Account;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    @Override
    public BasePage open() {
        return null;
    }

    public Account getAccountDetailsInfo() {
        Account account = new Account();
        String accountName  = new LightiningFormatedTextElement(driver, "Account Name").getValue();
        if(accountName!="" || accountName!="null"){
            account.setAccountName(accountName);
        }
                String website  = new LightiningFormatedTextElement(driver, "Website").getValue();
        if(website!="" || website!="null"){
            account.setAccountName(website);
        }
                String phone  = new LightiningFormatedTextElement(driver, "Phone").getValue();
        if(phone!="" || phone!="null"){
            account.setAccountName(phone);
        }
                String type  = new LightiningFormatedTextElement(driver, "Type").getValue();
        if(type!="" || type!="null"){
            account.setAccountName(type);
        }
                String industry  = new LightiningFormatedTextElement(driver, "Industry").getValue();
        if(industry!="" || industry!="null"){
            account.setAccountName(industry);
        }
        return account;
    }
}
