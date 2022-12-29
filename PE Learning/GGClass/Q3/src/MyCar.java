
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VICTUS
 */
public class MyCar implements ICar {

    @Override
    public int f1(List<Car> t) {
        double sum = 0;
        int carCount = t.size();
        
        for (int i = 0; i < carCount; i++) {
            sum += t.get(i).getRate();
        }
        return (int) sum / carCount;
    }

    @Override
    public void f2(List<Car> t) {
        //tim vij tris phan tu min dau tien
        int indexMin = getIndexMinRate(t);
        //tim vi tri phan tu max dau tien
        int indexMax = getIndexMaxRate(t);
        Car carTemp = t.get(indexMin);
        t.set(indexMin, t.get(indexMax));
        t.set(indexMax, carTemp);
        
    }

    @Override
    public void f3(List<Car> t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getIndexMinRate(List<Car> t) {
        int valueMin = t.get(0).getRate();
        int indexMin = 0;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getRate() < valueMin) {
                valueMin = t.get(i).getRate();
                indexMin = i;
            }
        }
        return indexMin;
    }

    private int getIndexMaxRate(List<Car> t) {
        int valueMax = t.get(0).getRate();
        int indexMax = 0;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getRate() > valueMax) {
                valueMax = t.get(i).getRate();
                indexMax = i;
            }
        }
        return indexMax;
    }
    
}
