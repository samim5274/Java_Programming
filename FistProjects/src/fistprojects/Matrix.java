
package fistprojects;

import java.util.Scanner;


public class Matrix {
    
    public static void main(String[] args) {
        
        Scanner objinput = new Scanner(System.in);
        
        
        int A [][] = new int [2][3];
        int B [][] = new int [2][3];
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = objinput.nextInt();
            }
        }
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+ A[row][col]);
            }
            System.out.println();
        }
        
    }
    
}
