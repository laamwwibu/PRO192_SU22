/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antiqueshop;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class Main {
    public static void Menu(int choice, ItemList list) {
    Scanner sc = new Scanner(System.in);
    int index;
    switch(choice) {
        case 1:
            Item vase = new Vase();
            vase.input();
            if(list.addItem(vase)) System.out.println("New vase added!!");
            break;
        case 2:
            Item statue = new Statue();
            statue.input();
            if(list.addItem(statue)) System.out.println("New statue added!!");
            break;
        case 3:
            Item painting = new Painting();
            painting.input();
            if(list.addItem(painting)) System.out.println("New painting added!!");
            break;
        case 4:
            list.displayAll();
            break;
        case 5:
            System.out.print("Please enter the name of creator: ");
            String creator=sc.nextLine();
            System.out.println(list.findItem(creator));
            break;
        case 6:
            System.out.print("Please enter the index of the item you want to update: ");
            index = sc.nextInt();
            sc.nextLine();
            if(list.updateItem(index)) System.out.println("Item updated!");
            break;
        case 7:
            System.out.print("Please enter the index of the item you want to remove: ");
            index = sc.nextInt();
            sc.nextLine();
            if(list.removeItem(index)) System.out.println("Item removed!");
            break;
        case 8:
            System.out.println("VASE ITEM: ");
            list.displayItemsByType("vase");
            System.out.println("----------------");
            break;
        case 9:
            list.sortItem();
            break;
        case 10:
            System.exit(0);
            break;
        default:
            System.out.println("Please Enter a valid input!");
            break;
        }
    }
    public static void main(String[] args) {
        ItemList list = new ItemList();
        Scanner sc = new Scanner(System.in);
        do{
        System.out.printf("1. Add a new vase\n" +
        "2. Add a new statue\n" +
        "3. Add a new painting\n" +
        "4. Display all items\n" +
        "5. Find the items by the creator\n" +
        "6. Update the item by its index\n" +
        "7. Remove the item by its index\n" +
        "8. Display the list of vase items \n" +
        "9. Sorts items in ascending order based on their values \n" +
        "10. Exit\n");
            System.out.print("Enter your choice: ");
        try {
            int choice=sc.nextInt();
            sc.nextLine();
            Menu(choice,list);
        } catch(Exception e) {
            System.out.println("Please enter validate integer");
        }
            System.out.println("Press any key to continue");
            sc.next();
        } while(true);
    }  
}
