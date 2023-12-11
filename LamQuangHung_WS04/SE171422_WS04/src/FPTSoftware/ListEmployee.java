package FPTSoftware;

import java.util.ArrayList;

public class ListEmployee {

    private ArrayList employees = new ArrayList();

    public void createFullTimeEmployee() {

        System.out.println("Creating a new Full-time employee");
        String code;
        String fullname;
        String phone;
        String address;
        String department;
        double salary = 0;
        int absent = 0;

        boolean check = true;
        do {
            code = Utils.getStringreg("Enter Code: ", "^FS\\d{5}$",
                    "Code cannot is empty", "Wrong code format");
            if (checkCode(code)) {
                System.out.println("Same code");
            } else {
                check = false;
            }
        } while (check);

        fullname = Utils.getString("Enter Fullname: ",
                "Fullname cannot is empty");
        phone = Utils.getString("Enter Phone: ",
                "Phone cannot is empty");
        address = Utils.getString("Enter Address: ",
                "Address cannot is empty");
        department = Utils.getString("Enter Department: ",
                "Department cannot is empty");
        salary = Utils.getFloat("Enter Salary: ", 1500);
        absent = Utils.getInt("Enter Absent: ", 0);
        Employee emp = new FullTimeEmployee(code, fullname,
                phone, address, department, salary, absent);
        if (checkSize(employees.size())) {
            employees.add(emp);
            System.out.println("Fulltime employee created successfully.");
        } else {
            System.out.println("Can't add Employee because it's full");
        }

    }

    public void createPartTimeEmployee() {
        System.out.println("Creating a new part-time employee");
        String code;
        String fullname;
        String phone;
        String address;
        String department;
        double dailyWage = 0;
        int present = 0;

        boolean check = true;
        do {
            code = Utils.getStringreg("Enter Code: ", "^FS\\d{5}$",
                    "Code cannot is empty", "Wrong code format");
            if (checkCode(code)) {
                System.out.println("Same code");
            } else {
                check = false;
            }
        } while (check);

        fullname = Utils.getString("Enter Fullname: ",
                "Fullname cannot is empty");
        phone = Utils.getString("Enter Phone: ",
                "Phone cannot is empty");
        address = Utils.getString("Enter Address: ",
                "Address cannot is empty");
        department = Utils.getString("Enter Department: ",
                "Department cannot is empty");
        dailyWage = Utils.getFloat("Enter Daily Wage: ", 10);
        present = Utils.getInt("Enter Present: ", 0);
        Employee emp = new PartTimeEmployee(code, fullname,
                phone, address, department, dailyWage, present);
        if (checkSize(employees.size())) {
            employees.add(emp);
            System.out.println("Parttime employee created successfully.");
        } else {
            System.out.println("Can't add Employee because it's full");
        }

    }

    public void printFullTimeEmployees() {
        System.out.println("Full-time Employees:");
        for (Object employee : employees) {
            Employee emp = (Employee) employee;
            if (emp instanceof FullTimeEmployee) {
                System.out.println(emp.viewInfor());
            }
        }
    }

    public void printPartTimeEmployees() {
        System.out.println("Part-time Employees:");
        for (Object employee : employees) {
            Employee emp = (Employee) employee;
            if (emp instanceof PartTimeEmployee) {
                System.out.println(emp.viewInfor());
            }
        }
    }

    public boolean checkSize(int size) {
        if (size < 100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCode(String code) {
        for (Object employee : employees) {
            Employee emp = (Employee) employee;
            if (code.equals(emp.getCode())) {
                return true;
            }
        }
        return false;
    }
}
