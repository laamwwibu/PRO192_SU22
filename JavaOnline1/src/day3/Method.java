/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author VICTUS
 */
public class Method {
    
    public int tinhTong(int a, int b) {
        return a + b;
    }
    
    public int tinhHieu(int a, int b) {
        return a - b;
    }
    public int tinhTich(int a, int b) {
        return a * b;
    }
    public double tinhThuong(int a, int b) {
        return (double) a / b;
    }
    
    public static void main(String[] args) {
        int a = 1;
        int b = 20;
        
        Method m = new Method();
        //tinh tong, hieu, thuong, tich
        int sum = m.tinhTong(a, b);
        System.out.println("Sum: " + sum);
        int sub = m.tinhHieu(a, b);
        System.out.println("Sub: " + sub);
        int mul = m.tinhTich(a, b);
        System.out.println("Mul: " + mul);
        double div = m.tinhThuong(a, b);
        System.out.println("Div: " + div);
    }
}
