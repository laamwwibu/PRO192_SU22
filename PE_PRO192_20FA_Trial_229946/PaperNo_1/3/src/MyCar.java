
import java.util.Collections;
import java.util.Comparator;
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
        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car t, Car t1) {
                int compare_result = t.getMaker().compareTo(t1.getMaker());
                if(compare_result == 0) {
                    compare_result = t.getRate() - t1.getRate();
                }
                return compare_result;
            }
        };
        Collections.sort(t, comparator);
//        int indexSmall = getIndexSmallRate(t);
//        int indexBig = getIndexBigRate(t);
//        Car carTemp = t.get(indexSmall);
//        t.set(indexSmall, t.get(indexBig));
//        t.set(indexBig, carTemp);
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
        private int getIndexSmallRate(List<Car> t) {
        int valueSmall = t.get(0).getRate();
        int indexSmall = 0;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getRate() < valueSmall) {
                valueSmall = t.get(i).getRate();
                indexSmall =  i;
            }
        }
        return indexSmall;
    }

    private int getIndexBigRate(List<Car> t) {
        int valueBig = t.get(0).getRate();
        int indexBig = 0;    
        for (int i = 0; i < t.size(); i++) {
                if(t.get(i).getRate() > valueBig) {
                    valueBig = t.get(i).getRate();
                    indexBig = i;
                }
            }
        return indexBig;
    }
}
