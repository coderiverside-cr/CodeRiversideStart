package coderiverside.classesobjetos;

import java.math.BigDecimal;

class Product {
    private long id;
    private String name;
    private String brand;
    private BigDecimal price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        if(name == null){
            String value = "Unknown";
            return value;
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

class Drink{
    private int volume;
}



