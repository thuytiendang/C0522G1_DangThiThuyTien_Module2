package further_exercise_mvc.model;

public abstract class Person {
    private int id;
    private String name;
    private String DateOfBirth;
    private String gender;

    public Person(int id, String name, String dateOfBirth, String gender) {
        this.id = id;
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                ", id: " + this.id +
                ", DateOfBirth: " + this.DateOfBirth +
                ", gender: " + this.gender + ".";
    }
}
