/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3_alias_6_5_2020;

/**
 *
 * @author VICTUS
 */
public class MyPrinter implements IPrinter {
    //remove from the list printers that have price <= given price
    //=> the list is "a", "given price" is "double price"
    public void f1(List<Printer> a, double price) {
        for (int i = 0; a.size() < 10; i++) {
            if(a.get(i).getPrice() <= price){
                a.remove(i);
                i--;
            }
        }
    }
    
    //count and return the number of printer that in the list has name
    //contain the given name. not case sensitive
    
    public int f2(List<Printer> a, String name) {
        int count = 0;
        //neu nhap chu thg thi ket qua 
        for (Object o : a) {
            if(o.getName().toUpperCase().contains(name.toUpperCase())) {
                count++;
            }
        }
        return count;
    }
}
