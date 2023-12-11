
package ProductManagement;

import java.util.Scanner;

public class UsingProduct {
    public static void main(String[] args) {
        ListProduct product = new ListProduct();
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("Product Management Program");
            System.out.println("1. Add a new student ");
            System.out.println("2. Print a list of products ");
            System.out.println("3. Print a list of Smartphones in descending ");
            System.out.println("4. Print a list of Tivis in ascending ");
            System.out.println("5. Print a list of Air-conditioners  in descending ");
            System.out.println("6. Print highest price of each products ");
            System.out.println("7. Update the product ");
            System.out.println("8. Delete the product ");
            System.out.println("9. Print the total amount of all products ");
            System.out.println("10. Exit");
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
                    product.addProduct();
                    break;
                case 2:
                    product.printList();
                    break;
                case 3:
                    product.printSPdes();
                    break;
                case 4:
                    product.printTVasc();
                    break;
                case 5:
                    product.printACdes();
                    break;
                case 6:
                    product.printHighestUnitPrice();
                    break;
                case 7:
                    product.update();
                    break;
                case 8:
                    product.delete();
                    break;
                case 9:
                    product.printTotal();
                    break;
                case 10:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 10);
        
    }
}
