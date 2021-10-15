package controller;

import molder.Customer;
import storage.FileCustomer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerManager implements GeneralManager<Customer> {
    List<Customer> customerList = new ArrayList<>();

    @Override
    public void showAll() {
        for (Customer c:customerList) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void add(Customer customer) throws IOException {
        customerList.add(customer);
        FileCustomer.writeFile(customerList);
    }


    @Override
    public void edit(int index, Customer customer) throws IOException {
        customerList.set(index, customer);
        FileCustomer.writeFile(customerList);
    }


    @Override
    public void delete(int index) throws IOException {
        customerList.remove(index);
        FileCustomer.writeFile(customerList);
    }

    @Override
    public void check(String nameCustomer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().equals(nameCustomer)){
                System.out.println(customerList.get(i).toString());
            }
        }
    }
}
