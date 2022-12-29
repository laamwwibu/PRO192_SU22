/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author VICTUS
 */
public class Car {
    private String Maker;
    private int Price;

    public Car() {

    }
    
    public Car(String Maker, int Price) {
        this.Maker = Maker;
        this.Price = Price;
    }

    public String getMaker() {
        return this.Maker;
    }

    public int getPrice() {
        return this.Price;
    }

    public void setMaker(String Maker) {
        this.Maker = Maker;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Maker: "+getMaker()+"\n"+"Price: "+getPrice()+"\n";
    }

}