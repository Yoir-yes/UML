package school;

import java.util.List;

public class University {
    private static List<Student> students;

    public static Student addStudent(String name, String surname){
        Student student = new Student(name,surname);
        students.add(student);
        return student;
    }
    public static Student getStudent(String name, String surname){
        for (Student student : students) {
            if (student.getName().equals(name) && student.getSurname().equals(surname)) {
                return student;
            }
        }
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
