package coderiverside.memory;

import java.time.LocalDate;

public class MemoryAllocation {
    public static void main(String[] args) {
        short a = 25;
        Product p = new Product();
        System.out.println("p = " + p);

        new MemoryAllocation().manageProduct();

        System.gc();;
        Runtime.getRuntime().gc();

    }

    public void manageProduct() {
        Product p1 = new Product();
        orderProduct(p1);
        double var1 = p1.getPrice();
        changePrice(var1);
    }

    public void orderProduct(Product p2) {
        p2.setPrice(9.99);
    }

    public void changePrice(double var2) {
        var2 = 10.25;
    }


}

class Product {
    private long id;
    private String name;
    private double price;
    private LocalDate bestBefore = LocalDate
            .of(
                    2021,
                    2,
                    25
            );

    @Override
    public String toString() {
        return "Product{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", price='" + price + '\'' +
               ", bestBefore=" + bestBefore +
               '}';
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
