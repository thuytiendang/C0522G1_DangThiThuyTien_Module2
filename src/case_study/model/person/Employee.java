package case_study.model.person;

public class Employee extends Person {
    private String employeeCode;
    private String qualification;
    private String position;
    private float salary;

    public Employee(String name, String dateOfBirth, String gender, int identityCard, String phoneNumber,
                    String email, String employeeCode, String qualification, String position, float salary) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
                this.getName(), this.getDateOfBirth(), this.getGender(), this.getIdentityCard(), this.getPhoneNumber(),
                this.getEmail(), this.getEmployeeCode(), this.getQualification(), this.getPosition(), this.getSalary());
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "Employee Code: " + employeeCode +
                ", Name: " + super.getName() +
                ", Date of birth: " + super.getDateOfBirth() +
                ", Gender: " + super.getGender() +
                ", Identity Card: " + super.getIdentityCard() +
                ", Phone Number: " + super.getPhoneNumber() +
                ", Email: " + super.getEmail() +
                ", Qualification: " + qualification +
                ", Position: " + position +
                ", Salary: " + salary;
    }
}
