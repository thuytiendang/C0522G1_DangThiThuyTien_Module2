package case_study.model.person;

public class Customer extends Person{
    private String customerCode;
    private String typeOfCustomer;
    private String address;

    public Customer(String name, String dateOfBirth, String gender, int identityCard, String phoneNumber,
                    String email, String customerCode, String typeOfCustomer, String address) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.customerCode = customerCode;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                this.getName(), this.getDateOfBirth(), this.getGender(), this.getIdentityCard(), this.getPhoneNumber(),
                this.getEmail(), this.getCustomerCode(), this.getTypeOfCustomer(), this.getAddress());
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "CustomerCode: " + customerCode +
                ", Name: " + super.getName() +
                ", Date of birth: " + super.getDateOfBirth() +
                ", Gender: " + super.getGender() +
                ", IdentityCard: " + super.getIdentityCard() +
                ", PhoneNumber: " + super.getPhoneNumber() +
                ", Email: " + super.getEmail() +
                ", Type of customer: " + typeOfCustomer +
                ", Address: " + address;
    }
}
