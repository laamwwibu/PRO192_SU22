
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VICTUS
 */
public class MyCala implements ICala {

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for (Cala cala : t) {
            if(Character.isAlphabetic(cala.getOwner().charAt(1))) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void f3(List<Cala> t) {
        Comparator<Cala> cmp = new Comparator<Cala>() {
            @Override
            public int compare(Cala t, Cala t1) {
                return Character.compare(t1.getOwner().charAt(1), t.getOwner().charAt(1));
            } 
        };
        Collections.sort(t, cmp);
    }
    
}
