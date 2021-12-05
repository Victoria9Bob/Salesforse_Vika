package Salesforse.Models;

import Salesforse.Enums.AccountIndustry;
import Salesforse.Enums.AccountType;

import java.util.Objects;

public class Account {
    private String accountName;
    private String website;
    private String description;
    private String phone;
    private AccountType type;
    private AccountIndustry industry;
    private String employees;


    public Account(String accountName, String website, String description, String phone, AccountType type, AccountIndustry industry, String employees) {
        this.accountName = accountName;
        this.website = website;
        this.description = description;
        this.phone = phone;
        this.type = type;
        this.industry = industry;
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Objects.equals(getAccountName(), account.getAccountName()) && Objects.equals(getWebsite(), account.getWebsite()) && Objects.equals(description, account.description) && Objects.equals(getPhone(), account.getPhone()) && getType() == account.getType() && getIndustry() == account.getIndustry() && employees == account.employees;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountName(), getWebsite(), description, getPhone(), getType(), getIndustry(), employees);
    }

    public Account() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AccountIndustry getIndustry() {
        return industry;
    }

    public void setIndustry(AccountIndustry industry) {
        this.industry = industry;
    }
}
