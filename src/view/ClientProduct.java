package view;

import controller.ProductManager;
import molder.product.Product;
import molder.product.ProductFactory;
import molder.product.ProductType;
import storage.FileProduct;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ClientProduct {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList;

    public static void main(String[] args) throws IOException {
        ProductManager duclap = new ProductManager();
        FileProduct fileProduct = FileProduct.getInstance();
        productList = fileProduct.readFile();
        duclap.setProductList(productList);
        boolean check = true;
        while (check) {
            System.out.println("chọn chức năng");
            System.out.println("-----MENU----");
            System.out.println("1:Thêm sản phẩm");
            System.out.println("2:Hiển thị sản phẩm");
            System.out.println("3:Sửa");
            System.out.println("4:Xóa");
            System.out.println("5:Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    duclap.add(creatProduct());
                    duclap.showAll();
                    break;
                case 2:
                    duclap.showAll();
                    break;
                case 5:
                    check = false;
                    break;
            }
        }
    }

    public static Product creatP() {
        System.out.println("nhập vào kiểu sản phẩm muốn thêm:BED,TABLE,CHAIR,CABINET");
        scanner.nextLine();
        String name = scanner.nextLine();
        if (name.equals("BED")) {
            System.out.println("bạn đã chọn giường");
            return ProductFactory.getProduct(ProductType.BED);
        }
        if (name.equals("TABLE")) {
            System.out.println("bạn đã chọn bàn");
            return ProductFactory.getProduct(ProductType.TABLE);
        }
        if (name.equals("CHAIR")) {
            System.out.println("bạn đã chọn ghế");
            return ProductFactory.getProduct(ProductType.CHAIR);
        }
        if (name.equals("CABINET")) {
            System.out.println("bạn đã chọn tủ");
            return ProductFactory.getProduct(ProductType.CABINET);
        }
        return null;
    }

    public static Product creatProduct() {
        Product product = creatP();
        int random = (int) Math.random();
        System.out.println("nhập tên sản phẩm");
        product.setName(scanner.nextLine());
        System.out.println("nhập mã sản phẩm");
        product.setCodeProduct(scanner.nextLine());
        System.out.println("nhập mã danh mục");
        product.setCodeCategory(scanner.nextLine());
        System.out.println("nhập số lượng");
        product.setQuantity(scanner.nextInt());
        System.out.println("nhập giá");
        product.setPrice(scanner.nextDouble());
        System.out.println("ngày nhập");
        product.setImportDate(LocalDate.now().minusDays(random * 100 + 1));
        System.out.println(product.getImportDate());
        System.out.println("nhập mô tả");
        scanner.nextLine();
        product.setDescription(scanner.nextLine());
        return product;
    }
}
