package FPTSoftware;

import java.util.Scanner;

public class UsingEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListEmployee emp = new ListEmployee();

        int choice = 0;
        do {
            System.out.println("Employee Management Program");
            System.out.println("1. Create a new full-time employee");
            System.out.println("2. Create a new part-time employee");
            System.out.println("3. Print list of full-time employees");
            System.out.println("4. Print list of part-time employees");
            System.out.println("5. Exit");
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
                    for (int i = 0; i < 3; i++) {
                        emp.createFullTimeEmployee();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 2; i++) {
                        emp.createPartTimeEmployee();
                    }
                    break;
                case 3:
                    emp.printFullTimeEmployees();
                    break;
                case 4:
                    emp.printPartTimeEmployees();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 5);
    }
}
