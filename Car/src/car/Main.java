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

import java.util.Scanner;

public class Main {
public static void main(String[] args){
for (int i0 =0; i0 < 12; i0++)
System.out.println("This is my Car Project");

Scanner sc = new Scanner(System.in);
String Maker; int Price, Type; int tc;
System.out.println();
System.out.print("Enter maker: ");
Maker = sc.nextLine();
System.out.print("Enter price: ");
Price = sc.nextInt(); sc.nextLine();
System.out.print("Enter type: ");
Type = sc.nextInt(); sc.nextLine();
System.out.println("1. Test toString()");
System.out.println("2. Test setData()");
System.out.println("3. Test getValue()");

System.out.print("Enter TC (1,2,3): ");
tc = sc.nextInt(); sc.nextLine();
System.out.println("OUTPUT:");
switch (tc) {
case 1: {
Car a11 = new Car(Maker, Price);
System.out.println(a11);
Car a12 = new SpecCar(Maker, Price, Type);
System.out.println(a12);
break;
}
case 2:
SpecCar b2 = new SpecCar(Maker, Price, Type);
b2.setData();
String v2 = b2.getMaker();
int k2 = b2.getPrice();
System.out.printf("%s, %d\n",v2, k2);
break;
case 3:
SpecCar b3 = new SpecCar(Maker, Price, Type);
int v3 = b3.getValue();
System.out.printf("%d\n",v3);
break;
default:
break;
}
System.out.println();
Car car1 = new Car();
}
}