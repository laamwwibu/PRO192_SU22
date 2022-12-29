/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_alias_getsaleprice;

/**
 *
 * @author VICTUS
 */

class Sale {
    private String series;

    public Sale() {
    }

    public Sale(String series) {
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    
    
}
public class getSalePrice {
    //end of string equals to "A" or "a"    ->  5% discount
    //else discount 1%
    public double getSalePrice() {
        if(series.endsWith("A") || series.endsWith("a")) {
        return 0.95 * super.getPrice();
        } else {
        return 0.99 * super.getPrice();
        }
    }
}
