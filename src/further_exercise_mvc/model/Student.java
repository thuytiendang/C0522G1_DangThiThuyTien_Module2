package further_exercise_mvc.model;

public class Student extends Person{
    private String className;
    private double score;


    public Student(int id, String name, String dateOfBirth, String gender, String className, double score) {
        super(id, name, dateOfBirth, gender);
        this.className = className;
        this.score = score;
    }

    public Student(String className, double score) {
        this.className = className;
        this.score = score;
    }

    public Student() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getInfo(){
        return String.format("%s, %s, %s, %s, %s, %s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getGender(), this.getClassName(), this.getScore());
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() +
                ", id: " + super.getId() +
                ", DateOfBirth: " + super.getDateOfBirth()+
                ", gender: " + super.getGender() +
                ", className: " + this.className +
                ", score: " + this.score;

    }
}
