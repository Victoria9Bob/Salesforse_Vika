package Salesforse.Enums;

public enum AccountType {
    ANALYST ("Analyst"),
    INVESTOR ("Investor"),
    CUSTOMER ("Customer"),
    PARTNER ("Partner");
    private String name;

     AccountType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
