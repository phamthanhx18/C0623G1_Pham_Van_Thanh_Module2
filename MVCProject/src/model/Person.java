package model;

public abstract class Person {
    private int code;
    private String name;
    private String birthdate;
    private String gender;

    public Person() {

    }

    public Person(int code, String name, String birthdate, String gender) {
        this.code = code;
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public int getCode() {
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

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
