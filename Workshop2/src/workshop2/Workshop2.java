/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class Workshop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean cont=false;
        do {
            try {
                String s = "";
                String pattern = "falls|stay";
                System.out.println("Enter");
                Scanner sc = new Scanner(System.in);
                s = sc.nextLine();
                if(! s.matches(pattern)) {
                    throw new IOException();
                }    
                    System.out.println("The string is " + s);
                    cont=false;
                    
            } catch (Exception e) {
                        System.out.println("invalid");
                        cont= true;
                        }
        } while(cont);
    }
}
    
