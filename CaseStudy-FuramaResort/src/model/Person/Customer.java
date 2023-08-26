package model.Person;

public class Customer extends Person {
    private String typeCustomer;
    private String location;

    public Customer(String id,String fullName, String birthday, String gender, String identityCard, String phone, String email, String typeCustomer, String location) {
        super(id, fullName, birthday, gender, identityCard, phone, email);
        this.typeCustomer = typeCustomer;
        this.location = location;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "codePerson='" + getCodePerson() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", birthday='" + getBirthday() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", identityCard='" + getIdentityCard() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", typeCustomer='" + getTypeCustomer() + '\'' +
                ", location='" + getLocation() + '\'' +
                '}';
    }
}
