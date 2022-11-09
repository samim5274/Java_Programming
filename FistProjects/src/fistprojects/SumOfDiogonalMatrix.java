
package fistprojects;

import java.util.Scanner;


public class SumOfDiogonalMatrix {
    
    
    public static void main(String[] args) {
        
        Scanner objinput = new Scanner(System.in);
        
        int A [][] = new int [3][3];
        int SDE = 0;
        int UDE = 0;
        int LDE = 0;
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {                
                A [row][col] = objinput.nextInt();
            }
        }
                    
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                
                if (row == col)
                {
                    SDE = SDE + A[row][col];                    
                }
                
                if (row < col)
                {
                    UDE = UDE + A[row][col];                    
                }
                if (row > col)
                {
                    LDE = LDE + A[row][col];                    
                }
                
            }
        }
        
        System.out.println(" "+SDE);
        System.out.println(" "+UDE);
        System.out.println(" "+LDE);
    }
    
    
}
