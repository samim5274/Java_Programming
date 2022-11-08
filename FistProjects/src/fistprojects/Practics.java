
package fistprojects;

import java.util.Scanner;


public class Practics {
    
    public static void main(String[] args) {
        
        Scanner objinput = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int n = objinput.nextInt();
        
        int first = 0;
        int second = 1;
        int fibo;
        
        System.out.print(first+" "+second);
        
        for (int i = 3; i <=n; i++) {
            
            fibo = first + second;
            System.out.print(" "+fibo+" ");
            first = second;
            second = fibo;
            
        }
        
    }
    
}
