package model;

//Student class
public class Student extends Person {
    private String classes;
    private int score;



    public Student(int code, String name, String birthdate, String gender, String classes, int score) {
        super(code, name, birthdate, gender);
        this.classes = classes;
        this.score = score;
    }

    public String getClasses() {
        return classes;
    }

    public int getScore() {
        return score;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", birthdate='" + getBirthdate() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", classes='" + getClasses() + '\'' +
                ", score=" + getScore() +
                '}';
    }
}
