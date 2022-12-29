/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VICTUS
 */

public class Main { 
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employee: ");
        int numOfEmployee = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < numOfEmployee; i++) {
            System.out.println("Name: ");
            String add_name = sc.nextLine();
            System.out.println("Salary: ");
            int add_salary = sc.nextInt();
            sc.nextLine();
            Employee em = new Employee(add_name, add_salary);
            list.add(em);
        }
        
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%-30s", list.get(i).getName());
            System.out.printf("%d\n", list.get(i).getSalary());
        }
    }
     
}
