/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayliststudent;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void Menu(int choice, StudentList list) {
        Scanner sc = new Scanner(System.in);
        switch(choice) {
            case 1:
                list.addStudent();
                break;
            case 2:
                list.searchStudent();
                break;
            case 3:
                list.updateStudent();
                break;
            case 4:
                list.removeStudent();
                break;
            case 5:
                list.printAll();
                break;
            default:
                System.out.println("Bye!");
                System.exit(0);   
        }
    }
    
    public static void main(String[] args) {
        StudentList list = new StudentList();
        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("1. Add student.\n" +
                            "2. Search student by code.\n" +
                            "3. Update student by code.\n" +
                            "4. Remove student by code.\n" +
                            "5. Print info of all students.\n" +
                            "6. Exit.");
            System.out.print("Enter your choice: ");
        try {
            int choice=sc.nextInt();
            sc.nextLine();
            Menu(choice, list);
        } catch(Exception e) {
            System.out.println("Please enter validate integer");
        }
            System.out.println("Press any key to continue");
            sc.next();
        } while(true);
    }
    
}
