package school;

import java.util.ArrayList;
import java.util.List;

public class University {
    private static List<Student> students = new ArrayList<>();

    public void addStudent(){
        System.out.println("Dodano ucznia");
    }
    public Student getStudent(String name, String surname){
        for (Student student : students) {
            if (student.getName().equals(name) && student.getSurname().equals(surname)) {
                System.out.println(student.getName()+" "+student.getSurname());
            }
        }
        System.out.println("Nie znaleziono takiego ucznia");
        return null;
    }
    public boolean removeStudent(String name,String surname){
        Student remove = getStudent(name, surname);
        if (remove != null) {
            students.remove(remove);
            return true;
        }
        return false;
    }
}
