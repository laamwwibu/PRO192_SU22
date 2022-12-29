/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4_alias_6_5_2020;

/**
 *
 * @author VICTUS
 */
public class MyConvetible {
    public double toMile(double x) {
        return 0.621371 * x;
    }
    
    public String getCode(String rc) {
        //KCM726 -> KCM-726
        String result = "";
        for (int i = 0; i < rc.length(); i++) {
            if((i + 1) % 3 == 0 && i != rc.length() - 1) {
                result = result + rc.charAt(i) + "-";
            } else {
                result = result + rc.charAt(i);
            }
        }
        return result;
        
        //---------------------------------------------
        //lay nua dau cua KCM-826 -> KCM
        int index;
        for (int i = 0; i < rc.length(); i++) {
            if(rc.charAt(i) == '-') {
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            result = result + rc.charAt(i);
        }
        return result;
        
        //---------------------------------------------
        //dung split KCM-BCC-ABC 
        String []txt = rc.split("-");
        String result1 = txt[0];     //-> KCM
        String result2 = txt[1];     //-> BCC
        String result3 = txt[2];     //-> ABC
        return result;
    }

    
    
}
