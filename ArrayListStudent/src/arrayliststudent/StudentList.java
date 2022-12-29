/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayliststudent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class StudentList extends ArrayList<Student> {
    public StudentList() {
        
    }
    
    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Code: ");
        String code = sc.nextLine();
        System.out.println("Mark: ");
        int mark = sc.nextInt();
        sc.nextLine();
        Student st = new Student(name, code, mark);
        this.add(st);
        System.out.println("Student added!");
    }
    
    public Student search(String code) {
        for (Student search : this) {
            if (search.getCode().equals(code)) {
                return search;
            }
        }
        return null;
    }
    
    public void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's code to search: ");
        String student_search = sc.nextLine();
        Student st = this.search(student_search);
        if(st == null)
            System.out.println("Student doesn't exist!");
        else System.out.println("Student Found!");
        System.out.println(st);
    }
    
    public void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's code to update: ");
        String update_student = sc.nextLine();
        Student st = this.search(update_student);
        if(st == null)
            System.out.println("Student doesn't exist!");
        else {
            String oldName = st.getName();
            System.out.println("Enter student's new name: ");
            String newName = sc.nextLine();
            st.setName(newName);
            System.out.println("Updated!");
            int oldMark = st.getMark();
            System.out.println("Enter student's new mark: ");
            int newMark = sc.nextInt();
            st.setMark(newMark);
            System.out.println("Updated!");
        }
    }
    
    public void removeStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's code to remove: ");
        String remove_student = sc.nextLine();
        Student st = this.search(remove_student);
        if(st == null) 
            System.out.println("Student doesn't exist!");
        else {
            this.remove(st);
            System.out.println("Student removed!");
        }
    }
    
    public void printAll() {
        String code;
        System.out.println("Name                              Code             Mark");
        for(int i = 0; i < super.size(); i++ ) {
            System.out.printf("%-32s", super.get(i).getName());
            code = "|   " + super.get(i).getCode() + "    |";
            System.out.printf("%s", code);
            System.out.printf("%8d\n", super.get(i).getMark());
        }
    }    
    
}
    

