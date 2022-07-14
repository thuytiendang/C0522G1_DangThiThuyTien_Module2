package further_exercise_mvc.model;

public class Teacher extends Person{
private String speciality;

    public Teacher(int id, String name, String dateOfBirth, String gender, String speciality) {
        super(id, name, dateOfBirth, gender);
        this.speciality = speciality;
    }

    public Teacher(String speciality) {
        this.speciality = speciality;
    }

    public Teacher() {
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() +
                ", id: " + super.getId() +
                ", DateOfBirth: " + super.getDateOfBirth()+
                ", gender: " + super.getGender() +
                ", speciality: " + this.speciality;
    }
}
