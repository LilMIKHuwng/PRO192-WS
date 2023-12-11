
package View;

import Controller.Company;
import java.util.Scanner;

public class Menu {
    private static Scanner sc;
    private String[] options1;
    private String[] options2;
    private Company cp;
    
    public Menu(){
        sc = new Scanner(System.in);
        options1 = new String[]{"List all Customer","Search customer","Add new Customer","Customer Statistical"};
        options2 = new String[]{"Find by CustomerID","Find by Name"};
        cp = new Company();
    }
    
    public int menu(String option[], String msg){
        System.out.println(msg);
        System.out.println("----------------------------------------");
        for (int i = 0; i < option.length; i++) {
            System.out.println((i+1)+", "+option[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println("Enter selection: ");
        return sc.nextInt();
    }
    
    public void mainMenu(){
        while(true){
            int choice = menu(options1, "Company Management System");
            switch (choice) {
                case 1:
                    cp.listCustomer(cp.getListCutomer());
                    break;
                case 2:
                    searchMenu();
                    break;
                case 3:
                    cp.addCustomer();
                    break;
                case 4:
                    cp.staticticalCustomer();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    public void searchMenu() {
        int choice = menu(options2, "Customer Searching");
        switch (choice) {
            case 1:
                cp.searchByID();
                break;
            case 2:
                cp.searchByName();
                break;
            default:
                return;
        }
    }
}
