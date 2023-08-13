package model;

public abstract class Person {
    private String code;
    private String name;
    private String birthdate;
    private String gender;

    public Person() {

    }

    public Person(String code, String name, String birthdate, String gender) {
        this.code = code;
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
