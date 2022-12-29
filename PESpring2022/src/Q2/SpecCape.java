/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author VICTUS
 */
public class SpecCape extends Cape {
    private int type;

    public SpecCape() {
    }

    public SpecCape(String tailor, int color, int type) {
        super(tailor, color);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.type; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setData() {
        int n = super.getTailor().length();
        super.setTailor(super.getTailor().subSequence(0, n-2) + "XYZ");    
    }
    
    public int getValue() {
        if("0123456789".contains(super.getTailor().subSequence(0, 1))) {
            return super.getColor() + 11;
        }
        return super.getColor() + 4;    
    }
}
