
package fistprojects;
import java.util.Scanner;

public class BioData {
    
    int value_1, value_2;
    
    BioData(int x, int y)
    {
        this.value_1 = x;
        this.value_2 = y;
    }
    
    public void addition()
    {
        System.out.println(value_1+value_2);
    }
    
    public static void main(String[] args) {
        
        int num,num2;
        System.out.print("Enter number: ");
        Scanner objInput = new Scanner(System.in);
        
        num = objInput.nextInt();
        System.out.print("Enter number: ");
        num2 = objInput.nextInt();
        
        BioData obj = new BioData(num,num2);        
        System.out.print("Your given number is: ");
        obj.addition();
        
    }
    
}
