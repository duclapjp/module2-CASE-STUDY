package molder.product;

import java.io.Serializable;
import java.time.LocalDate;

public class CabinetProduct extends Product implements Serializable {
    public CabinetProduct(String name, String codeProduct, String codeCategory, int quantity, double price, LocalDate importDate, String description) {
        super(name, codeProduct, codeCategory, quantity, price, importDate, description);
    }

    public CabinetProduct() {
    }

    @Override
    public String toString() {
        return "CabinetProduct{" +
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
