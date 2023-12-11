
package StudentProgram;

import java.util.Scanner;

public class UsingStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListStudent stu = new ListStudent();

        int choice = 0;
        do {
            System.out.println("Student Management Program");
            System.out.println("1. Add new student ");
            System.out.println("2. Search a student ");
            System.out.println("3. Update a student ");
            System.out.println("4. Remove a student ");
            System.out.println("5. List all students");
            System.out.println("6. Exit");
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
                    for (int i = 0; i < 5; i++) {
                        stu.createStudent();
                    }
                    break;
                case 2:
                    stu.searchStudent();
                    break;
                case 3:
                    stu.updateStudent();
                    break;
                case 4:
                    stu.removeStudent();
                    break;
                case 5:
                    stu.listAllStudent();
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 6);
    }
}
