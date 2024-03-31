package Seminar_05.Task1.view;


import Seminar_05.Task1.controller.Controller;
import Seminar_05.Task1.data.User;

public class StudentView {
    private Controller controller = new Controller();

    public void createStudent(User stud) {
        controller.createUser(stud, stud.getDirection());
        System.out.println("Студент создан успешно!");
    }

    public void readStudent() {
        controller.read("student");
        System.out.println("Список студентов: ");
    }
    
}
