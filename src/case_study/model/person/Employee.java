package case_study.model.person;

public class Employee extends Person{
    private String employeeCode;
    private String qualification;
    private String position;
    private float salary;

    public Employee(String name, String dateOfBirth, String gender, int identityCard, int phoneNumber, String email, String employeeCode, String qualification, String position, float salary) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String employeeCode, String qualification, String position, float salary) {
        this.employeeCode = employeeCode;
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
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
                "name: " + super.getName() +
                ", dateOfBirth: " + super.getDateOfBirth() +
                ", gender: " + super.getGender() +
                ", identityCard: " + super.getIdentityCard() +
                ", phoneNumber: " + super.getPhoneNumber() +
                ", email: " + super.getEmail() +
                ", employeeCode: " + employeeCode +
                ", qualification: " + qualification +
                ", position: " + position +
                ", salary: " + salary;
    }
}
