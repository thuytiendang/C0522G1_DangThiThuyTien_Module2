package case_study.model;

public class Contract {
    private String contractNumber;
    private String bookingCode;
    private String preDepositAmount;
    private String totalPayment;
    private String customerCode;

    public Contract(String contractNumber, String bookingCode, String preDepositAmount, String totalPayment, String customerCode) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.preDepositAmount = preDepositAmount;
        this.totalPayment = totalPayment;
        this.customerCode = customerCode;
    }

    public Contract() {
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getPreDepositAmount() {
        return preDepositAmount;
    }

    public void setPreDepositAmount(String preDepositAmount) {
        this.preDepositAmount = preDepositAmount;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract: \n" +
                "contractNumber: " + contractNumber + '\n' +
                ", bookingCode: " + bookingCode + '\n' +
                ", preDepositAmount: " + preDepositAmount + '\n' +
                ", totalPayment: " + totalPayment + '\n' +
                ", customerCode: " + customerCode + '\n';
    }
}
