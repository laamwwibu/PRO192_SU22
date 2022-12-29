/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VICTUS
 */
public class SpecCala extends Cala {
    private int color;

    public SpecCala() {
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setData() {
        int n = super.getOwner().length();
        super.setOwner(super.getOwner().substring(0, 2) + "XX" + super.getOwner().substring(3, n));
    }
    
    public int getValue() {
        int check_color = 0;
        if(getColor() % 2 == 0) {
           return super.getPrice() + 7;
        } else {
            return super.getPrice() + 3;
        }
    }
}
