package ProductManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ListProduct {

    ArrayList<Product> listProduct = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.println("-------------------------------------");
        System.out.println("1. Add Smart Phone ");
        System.out.println("2. Add Tivi ");
        System.out.println("3. Add Air-conditioner ");
        int choice = 0;
        boolean check = true;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                check = false;
            } catch (Exception e) {
                System.out.println("Please! Input Number.");
            }
        } while (check);
        switch (choice) {
            case 1:
                addSmartPhone();
                break;
            case 2:
                addTV();
                break;
            case 3:
                addAirConditiner();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        System.out.println();
        System.out.print("Continue add (Y/N): ");
        String c = sc.nextLine();
        if (c.equalsIgnoreCase("Y")) {
            addProduct();
        }
    }

    public void addSmartPhone() {
        System.out.println("-------------------------------------");
        System.out.println("Add Smart Phone ");
        String code, name, brand, ram, cpu;
        int size, price, quantity;

        boolean check = true;
        do {
            code = Utils.getStringreg("Enter Code: ", "^P\\d{6}$",
                    "Code cannot be empty.", "Wrong code format.");
            if (checkCode(code)) {
                System.out.println("Same code.");
            } else {
                check = false;
            }
        } while (check);
        name = Utils.getString("Enter Name: ",
                "Name cannot be empty.");
        brand = Utils.getString("Enter Brand: ", "Brand cannot be empty");
        ram = Utils.getString("Enter Ram: ", "Ram cannot be empty");
        cpu = Utils.getString("Enter CPU: ", "CPU cannot be empty");
        size = Utils.getInt("Enter Size: ", 0);
        price = Utils.getInt("Enter Price: ", 0);
        quantity = Utils.getInt("Enter Quantity: ", 0);
        Product pro = new SmartPhone(code, name, brand, ram, cpu, size, price, quantity);
        listProduct.add(pro);
    }

    public void addTV() {
        System.out.println("-------------------------------------");
        System.out.println("Add Tivi ");
        String code, name, brand;
        int size, price, quantity;

        boolean check = true;
        do {
            code = Utils.getStringreg("Enter Code: ", "^P\\d{6}$",
                    "Code cannot be empty.", "Wrong code format.");
            if (checkCode(code)) {
                System.out.println("Same code.");
            } else {
                check = false;
            }
        } while (check);
        name = Utils.getString("Enter Name: ",
                "Name cannot be empty.");
        brand = Utils.getString("Enter Brand: ", "Brand cannot be empty");
        size = Utils.getInt("Enter Size: ", 0);
        price = Utils.getInt("Enter Price: ", 0);
        quantity = Utils.getInt("Enter Quantity: ", 0);
        Product pro = new TiVi(code, name, brand, size, price, quantity);
        listProduct.add(pro);
    }

    public void addAirConditiner() {
        System.out.println("-------------------------------------");
        System.out.println("Add Air-conditioner ");
        String code, name, brand;
        int power, price, quantity;

        boolean check = true;
        do {
            code = Utils.getStringreg("Enter Code: ", "^P\\d{6}$",
                    "Code cannot be empty.", "Wrong code format.");
            if (checkCode(code)) {
                System.out.println("Same code.");
            } else {
                check = false;
            }
        } while (check);
        name = Utils.getString("Enter Name: ",
                "Name cannot is empty.");
        brand = Utils.getString("Enter Brand: ", "Brand cannot be empty");
        power = Utils.getInt("Enter Power: ", 0);
        price = Utils.getInt("Enter Price: ", 0);
        quantity = Utils.getInt("Enter Quantity: ", 0);
        Product pro = new AirConditioner(code, name, brand, power, price, quantity);
        listProduct.add(pro);
    }

    public void printList() {
        System.out.println("-------------------------------------");
        System.out.println("List of Products: ");
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public void printSPdes() {
        System.out.println("-------------------------------------");
        ArrayList<Product> listSM = new ArrayList<>();
        for (Product pro : listProduct) {
            if (pro instanceof SmartPhone) {
                listSM.add(pro);
            }
        }

        Collections.sort(listSM, new Comparator<Product>() {
            @Override
            public int compare(Product t, Product t1) {
                if (t.getPrice() > t1.getPrice()) {
                    return -1;
                } else if (t.getPrice() < t1.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        
        if (listSM.isEmpty()) {
            System.out.println("No Smartphone products available.");
        } else {
            System.out.println("List of Smartphones in descending: ");
            for (Product product : listSM) {
                System.out.println(product);
            }
        }
    }

    public void printTVasc() {
        System.out.println("-------------------------------------");
        ArrayList<Product> listTV = new ArrayList<>();
        for (Product pro : listProduct) {
            if (pro instanceof TiVi) {
                listTV.add(pro);
            }
        }

        Collections.sort(listTV, new Comparator<Product>() {
            @Override
            public int compare(Product t, Product t1) {
                if (t.getPrice() > t1.getPrice()) {
                    return 1;
                } else if (t.getPrice() < t1.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        
        if (listTV.isEmpty()) {
            System.out.println("No TV products available.");
        } else {
            System.out.println("List of Tivis in ascending: ");
            for (Product product : listTV) {
                System.out.println(product);
            }
        }
    }

    public void printACdes() {
        System.out.println("-------------------------------------");
        ArrayList<Product> listAC = new ArrayList<>();
        for (Product pro : listProduct) {
            if (pro instanceof AirConditioner) {
                listAC.add(pro);
            }
        }

        Collections.sort(listAC, new Comparator<Product>() {
            @Override
            public int compare(Product t, Product t1) {
                if (t.getPrice() > t1.getPrice()) {
                    return -1;
                } else if (t.getPrice() < t1.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        
        if (listAC.isEmpty()) {
            System.out.println("No Air-conditioner products available.");
        } else {
            System.out.println("List of Air-conditioners in descending: ");
            for (Product product : listAC) {
                System.out.println(product);
            }
        }
    }

    public void printHighestUnitPrice() {
        System.out.println("-------------------------------------");
        ArrayList<Product> listSM = new ArrayList<>();
        ArrayList<Product> listTV = new ArrayList<>();
        ArrayList<Product> listAC = new ArrayList<>();

        for (Product pro : listProduct) {
            if (pro instanceof SmartPhone) {
                listSM.add(pro);
            } else if (pro instanceof TiVi) {
                listTV.add(pro);
            } else {
                listAC.add(pro);
            }
        }
        int maxSM = findMax(listSM);
        int maxTV = findMax(listTV);
        int maxAC = findMax(listAC);

        if (listSM.isEmpty()) {
            System.out.println("No Smartphone products available.");
        } else {
            System.out.println("Max price of Smartphone: ");
            printMax(listSM, maxSM);
        }
        if (listTV.isEmpty()) {
            System.out.println("No TV products available.");
        } else {
            System.out.println("Max price of Tivi: ");
            printMax(listTV, maxTV);
        }
        if (listAC.isEmpty()) {
            System.out.println("No Air-conditioner products available.");
        } else {
            System.out.println("Max price of Air-conditioner: ");
            printMax(listAC, maxAC);
        }
    }

    public void update() {
        System.out.println("-------------------------------------");
        String code = Utils.getStringreg("Enter Code: ", "^P\\d{6}$",
                "Code cannot be empty.", "Wrong code format.");
        boolean check = true;
        for (Product product : listProduct) {
            if (code.equals(product.getCode())) {
                if (product instanceof SmartPhone) {
                    check = false;
                    updateSM((SmartPhone) product);
                } else if (product instanceof TiVi) {
                    check = false;
                    updateTV((TiVi) product);
                } else if (product instanceof AirConditioner) {
                    check = false;
                    updateAC((AirConditioner) product);
                }
            }
        }
        if (check) {
            System.out.println("Code not found.");
        }
    }

    public void delete() {
        System.out.println("-------------------------------------");
        String code = Utils.getStringreg("Enter Code: ", "^P\\d{6}$",
                "Code cannot be empty.", "Wrong code format.");
        boolean check = true;
        for (int i = 0; i < listProduct.size(); i++) {
            if (code.equals(listProduct.get(i).getCode())) {
                listProduct.remove(i);
                System.out.println("Delete Successfully.");
                check = false;
            }
        }
        if (check) {
            System.out.println("Code not found.");
        }
    }

    public void printTotal() {
        System.out.println("-------------------------------------");
        int sum = 0;
        for (Product product : listProduct) {
            sum += (product.getPrice() * product.getQuantity());
        }
        System.out.println("Total amount of all products : " + sum);
    }

    public void updateSM(SmartPhone sm) {
        System.out.println("-------------------------------------");
        System.out.println("Update Smart Phone ");
        String name, brand, ram, cpu;
        int size, price, quantity;

        name = Utils.getString("Enter Name: ",
                "Name cannot be empty.");
        sm.setName(name);
        brand = Utils.getString("Enter Brand: ", "Brand cannot be empty");
        sm.setBrand(brand);
        ram = Utils.getString("Enter Ram: ", "Ram cannot be empty");
        sm.setRam(ram);
        cpu = Utils.getString("Enter CPU: ", "CPU cannot be empty");
        sm.setCpu(cpu);
        size = Utils.getInt("Enter Size: ", 0);
        sm.setSize(size);
        price = Utils.getInt("Enter Price: ", 0);
        sm.setPrice(price);
        quantity = Utils.getInt("Enter Quantity: ", 0);
        sm.setQuantity(quantity);
        System.out.println("Update Smart Phone Successfully.");
    }

    public void updateTV(TiVi tv) {
        System.out.println("-------------------------------------");
        System.out.println("Update Tivi ");
        String name, brand;
        int size, price, quantity;

        name = Utils.getString("Enter Name: ",
                "Name cannot be empty.");
        tv.setName(name);
        brand = Utils.getString("Enter Brand: ", "Brand cannot be empty");
        tv.setBrand(brand);
        size = Utils.getInt("Enter Size: ", 0);
        tv.setSize(size);
        price = Utils.getInt("Enter Price: ", 0);
        tv.setPrice(price);
        quantity = Utils.getInt("Enter Quantity: ", 0);
        tv.setQuantity(quantity);
        System.out.println("Update Tivi Successfully.");
    }

    public void updateAC(AirConditioner ac) {
        System.out.println("-------------------------------------");
        System.out.println("Update Air-conditioner ");
        String name, brand;
        int power, price, quantity;

        name = Utils.getString("Enter Name: ",
                "Name cannot is empty.");
        ac.setName(name);
        brand = Utils.getString("Enter Brand: ", "Brand cannot be empty");
        ac.setBrand(brand);
        power = Utils.getInt("Enter Power: ", 0);
        ac.setPower(power);
        price = Utils.getInt("Enter Price: ", 0);
        ac.setPrice(price);
        quantity = Utils.getInt("Enter Quantity: ", 0);
        ac.setQuantity(quantity);
        System.out.println("Update Air-conditioner Successfully.");
    }

    public void printMax(ArrayList<Product> list, int max) {
        for (Product product : list) {
            if (max == product.getPrice()) {
                System.out.println(product);
            }
        }
    }

    public int findMax(ArrayList<Product> list) {
        int maxPrice = 0;
        for (int i = 0; i < list.size(); i++) {
            if (maxPrice < list.get(i).getPrice()) {
                maxPrice = list.get(i).getPrice();
            }
        }
        return maxPrice;
    }

    public boolean checkCode(String code) {
        for (Product pro : listProduct) {
            if (code.equals(pro.getCode())) {
                return true;
            }
        }
        return false;
    }
}
