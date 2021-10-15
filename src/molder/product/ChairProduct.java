package molder.product;

import java.io.Serializable;
import java.time.LocalDate;

public class ChairProduct extends Product implements Serializable {
    public ChairProduct(String name, String codeProduct, String codeCategory, int quantity, double price, LocalDate importDate, String description) {
        super(name, codeProduct, codeCategory, quantity, price, importDate, description);
    }

    public ChairProduct() {
    }

    @Override
    public String toString() {
        return "ChairProduct{" +
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
