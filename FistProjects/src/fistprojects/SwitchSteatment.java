
package fistprojects;

import java.util.Scanner;


public class SwitchSteatment {
    
    public static void main(String[] args) {
        
        Scanner objinput = new Scanner(System.in);
        
        int m,n,count=0,total=0;
        
        System.out.print("Enter first number: ");
        m = objinput.nextInt();
        System.out.print("Enter second number: ");
        n = objinput.nextInt();
        
        
        for (int i = m; i <=n; i++) 
        {
            for (int j = 2; j <= i-1; j--) 
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }  
                System.out.println(i);
                total++;
            }        
            
        }
        
        System.out.println("Total Prime: "+total);
    }
    
}
