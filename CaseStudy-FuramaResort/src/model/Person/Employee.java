package model.Person;

public class Employee extends Person{
    private String level;
    private String location;
    private String amount;

    public Employee(String id, String fullName, String birthday, String gender, String identityCard, String phone, String email, String level, String location, String amount) {
        super(id, fullName, birthday, gender, identityCard, phone, email);
        this.level = level;
        this.location = location;
        this.amount = amount;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Employee{" +
                "codePerson='" + getCodePerson() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", birthday='" + getBirthday() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", identityCard='" + getIdentityCard() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", Level='" + getLevel() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", Amout='" + getAmount() + '\'' +
                '}';
    }
}
