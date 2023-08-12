package model;

public class Teacher extends Person {
    private String expertise;

    public Teacher(String code, String name, String birthdate, String gender, String expertise) {
        super(code, name, birthdate, gender);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", birthdate='" + getBirthdate() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", expertise='" + expertise + '\'' +
                '}';
    }
}