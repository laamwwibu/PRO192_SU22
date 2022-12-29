/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.util.List;

/**
 *
 * @author VICTUS
 */
public class Manager1 implements CarManager {
    @Override
    public int getAverage(List<Car> car_list) {
        int numberOfCars = car_list.size();
        int sumOfRate = 0;
        for (Car x: car_list) {
            sumOfRate += x.getRate();
        }
        return sumOfRate / numberOfCars;
    }
    
    @Override
    public int getMaxRate(List<Car> car_list) {
        
        return 0;
    }
}
