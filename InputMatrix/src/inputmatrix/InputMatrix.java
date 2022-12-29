package inputmatrix;

import java.util.Scanner;
        
public class InputMatrix {

    public static void main(String[] args) {   
        System.out.println("Input matrix Program!!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Please enter number of column: ");
        int column = sc.nextInt();
        double Matrix[][] = new double [rows + 1][column + 1];
        for (int i = 1; i <= rows; i++){
            for (int j =1; j <= column; j++){
                System.out.print("Matrix [" +i+ "]" + "[" +j+ "] = ");
                Matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.println("");
        System.out.println("Your Matrix is:");
        for (int i = 1; i <= rows; i++){
            for (int j =1; j <= column; j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println("");
        }    
    }
}
