package controller;

import model.Person;

public class StudentController extends PersonController {

    @Override
    public void addStudent(Person student, Person [] people) {
        Person[] newPeople = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }
        newPeople[newPeople.length - 1] = student;
        people = newPeople;
    }

    @Override
    public void addTeacher(Person teacher, Person[] people) {
    }

    @Override
    public void viewPerson() {
        for (Person value : people) {
            System.out.println(value);
        }
    }
}