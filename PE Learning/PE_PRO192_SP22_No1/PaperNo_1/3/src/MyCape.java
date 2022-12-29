import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class MyCape implements ICape {

    @Override
    public int f1(List<Cape> t) {
        int count = 0;
        float avercolor = getAverageColor(t);
        for (Cape cape : t) {
            if (cape.getColor() > ((int) avercolor)) {
                count++;
            }
            
            

        }
        return count;
        

    }

    @Override
    public void f2(List<Cape> t) {
        float avercolor = getAverageColor(t);
        int index = -1;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getColor() > ((int) avercolor)) {
                index = i;
                break;
            }

        }
        if (index != -1) {
            t.remove(index);

        }

    }

    @Override
    public void f3(List<Cape> t) {

    }

    private float getAverageColor(List<Cape> t) {
        int sum = 0;
        for (Cape cape : t) {
            sum += cape.getColor();

        }
        return ((float) sum) / t.size();

    }

}