package Seminar_03.Task1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {

    List<Student> listOfStudents = new ArrayList<Student>();

    public List<Student> getList() {
        return listOfStudents;
    }

    public void setList(List listStud) {
        this.listOfStudents = listStud;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(listOfStudents);
    }

}