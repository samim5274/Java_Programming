
package fistprojects;

import java.util.Scanner;


public class Celcius_to_Farenheight {
    
    public static void main(String[] args) {
        
        Scanner inputobj = new Scanner(System.in);
        
        double celc,Fare;
        System.out.print("Enter C Temp: ");
        celc = inputobj.nextDouble();
        
        Fare = 1.8 * celc + 32;
        //celc = 0.55 * (Fare - 32);
        
        System.out.println("Farenheight = "+Fare);        
        
    }
    
}
