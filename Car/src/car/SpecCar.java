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

public class SpecCar extends Car {
    private int Type;
    
    public SpecCar() {
        
    }
    
    public SpecCar(String Maker, int Price, int t) {
        super(Maker, Price);
        Type = t;
    }
    
    @Override
    public String toString() {
        return "Type: " + Type + "\n" + "Maker: " + super.getMaker() + "\n" + "Price: " + super.getPrice() + "\n";
    }
    
    public void setData() {
        super.setMaker("Default Maker");
        super.setPrice(100);
    }
    
    public void setData(String Maker, int Price) {
        super.setMaker(Maker);
        super.setPrice(Price);
    }
    
    public int getValue() {
        return super.getPrice()+20;
    }
    
    public void setType(int t) {
        Type = t;
    }
    
    public int getType() {
        return Type;
    }
    
}
