package Seminar_03.Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Student> listStud = new ArrayList<Student>(List.of(
        new Student("Иван", "Иванов", 20),
        new Student("Петр", "Рыбин", 21),
        new Student("Василий", "Новсов", 22),
        new Student("Павел", "Ломоносов", 23)));

        StudyGroupIterator iter = new StudyGroupIterator(listStud);

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();

        StudyGroup newiter = new StudyGroup();
        newiter.setList(listStud);
        Iterator<Student> iterstud = newiter.iterator();

        while (iterstud.hasNext()) {
            System.out.println(iterstud.next());
        }

        
        
    }
}
