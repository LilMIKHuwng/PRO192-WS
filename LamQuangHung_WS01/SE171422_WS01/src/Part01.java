
import java.util.Scanner;

public class Part01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] mang = new int[rows][columns];
        int sum=0;
        int dem=0;
        float average;
        for(int i=0; i<rows ; i++){
            for(int j=0; j<columns ; j++){
                System.out.print("mang["+i+"]["+j+"]= ");
                mang[i][j] = sc.nextInt();
                sum+=mang[i][j];
                dem+=1;
            }
        }
        average= (float)sum/dem;
        System.out.println("Matrix Inputed: ");
        for(int i=0; i<rows ; i++){
            for(int j=0; j<columns ; j++){
                System.out.print(mang[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Sum= "+sum);
        System.out.println("Average= "+average);
    }
}
