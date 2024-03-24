package Seminar_03.Task1;

public class Student {
    String firstName;
    String lastName;
    int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", firstName, lastName, age);
    }

}