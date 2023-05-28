package school;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Student {
    private String name;
    private String surname;
    private static int sciencePoints;
    private static int lifePoints;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public static void learn(LocalDate from, LocalDate to){
        int dni = (int) ChronoUnit.DAYS.between(from, to);
        sciencePoints=6*dni+sciencePoints;
    }
    public static void party(LocalDate from, LocalDate to){
        int dni = (int) ChronoUnit.DAYS.between(from, to);
        lifePoints=lifePoints+9*dni;
    }
    public boolean isGoodStudent(){
        return sciencePoints>lifePoints;
    }

}
