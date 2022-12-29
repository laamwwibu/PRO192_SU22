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
public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWaterColour;
    private boolean isFramed;

    
    public Painting() {
        super();
    }
    
    public Painting(int value, String creator, int height, int width, boolean isWaterColour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColour = isWaterColour;
        this.isFramed = isFramed;   
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getHeight() {
        return this.height;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }
    
    public void setIsWaterColour(boolean isWaterColour) {
        this.isWaterColour = isWaterColour;
    }

    public boolean getIsWaterClolour() {
        return this.isWaterColour;
    }
    
    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public boolean getIsFramed() {
        return this.isFramed;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height: ");
        height = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Width: ");
        width = sc.nextInt();
        sc.nextLine();
            System.out.print("Is it Water Coloured? <true/false>: ");
        isWaterColour=sc.nextBoolean();
            System.out.print("Is it framed? <true/false>: ");
        isFramed=sc.nextBoolean();
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Height: " + this.height + ", Width: " + this.width + ", isWaterColour: " + this.isWaterColour + ", isFramed: " + this.isFramed;
    }
}
