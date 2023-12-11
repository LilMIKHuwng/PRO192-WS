import java.util.Scanner;

public class Part02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number 1: ");
        float a= sc.nextFloat();
        System.out.print("Input the number 2: ");
        float b= sc.nextFloat();

        System.out.print("Input the operator: ");
        Scanner scString = new Scanner(System.in);
        String pheptinh = scString.nextLine();
        switch (pheptinh){
            case "+":
                System.out.println("the result of "+a+pheptinh+b+" = "+(a+b));
                break;
            case "-":
                System.out.println("the result of "+a+pheptinh+b+" = "+(a-b));
                break;
            case "*":
                System.out.println("the result of "+a+pheptinh+b+" = "+(a*b));
                break;
            case "/":
                if (b==0) 
                    System.out.println("Could not be allow shared because the number 2 is 0");
                else 
                    System.out.println("the result of "+a+pheptinh+b+" = "+(a/b));
                break;
            default:
                System.out.println("Invalid calculation");
                break;
        }
    }
}
