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
public class Vase extends Item {
    private int height;
    private String material;
    
    public Vase() {
        super();
    }
    
    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
        
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    } 
    
    public String getMaterial() {
        return this.material;
    }
    
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height: ");
        height = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Material: ");
        material = sc.nextLine();   
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Height: " + this.height + ", Material: " + this.material;
    }
}
