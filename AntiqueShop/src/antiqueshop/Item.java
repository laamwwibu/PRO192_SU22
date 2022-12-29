/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antiqueshop;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class Item {
    int value;
    String creator;
    
    public Item() {
        super();
    }
    
    public Item(int value, String creator) {
        super();
        this.value = value;
        this.creator = creator;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public int getValue() {
        return this.value;
    }
    public String getCreator() {
        return this.creator;
    }    
    public void input() {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        value = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter creator: ");
        creator = sc.nextLine();
    }
//this method returns a string that includes value, creator of a Item object 
    @Override
    public String toString() {
        return "Value: " + this.value + ", Creator: " + this.creator;
    }
}
