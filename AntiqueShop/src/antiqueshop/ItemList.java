/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antiqueshop;

/**
 *
 * @author VICTUS
 */
public class ItemList {
    private Item my_list[];
    private int numOfItem;
    private int MAX = 100;
    
    public ItemList() {
        my_list = new Item[MAX];
    }
    
    public boolean addItem(Item my_item) {
        if(my_item == null)
            return false;
        if(numOfItem == MAX)
            return false;
        my_list[numOfItem] = my_item;
        numOfItem ++;
        return true;
    }
    
    public void displayAll() {
        if(my_list == null)
            System.out.println("There are no Items in the List");
        else {
            for(int i = 0; i <= numOfItem; i++)
                System.out.println("Item" + i+1 + " " + my_list[i]);
        }
    }
    
    public Item findItem(String creator) {
        if(findItemIndex(creator) == -1){
            System.out.print("Item: ");
            return null;
        }
        System.out.println("Item found!!");
        String split[] = my_list[findItemIndex(creator)].getClass().toString().split("[.]");
        System.out.println("Type: " + split[1]);
        return my_list[findItemIndex(creator)];
    }
    
    public int findItemIndex(String creator) {
        for(int i = 0; i< numOfItem; i++) {
            if(my_list[i].getCreator().equals(creator))
                return i;
        }
        return -1;
    }
    
    public boolean updateItem(int index) {
        if(index < 0 || index >= numOfItem) {
            System.out.println("There is no Item with corresponding index!");
            return false;
        } 
        my_list[index].input();
        return true;
    }
    
    public boolean removeItem(int index) {
        for(int i = index; i < numOfItem; i++) {
            my_list[i] = my_list[i+1];
        }
        numOfItem--;
        return true;
    }
    
    public void displayItemsByType(String type) {
        int count = 0;
        for(int i=0; i < numOfItem; i++) {
            count++;
            switch (type) {
                case "Vase":
                    if (my_list[i] instanceof Vase){
                        System.out.println("Type: Vase");
                        System.out.println(my_list[i]);
                    }   break;
                case "Painting":
                    if(my_list[i] instanceof Painting){
                        System.out.println("Type: Painting");
                        System.out.println(my_list[i]);
                    }   break;
                case "Statue":
                    if(my_list[i] instanceof Statue){
                        System.out.println("Type: Statue");
                        System.out.println(my_list[i]);
                    }   break;
                default:
                    break;
            }
        }
        if(count == 0) System.out.println("Didn't find the item.");
    }
    
    public void sortItem() {
        Item value;
        for(int i=0; i < numOfItem; i++) {
            for(int j = i+1; j < numOfItem; j++) {
                if(my_list[i].getValue() > my_list[j].getValue()) {
                    value = my_list[i];
                    my_list[i] = my_list[j];
                    my_list[j] = value;
                }
            }
        }
        System.out.println("Items are sorted by value!"); 
    }
}