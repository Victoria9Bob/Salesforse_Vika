package Salesforse.Models;

import Salesforse.Enums.AccountIndustry;
import Salesforse.Enums.AccountType;

public class AccountBuilder {
    private Account account = new Account();

    public AccountBuilder withAccountName(String accountName) {
        account.setAccountName(accountName);
        return this;
    }

    public AccountBuilder withWebsite(String website) {
        account.setWebsite(website);
        return this;
    }

    public AccountBuilder withDescription(String description) {
        account.setWebsite(description);
        return this;
    }

    public AccountBuilder withPhone(String phone) {
        account.setPhone(phone);
        return this;
    }

    public AccountBuilder withType(AccountType type) {
        account.setType(type);
        return this;
    }

    public AccountBuilder withIndustry(AccountIndustry industry) {
        account.setIndustry(industry);
        return this;
    }
    public AccountBuilder withEmployees(String employees) {
        account.setPhone(employees);
        return this;
    }

    public Account build() {
        return this.account;
    }
}
