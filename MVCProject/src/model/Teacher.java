package model;

public class Teacher extends Person {
    private String level;

    public Teacher(String code, String name, String birthdate, String gender, String level) {
        super(code, name, birthdate, gender);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", birthdate='" + getBirthdate() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", level='" + getLevel() + '\'' +
                '}';
    }
}
