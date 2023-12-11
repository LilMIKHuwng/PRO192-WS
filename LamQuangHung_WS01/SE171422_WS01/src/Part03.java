
import java.util.Scanner;


public class Part03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        
        int n = Integer.parseInt(sc.nextLine());
        
        String[] list = new String[n];
        
        for(int i=0; i<n ; i++){
            System.out.print("Input name "+(i+1)+": ");
            list[i] = sc.nextLine().toUpperCase();
        }
        
        System.out.println("The list of student names: ");
        for(String pt:list){
            System.out.println(pt);
        }
    }
}
