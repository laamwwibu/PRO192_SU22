/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author VICTUS
 */
public class MyCape implements ICape {
    
    public int f1(List<Cape> t) {
        int count = 0;
        int sum = 0;
        
        for (int i = 0; i < t.size(); i++) {
            sum += t.get(i).getColor();
        }
        double avg = sum / t.size();
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getColor() > avg){
                count++;
            }
        }
        return count;
    }
    
    public void f2(List<Cape> t) {
        int count = 0;
        int sum = 0;
        
        for (int i = 0; i < t.size(); i++) {
            sum += t.get(i).getColor();
        }
        double avg = sum / t.size();
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getColor() > avg){
                t.remove(i);
                break;
            }
        }
       
    }
    
    public void f3(List<Cape> t) {
        Comparator<Cape> comparator = new Comparator<Cape>() {
            @Override
            public int compare(Cape t, Cape t1) {
                int n = t.getTailor().length();
                int n1= t1.getTailor().length();
                return t1.getTailor().substring(n1 - 1, n1).compareTo(t.getTailor().substring(n - 1, n));
            }           
        };
        Collections.sort(t, comparator);
    }
    
    
    
    
}
