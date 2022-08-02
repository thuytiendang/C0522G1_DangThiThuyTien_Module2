package thuc_hanh_1_bank_account.model;

public class PaymentAccount extends Account {
    private int cardNumber;
    private double moneyInAccount;

    public PaymentAccount(int idAccount, String accountCode, String nameAccount,
                          String createdDay, int cardNumber, double moneyInAccount) {
        super(idAccount, accountCode, nameAccount, createdDay);
        this.cardNumber = cardNumber;
        this.moneyInAccount = moneyInAccount;
    }

    public PaymentAccount() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s", this.getIdAccount(), this.getAccountCode(),
                this.getNameAccount(), this.getCreatedDay(), this.getCardNumber(), this.getMoneyInAccount());
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getMoneyInAccount() {
        return moneyInAccount;
    }

    public void setMoneyInAccount(double moneyInAccount) {
        moneyInAccount = moneyInAccount;
    }

    @Override
    public String toString() {
        return "PaymentAccount: " +
                "idAccount: " + super.getIdAccount() +
                ", accountCode: " + super.getAccountCode() +
                ", nameAccount: " + super.getNameAccount() +
                ", createdDay: " + super.getCreatedDay() +
                ", cardNumber=" + cardNumber +
                ", MoneyInAccount: " + moneyInAccount;
    }
}
