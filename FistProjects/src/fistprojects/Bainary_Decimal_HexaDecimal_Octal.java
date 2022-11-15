
package fistprojects;

import java.util.Scanner;


public class Bainary_Decimal_HexaDecimal_Octal {
    
    public static void main(String[] args) {
        
        Scanner inputObj = new Scanner(System.in);
        
        //decimal to bainary
        System.out.print("Enter decimal number: ");
        int x = inputObj.nextInt();
        String y = Integer.toBinaryString(x);
        System.out.println("Bainary = "+y);          
        //bainary to decimal       
        Integer dic = Integer.parseInt(y, 2);        
        System.out.println("Decimal = "+dic);
        
        //decimal to octal
        System.out.print("Enter decimal number: ");
        int x2 = inputObj.nextInt();
        String y2 = Integer.toOctalString(x2);
        System.out.println("Octal = "+y2);         
        //octal to decimal                
        Integer dic2 = Integer.parseInt(y2, 8);        
        System.out.println("Decimal = "+dic2);
        
        //decimal to hexadecimal
        System.out.print("Enter hexaDecimal: ");
        int x3 = inputObj.nextInt();
        //int x3 = 15;
        String y3 = Integer.toHexString(x3);
        System.out.println("Hexa Decimal = "+y3);
        //hexadecimal to decimal       
        Integer dic3 = Integer.parseInt(y3, 16);        
        System.out.println("Decimal = "+dic3);
        
        
                
    }
    
}
