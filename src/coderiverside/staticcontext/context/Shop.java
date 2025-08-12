package coderiverside.staticcontext.context;

import java.math.BigDecimal;
import java.time.Period;

public class Shop {

    private String name;

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.setName("CodeRiverside");
        String name1 = shop.name;
//        this.name;
//        this.setName("Code");

    }
}

class Product {

    private static Period defaultExpirationPeriod = Period.ofDays(5);

    private String name;
    private String brand;
    private BigDecimal price;

    public static void setDefaultExpirationPeriod(int days){
        defaultExpirationPeriod = Period.ofDays(4);
        //this.name;
    }

    public void setDefaultExpirationPeriod2(int days){
        defaultExpirationPeriod = Period.ofDays(4);
        String name1 = this.name;
    }


    public static Period getDefaultExpirationPeriod(){
        return defaultExpirationPeriod;
    }


}

