package model;

//Student class
public class Student extends Person {
    private String classes;
    private int score;

    public Student(String code, String name, String birthdate, String gender, String classes, int score) {
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
