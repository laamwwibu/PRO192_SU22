/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumex;

import java.util.Scanner;

enum Weekday {
        Mon(5, 5, "Video Editing", 5),
        Tue(5, 5, "Coding", 2),
        Wed(5, 5, "Math", 3),
        Thu(5, 5, "Group Project", 3),
        Fri(5, 5, "Editing Video", 5),
        Sat(5, 5, "Cycling", 2),
        Sun(5, 5, "Gym", 1);
    private int study_hours;
    private int break_hours;
    private String must_do_work;
    private int time_of_must_do_work;
    
    Weekday(int study_hours, int break_hours, String must_do_work, int time_of_must_do_work) {
        this.study_hours = study_hours;
        this.break_hours = break_hours;
        this.must_do_work = must_do_work;
        this.time_of_must_do_work = time_of_must_do_work;
    }
    
    public void display() {
        System.out.println("My study hour are: " + study_hours);
        System.out.println("My break hours are: " + break_hours);
        System.out.println("I must do " + must_do_work + " at " + time_of_must_do_work);
    }
    
}

public class EnumEx {
    Weekday day;
    
    public void doWhichWork() {
        switch (day) {
            case Mon:
                System.out.println("Today is Monday.");
                day.display();
                break;
                case Mon:
                System.out.println("Today is Monday.");
                day.display();
                break;
                case Tue:
                System.out.println("Today is Tuesday.");
                day.display();
                break;
                case Wed:
                System.out.println("Today is Wednesday.");
                day.display();
                break;
                case Thu:
                System.out.println("Today is Thursday.");
                day.display();
                break;
                case Sat:
                System.out.println("Today is Saturday.");
                day.display();
                break;
                case Sun:
                System.out.println("Today is Sunday.");
                day.display();
                break;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(Weekday y: Weekday.values()) {
        System.out.print(y + ": ");
        doWhichWork(y);
}
        }
    }
