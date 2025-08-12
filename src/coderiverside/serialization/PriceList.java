package coderiverside.serialization;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PriceList implements Serializable  {
    private LocalDate date;
    private Set<Product> items = new HashSet<>();
    private transient String uuid = UUID.randomUUID().toString();

    public PriceList(LocalDate date) {
        this.date = date;
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public LocalDate getDate() {
        return date;
    }

    public Set<Product> getItems() {
        return items;
    }

    public String getUuid() {
        return uuid;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PriceList{")
                .append("date=").append(date)
                .append(", uuid='").append(uuid).append('\'')
                .append(", items=[");

        int i = 0;
        for (Product product : items) {
            sb.append("\n  ").append(i + 1).append(": ").append(product);
            if (i < items.size() - 1) {
                sb.append(",");
            }
            i++;
        }

        sb.append("\n]}");
        return sb.toString();
    }
}
