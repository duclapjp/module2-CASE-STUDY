package view;

import controller.CustomerManager;
import molder.Customer;
import storage.FileCustomer;

import java.util.List;
import java.util.Scanner;

public class ClientCustomer {
    private static Scanner scanner =new Scanner(System.in);
    private static List<Customer> customerList;
    public static void main(String[] args) {
        CustomerManager lap = new CustomerManager();
        customerList  = FileCustomer.readFile();
        boolean check = true;
        while (check){
            System.out.println("chọn chức năng");
            System.out.println("-----MENU----");
            System.out.println("1:Thêm khách hàng");
            System.out.println("2:Hiển thị danh sách khách hàng");
            System.out.println("3:Tìm kiếm");
            System.out.println("4:Khách hàng tiềm năng");
            System.out.println("5:Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    customerList.add(creatCustomer());

            }
        }


    }
    public static Customer creatCustomer(){
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập số sản phẩm đã mua");
        int countOfBuy = scanner.nextInt();
        System.out.println("nhập số điện thoại");
        String phoneNumber = scanner.nextLine();
        Customer customer = new Customer(name,address,countOfBuy,phoneNumber);
        return customer;
    }
}
