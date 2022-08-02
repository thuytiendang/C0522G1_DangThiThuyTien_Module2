package thuc_hanh_1_bank_account.model;

public abstract class Account {
    private int idAccount;
    private String accountCode;
    private String nameAccount;
    private String createdDay;

    public Account(int idAccount, String accountCode, String nameAccount, String createdDay) {
        this.idAccount = idAccount;
        this.accountCode = accountCode;
        this.nameAccount = nameAccount;
        this.createdDay = createdDay;
    }

    public Account() {
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getCreatedDay() {
        return createdDay;
    }

    public void setCreatedDay(String createdDay) {
        this.createdDay = createdDay;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "Account: " +
                "idAccount: " + idAccount +
                ", accountCode: " + accountCode +
                ", nameAccount: " + nameAccount +
                ", createdDay: " + createdDay;
    }
}
