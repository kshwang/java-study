package java14.st4shape;

import java14.st3car.SportsCar;

public class RectangleTest {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Rectangle r1 = new Rectangle(1,1,"black",0,0);
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle(100,200);
        Rectangle r4 = new Rectangle(1,1,"black",100,200);
        
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
   }
    
}
