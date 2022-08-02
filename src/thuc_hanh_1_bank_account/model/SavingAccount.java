package thuc_hanh_1_bank_account.model;

public class SavingAccount extends Account {
    private double savingMoney;
    private String savingSendDay;
    private double interest;
    private String due;

    public SavingAccount(int idAccount, String accountCode, String nameAccount, String createdDay,
                         double savingMoney, String savingSendDay, double interest, String due) {
        super(idAccount, accountCode, nameAccount, createdDay);
        this.savingMoney = savingMoney;
        this.savingSendDay = savingSendDay;
        this.interest = interest;
        this.due = due;
    }

    public SavingAccount() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", this.getIdAccount(), this.getAccountCode(),
                this.getNameAccount(), this.getCreatedDay(), this.getSavingMoney(),
                this.getSavingSendDay(), this.getInterest(), this.getDue());
    }

    public double getSavingMoney() {
        return savingMoney;
    }

    public void setSavingMoney(double savingMoney) {
        this.savingMoney = savingMoney;
    }

    public String getSavingSendDay() {
        return savingSendDay;
    }

    public void setSavingSendDay(String savingSendDay) {
        this.savingSendDay = savingSendDay;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    @Override
    public String toString() {
        return "SavingAccount: " +
                "idAccount: " + super.getIdAccount() +
                ", accountCode: " + super.getAccountCode() +
                ", nameAccount: " + super.getNameAccount() +
                ", createdDay: " + super.getCreatedDay() +
                ", savingMoney: " + savingMoney +
                ", savingSendDay: " + savingSendDay +
                ", interest: " + interest +
                ", due: " + due;
    }
}
