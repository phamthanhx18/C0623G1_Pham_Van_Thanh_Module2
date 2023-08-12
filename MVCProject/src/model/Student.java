package model;

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

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Studen{" +
                "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", birthdate='" + getBirthdate() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", class='" + classes + '\'' +
                ", score=" + score+
                '}';
    }
}