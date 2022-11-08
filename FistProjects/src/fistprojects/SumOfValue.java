
package fistprojects;

import java.util.Scanner;


public class SumOfValue {
    
    public static void main(String[] args) {
        
        
        Scanner objinput = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = objinput.nextInt();
        
        for (int row = num; row >= 1; row--) {
            
            for (int col = 1; col <=row; col++) {
                System.out.print(""+col);
            }
            System.out.println();
        }
                     
        
        
    }
    
}
