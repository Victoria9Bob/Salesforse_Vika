package Salesforse.Enums;

public enum AccountIndustry {
    BANKING ("Banking"),
    EDUCATION ("Education"),
    RETAIL ("Retail");
    private String name;

    AccountIndustry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
