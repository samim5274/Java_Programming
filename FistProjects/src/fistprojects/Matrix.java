
package fistprojects;

import java.util.Scanner;


public class Matrix {
    
    public static void main(String[] args) {
        
        Scanner objinput = new Scanner(System.in);
        
        
        int A [][] = new int [2][3];
        int B [][] = new int [2][3];
        int C [][] = new int [2][3];
        
        
        System.out.println("Enter A matrix value. ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf(" A [%d][%d]=",row,col);
                A[row][col] = objinput.nextInt();
            }
        }
        
        System.out.println("Enter B matrix value. ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf(" B [%d][%d]=",row,col);
                B[row][col] = objinput.nextInt();
            }
        }
        
        System.out.println("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+ A[row][col]);
            }
            System.out.println();
        }       
        System.out.println();
        
        System.out.println("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+ B[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("A+B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col] = (A[row][col]+ B[row][col]);
                System.out.print("\t "+C[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        
    }
    
}
