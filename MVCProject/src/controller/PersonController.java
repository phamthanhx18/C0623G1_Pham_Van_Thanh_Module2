package controller;

import model.Person;

public abstract class PersonController {
    public Person[] people = new Person[0];

    public abstract void addStudent(Person student,Person[] people);

    public abstract void addTeacher(Person teacher,Person[] people);

    public void deletePerson(String code) {
        Person[] newPeople = new Person[people.length - 1];
        int count = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode().equals(code)) {
                continue;
            }
            newPeople[count] = people[i];
            count++;
        }
        people = newPeople;
        System.out.println("The person has been deleted!");
    }
    public void viewPerson() {};
}