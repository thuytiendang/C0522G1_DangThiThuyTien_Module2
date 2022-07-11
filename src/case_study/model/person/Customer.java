package case_study.model.person;

public class Customer extends Person{
    private String customerCode;
    private String typeOfCustomer;
    private String address;

    public Customer(String name, String dateOfBirth, String gender, int identityCard, int phoneNumber, String email, String customerCode, String typeOfCustomer, String address) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.customerCode = customerCode;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String customerCode, String typeOfCustomer, String address) {
        this.customerCode = customerCode;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer() {
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
        return "Customer{" +
                "name='" + super.getName() + '\'' +
                ", dateOfBirth='" + super.getDateOfBirth() + '\'' +
                ", gender=" + super.getGender() +
                ", identityCard=" + super.getIdentityCard() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", email='" + super.getEmail() + '\'' +
                "customerCode='" + customerCode + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                "} ";
    }
}
