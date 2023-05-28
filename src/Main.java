import school.Student;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int year,month,day,hour,minutes;
    static ArrayList<Student> students = new ArrayList<>();
    static LocalDateTime now = LocalDateTime.now();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void menu(){
        int ggg = input.nextInt();
        if(ggg == 1){
            dodaje();
        }
        if(ggg == 2){
            wysietl();
        }
        if(ggg == 3){
            party();
        }
        if(ggg == 4){
            learn();
        }
    }
    public static void dodaje(){
        String imie, naziwsko;
        imie = input.next();
        naziwsko = input.next();
        students.add(new Student(imie,naziwsko));
        menu();
    }
    public static void wysietl(){
        for(Student x : students){
            System.out.println(" ");
            System.out.println(x.getName()+" "+x.getSurname());
            System.out.println("Czy jest dobrym uczniem: "+x.isGoodStudent());
        }
        menu();
    }
    public static void party(){
        year = input.nextInt();
        month = input.nextInt();
        day = input.nextInt();
        hour = input.nextInt();
        minutes = input.nextInt();

        LocalDateTime date = LocalDateTime.of(minutes,month,day,hour,minutes,0,0);
        Student.party(now,date);

        menu();
    }
    public static void learn(){
        year = input.nextInt();
        month = input.nextInt();
        day = input.nextInt();
        hour = input.nextInt();
        minutes = input.nextInt();

        LocalDateTime date = LocalDateTime.of(minutes,month,day,hour,minutes,0,0);
        Student.learn(now,date);

        menu();
    }
}