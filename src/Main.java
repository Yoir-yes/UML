import school.Student;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime date = LocalDateTime.of(2023,05,21,19,50,30,0);
        Student.learn(now,date);
    }
}