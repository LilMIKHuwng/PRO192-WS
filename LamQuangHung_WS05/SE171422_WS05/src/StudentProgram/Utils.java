package StudentProgram;

import java.util.Scanner;

public class Utils {

    public static String getString(String welcome, String msg) {
        boolean check = true;
        String result = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(welcome);
            result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println(msg);
            } else {
                check = false;
            }
        } while (check);
        return result;
    }

    public static String getStringreg(String welcome,
            String pattern, String msg, String msgreg) {
        boolean check = true;
        String result = "";
        Scanner sc = new Scanner(System.in);
        do {

            System.out.print(welcome);
            result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println(msg);
            } else if (!result.matches(pattern)) {
                System.out.println(msgreg);
            } else {
                check = false;
            }
        } while (check);
        return result;
    }
    
    public static double getDouble(String welcome, int min, int max) {
        boolean check = true;
        double number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                
                System.out.print(welcome);
                number = Double.parseDouble(sc.nextLine());
                 if(number < min || number > max){
                    System.out.println("Mark must be large than " + min +
                            " and Mark must be lower than " + max);
                }
                else{
                    check = false;
                }
               
            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check);
        return number;
    }
}
