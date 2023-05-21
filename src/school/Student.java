package school;

import java.time.Duration;
import java.time.LocalDateTime;

public class Student {
    private String name;
    private String surname;
    private LocalDateTime birthdate;
    private int sciencePoints;
    private int lifePoints;

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


    public void learn(LocalDateTime from, LocalDateTime to){
        long sub = Duration.between(from,to).getSeconds();
        sub = sub/60;
        if(sub%5==0){
            this.sciencePoints =+ 1;
        }
    }
    public void party(LocalDateTime from, LocalDateTime to){
        long sub = Duration.between(from,to).getSeconds();
        sub = sub/60;
        if(sub%5==0){
            this.lifePoints =+ 1;
        }
    }
    public boolean isGoodStudent(){
        return sciencePoints>lifePoints;
    }
}
