package molder.product;

import java.io.Serializable;
import java.time.LocalDate;

public class BedProduct extends Product implements Serializable {
    public BedProduct(String name, String codeProduct, String codeCategory, int quantity, double price, LocalDate importDate, String description) {
        super(name, codeProduct, codeCategory, quantity, price, importDate, description);
    }

    public BedProduct() {

    }

    @Override
    public String toString() {
        return "BedProduct{" +
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
