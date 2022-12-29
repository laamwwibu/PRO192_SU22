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
public class Statue extends Item {
    private int weight;
    private String colour;
    
    public Statue() {
        super();
    }
    
    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }
    
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight: ");
        weight = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Colour: ");
        colour = sc.nextLine();
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Weight: " + this.weight + ", Colour: " + this.colour;
    }
}
