
package fistprojects;


class Inheritance {
    
    float salary = 4000;    
}

class Second extends Inheritance{
    float bounas = 1000;
}

class main
{
    public static void main(String[] args) {
        Second obj = new Second();
        System.out.println("Salary: "+obj.salary+"\n"+"Bounas: "+obj.bounas);
    }
}