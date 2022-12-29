/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mhieu
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
        return super.toString() + "," + type;
    }

    public void setData() {
        String res = "";
        for (int i = 0; i < super.getTailor().length() - 2; i++) {
            res
                    += super.getTailor().charAt(i);
        }
        res += "XYZ";
        super.setTailor(res);
    }

    public int getValue() {
        if (Character.isDigit(super.getTailor().charAt(0))) {
            return super.getColor() + 11;
        }
        return super.getColor() + 4;
    }

}
