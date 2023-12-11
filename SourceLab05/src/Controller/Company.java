
package Controller;

import Model.Customer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Company {
    private static Scanner sc;
    private List<Customer> listCustomer;

    public Company() {
        listCustomer = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public List<Customer> getListCutomer() {
        return listCustomer;
    }
    
    public void listCustomer(List<Customer> listCustomer){
        System.out.println("List of Customers");
        System.out.println("-------------------------------------------");
        
        System.out.println(listCustomer);
        
        System.out.println("-------------------------------------------");
        System.out.println("Total: "+listCustomer.size());
    }
    
    public void searchByID(){
        System.out.println("Enter Customer ID: ");
        int id = sc.nextInt();
        List<Customer> listFindID = new ArrayList<>();
        for (Customer pt: listCustomer){
            if (pt.getCustomerID() == id){
                listFindID.add(pt);
                break;
            }
        }
        listCustomer(listFindID);
    }
    
    public void searchByName(){
        System.out.println("Enter Customer Name: ");
        int name = sc.nextInt();
        List<Customer> listFindName = new ArrayList<>();
        for (Customer pt: listCustomer){
            if (pt.getCustomerID() == name){
                listFindName.add(pt);
                break;
            }
        }
        listCustomer(listFindName);
    }
    
    public void addCustomer(){
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter phone: ");
        String phone = sc.next();
        Customer newCus = new Customer(id, name, phone);
        listCustomer.add(newCus);
        System.out.println("Success Add Customer");
        
    }
    
    public void staticticalCustomer(){
        Comparator<Customer> c = new Comparator<Customer>(){
            @Override
            public int compare(Customer o1, Customer o2){
                int d = o1.getName().compareTo(o2.getName());
                if (d>0) return 1;
                else if (d<0) return -1;
                return 0;
            }
        };
        Collections.sort(listCustomer, c);
        listCustomer(listCustomer);
    }
}
