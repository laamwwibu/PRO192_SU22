/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author VICTUS
 */
public class Car implements Comparable<Car> {
    private String maker;
    private int rate;

    @Override
    public int compareTo(Car otherCar) {
        if(this.rate > otherCar.getRate()){
            return 1;
        }
        if (this.rate == otherCar.getRate()){
            return 0;
        }
        if (this.getRate() < otherCar.getRate()){
            return -1;
        }
        return -1;
    }
    
    public Car() {
        maker = "";
        rate = 0;
    }

    public Car(String xMaker, int xRate) {
        maker = xMaker;
        rate = xRate;
    }
    public int getRate() {
        return rate;
    }
    public String getMaker() {
        return maker;
    }
    public void setRate(int xRate) {
        rate = xRate;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public String toString(){
        String ans = "";
        ans += "Car marker: " + this.getMaker() + ", rate: " + this.getRate();
        return ans;
    }
}