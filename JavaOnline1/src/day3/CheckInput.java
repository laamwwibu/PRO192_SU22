/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class CheckInput {
    public int Input() {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
            System.out.println("Input number:");
            number = Integer.parseInt(sc.nextLine());
            break;
            } catch (Exception e) {
                
            }
        }
        return number;
    } 
    
    public int checkPositive() {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Input number: ");
                while (number > 0) {
                    number = Integer.parseInt(sc.nextLine());
                    break;
                }
            } catch (Exception e) {
                
            }
        }
        return number;
    }
    
    public static void main(String[] args) {
        CheckInput c = new CheckInput();
        int number = c.Input();
        System.out.println("Number:" + number);
    }
}
