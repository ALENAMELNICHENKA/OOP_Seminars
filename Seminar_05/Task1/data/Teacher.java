package Seminar_05.Task1.data;

public class Teacher extends User {
    private String discipline;

    public Teacher() {
    }

    public Teacher(String name, int age, String discipline) {
        super(name, age);
        this.discipline = discipline;
    }

    public String toString() {
        return "Teacher{" +
        "discipline='" + discipline + '\'' +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
    }
}
