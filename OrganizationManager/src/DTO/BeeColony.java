/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author VICTUS
 */
public class BeeColony extends Colony implements Role {
    String type;
    
    public BeeColony() {
        
    }

    public BeeColony(int size, String type, String place) {
        this.size = size;
        this.place = place;
        this.type = type;
    }
    
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "the colony's type is " + type + ", size is about " + size + ", and the place is " + place;
    }
    
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }
}
