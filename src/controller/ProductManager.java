package controller;

import molder.product.Product;
import storage.FileProduct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductManager implements GeneralManager<Product> {
   private static List<Product> productList = new ArrayList<>();
   private FileProduct fileProduct;
   public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void showAll() {
        for (Product p :productList) {
            System.out.println(p.toString());
        }
    }

    @Override
    public void add(Product product) throws IOException {
        productList.add(product);
        fileProduct.writeFile(productList);
    }

    @Override
    public void edit(int index, Product product) throws IOException {
        productList.set(index,product);
        fileProduct.writeFile(productList);
    }

    @Override
    public void delete(int index) throws IOException {
        productList.remove(index);
        fileProduct.writeFile(productList);
    }

    @Override
    public void check(String codeProduct) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCodeProduct().equals(codeProduct)){
                System.out.println(productList.get(i).toString());
            }
        }
    }
}
