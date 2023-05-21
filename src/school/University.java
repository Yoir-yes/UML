package school;

import java.util.List;

public class University {
    private List<Student> students;

    public void addStudent(String name, String surname){
        Student student = new Student(name,surname);
        students.add(student);
    }
    public Student getStudent(String name, String surname){
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
