
package Part03;

import java.util.Scanner;

public class Use_Employee {
    public static double TotalSalary(Employee emp[]){
        double total=0;
        for (int i=0;i<emp.length;i++){
            total+=(emp[i].getSalary()*emp[i].getSalaryCoefficient());
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = Integer.parseInt(sc.nextLine());
        Employee[] emp = new Employee[n];
        
        for (int i=0; i<n ; i++){
            System.out.println("Employee "+(i+1));
            System.out.print("Enter code: ");
            String code = sc.nextLine();
            System.out.print("Enter fullname: ");
            String fullname = sc.nextLine();
            System.out.print("Enter phone: ");
            String phone = sc.nextLine();
            boolean check = true;
            double Salary = 0;
            do {
                try {
                    System.out.print("Enter Salary: ");
                    Salary = Double.parseDouble(sc.nextLine());
                    check = false;
                } catch (NumberFormatException e) {
                    System.out.println("Required integer!");
            }
            } while (check == true);
            check = true;
            double SalaryCoefficient = 0;
            do {
                try {
                    System.out.print("Enter Salary Coefficient: ");
                    SalaryCoefficient = Double.parseDouble(sc.nextLine());
                    check = false;
                } catch (NumberFormatException e) {
                    System.out.println("Required integer!");
            }
            } while (check == true);
            System.out.print("Enter department: ");
            String department = sc.nextLine();
            
            emp[i]= new Employee(code, fullname, phone, 
                    Salary, SalaryCoefficient, department);
        }
        
        System.out.println("List of employees: ");
        for (int i=0; i<n ; i++){
            System.out.println(emp[i]);
        }
        
        double total = Use_Employee.TotalSalary(emp);
        System.out.println("Total Salary : "+total);
        
        System.out.print("Enter the code you want to change salary: ");
        String codeChange = sc.nextLine();
        boolean check = false;
        for (int i=0; i<n ; i++){
            if (codeChange.equals(emp[i].getCode())){
                check = true;
                boolean cont = true;
                double SalaryAgain = 0;
                do {
                    try {
                        System.out.print("Enter Salary: ");
                        SalaryAgain = Double.parseDouble(sc.nextLine());
                        cont = false;
                    } catch (NumberFormatException e) {
                        System.out.println("Required integer!");
                }
                } while (cont == true);
                emp[i].setSalary(SalaryAgain);
                System.out.println("New Salary: "+emp[i]);
                break;
            }             
        }
        if (!check) 
            System.out.println("Code not found!");
    }
}
