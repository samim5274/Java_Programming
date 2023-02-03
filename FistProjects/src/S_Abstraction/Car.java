
package S_Abstraction;

public class Car extends vechicle{
    
    
    @Override
    public void move()
    {
        System.out.println("Car is move oke.");
    }
    
    public static void main(String[] args) {
        
        Car c1 = new Car();
        c1.move();
        c1.carry();
    }
    
}
