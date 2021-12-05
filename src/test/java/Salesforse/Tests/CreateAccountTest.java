package Salesforse.Tests;


import Salesforse.Enums.AccountIndustry;
import Salesforse.Enums.AccountType;
import Salesforse.Models.Account;
import Salesforse.Models.AccountBuilder;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


public class CreateAccountTest extends BaseTest {

//    @Test
//    public void createAccountWithWebsiteAndPhone() throws InterruptedException {
//        Account testAccount = new Account("My account", "qwe.zxc", "+355758", AccountType.CUSTOMER, AccountIndustry.EDUCATION);
//        boolean isloggedIn = loginPage.open().login(USERNAME, PASSWORD).isPageOpened();
//        assertTrue(isloggedIn);
//        homePage.clickAccountMenuLink()
//                .clickNewButton()
//                .fillForm(testAccount)
//                .clickSaveButton();
//        Account actualAccountDetailsInfo = accountsPage.openDetailsTab().getAccountDetailsInfo();
//        assertEquals(actualAccountDetailsInfo, testAccount, "ac details is saved");
//    }

    @Test
    public void createAccountWithAllData() throws InterruptedException {
        Account testAccount = new AccountBuilder()
                .withAccountName("My Account")
                .withWebsite("qwe.zxc")
                .withDescription("qwer")
                .withPhone("+23572")
                .withType(AccountType.CUSTOMER)
                .withIndustry(AccountIndustry.RETAIL)
                .withEmployees("hlljkjyu")
                .build();
        boolean isloggedIn = loginPage.open().login(USERNAME, PASSWORD).isPageOpened();
        assertTrue(isloggedIn);
        homePage.clickAccountMenuLink()
                .clickNewButton()
                .fillForm(testAccount)
                .clickSaveButton();
        Account actualAccountDetailsInfo = accountsPage.openDetailsTab().getAccountDetailsInfo();
        assertEquals(actualAccountDetailsInfo, testAccount, "ac details is saved");

    }
}

