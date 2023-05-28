import school.Student;
import school.University;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int year,month,day;
    static String imie, naziwsko;
    static University university = new University();
    private static List<Student> students = new ArrayList<>();
    static LocalDate now = LocalDate.now();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("");
        System.out.println("1 - Dodaj");
        System.out.println("2 - Wyświetl");
        System.out.println("3 - Baw się");
        System.out.println("4 - Uczenie się");
        System.out.println("5 - Usuń");
        System.out.println("6 - Szukaj");
        System.out.println("");
        System.out.println("Podaj numer: ");
        int num = input.nextInt();


        if(num == 1){
            add();
        }
        if(num == 2){
            wysietl();
        }
        if(num == 3){
            party();
        }
        if(num == 4){
            learn();
        }
        if(num == 5){
            remove();
        }
        if(num == 6){
            search();
        }

    }
    public static void add() {
        System.out.println("Podaj imie: ");
        imie = input.next();
        System.out.println("Podaj nazwisko: ");
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
        System.out.println("Podaj rok: ");
        year = input.nextInt();
        System.out.println("Podaj miesiąc: ");
        month = input.nextInt();
        System.out.println("Podaj dzien: ");
        day = input.nextInt();

        LocalDate date = LocalDate.of(year,month,day);
        Student.party(now,date);

        menu();
    }
    public static void learn(){
        System.out.println("Podaj rok: ");
        year = input.nextInt();
        System.out.println("Podaj miesiąc: ");
        month = input.nextInt();
        System.out.println("Podaj dzien: ");
        day = input.nextInt();

        LocalDate date = LocalDate.of(year,month,day);
        Student.learn(now,date);

        menu();
    }
    public static void remove(){
        System.out.println("Podaj imie: ");
        imie = input.next();
        System.out.println("Podaj nazwisko: ");
        naziwsko = input.next();
        university.removeStudent(imie,naziwsko);
        menu();
    }
    public static void search(){
        System.out.println("Podaj imie: ");
        imie = input.next();
        System.out.println("Podaj nazwisko: ");
        naziwsko = input.next();
        university.getStudent(imie,naziwsko);
        menu();
    }
}