/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgenum;

import java.util.Scanner;

enum Weekday {
        Monday(1, 1, "Video Editing", "3pm"),
        Tuesday(2, 3, "Coding", "8pm"),
        Wednesday(5, 8, "Math", "10am"),
        Thursday(5, 5, "Group Project", "9pm"),
        Friday(8, 5, "Editing Video", "3pm"),
        Saturday(3, 2, "Cycling", "6am"),
        Sunday(1, 1, "Gym", "6pm");
    private int study_hours;
    private int break_hours;
    private String must_do_work;
    private String time_of_must_do_work;
    
    Weekday(int study_hours, int break_hours, String must_do_work, String time_of_must_do_work) {
        this.study_hours = study_hours;
        this.break_hours = break_hours;
        this.must_do_work = must_do_work;
        this.time_of_must_do_work = time_of_must_do_work;
    }
    
    public void display() {
        System.out.println("My study hours are: " + study_hours);
        System.out.println("My break hours are: " + break_hours);
        System.out.println("I must do " + must_do_work + " at " + time_of_must_do_work + ".");
    }
    
}

/**
 *
 * @author VICTUS
 */
public class Main {
    Weekday day;

    /**
     *
     * @param day
     */
    public Main(Weekday day) {
        this.day = day;
    }
    
    public void doWichWork() {
        switch (day) {
            case Monday:
                System.out.println("Today is " + day);
                day.display();
                break;
            case Tuesday:
                System.out.println("Today is " + day);
                day.display();
                break;
            case Wednesday:
                System.out.println("Today is " + day);
                day.display();
                break;
            case Thursday:
                System.out.println("Today is " + day);
                day.display();
                break;
            case Friday:
                System.out.println("Today is " + day);
                day.display();
                break;
            case Saturday:
                System.out.println("Today is " + day);
                day.display();
                break;
            case Sunday:
                System.out.println("Today is " + day);
                day.display();
                break;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ans;
            do {
                try {
                    System.out.println("Which Day do you want to check? (Case sensitive)");
                    Scanner sc = new Scanner(System.in);
                    String day = sc.nextLine();
                    Main d = new Main(Weekday.valueOf(day));
                    d.doWichWork();
                } catch (Exception e) {
                    System.out.println("Please Enter a Day Of the Week!!! (Case Sensitive)");
                }
                System.out.println("\r\nWanna check Again?");
                Scanner sc = new Scanner(System.in);
                ans = sc.nextLine();
                System.out.println("");
            } while (ans.equals("yes"));
    }  
}
