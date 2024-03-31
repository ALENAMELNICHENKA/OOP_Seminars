package Seminar_05.Task1;

import Seminar_05.Task1.data.Student;
import Seminar_05.Task1.view.StudentView;

public class main {
    public static void main(String[] args) { 
        
        Student stud1 = new Student("Иванов", 18, "Информатика");
        Student stud2 = new Student("Иванова", 22, "Информатика");

        StudentView stView = new StudentView();
        stView.createStudent(stud1);
        stView.createStudent(stud2);
        stView.readStudent();
    }
}
