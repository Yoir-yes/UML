package school;

import java.time.Duration;
import java.time.LocalDateTime;

public class Student {
    private String name;
    private String surname;
    private LocalDateTime birthdate;
    private static int sciencePoints;
    private static int lifePoints;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        int life = lifePoints;
        int science = sciencePoints;
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


    public static void learn(LocalDateTime from, LocalDateTime to){
        long sub = Duration.between(to,from).getSeconds();
        int d = (int)sub;
        d = d /60;
        sciencePoints = (int) ((int)d*0.01);
    }
    public static void party(LocalDateTime from, LocalDateTime to){
        long sub = Duration.between(from,to).getSeconds();
        int d = (int)sub;
        d = d /60;
        lifePoints = (int) ((int)d*0.01);
    }
    public boolean isGoodStudent(){
        return sciencePoints>lifePoints;
    }
    public static int getSciencePoints() {
        return sciencePoints;
    }

    public static int getLifePoints() {
        return lifePoints;
    }

}
