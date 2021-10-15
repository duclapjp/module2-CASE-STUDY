package molder.product;

import java.io.Serializable;
import java.time.LocalDate;

public class TableProduct extends Product implements Serializable {
    public TableProduct(String name, String codeProduct, String codeCategory, int quantity, double price, LocalDate importDate, String description) {
        super(name, codeProduct, codeCategory, quantity, price, importDate, description);
    }

    public TableProduct() {
    }

    @Override
    public String toString() {
        return "TableProduct{" +
                "name='" + name + '\'' +
                ", codeProduct='" + codeProduct + '\'' +
                ", codeCategory='" + codeCategory + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", importDate=" + importDate +
                ", description='" + description + '\'' +
                '}';
    }
}
