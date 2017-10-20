package java14.st2hasa;

public class ClrcleTest {
    
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(10);
        Point center = new Point();
        center.setX(25);
        center.setY(78);
        
        c1.setCenter(center);
        
        Circle c2 = new Circle();
        c2.setRadius(10);
        center = new Point(25,78);

        Circle c3 = new Circle(10,new Point(25,78));
        
        //c1,c2 c3 출력
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
    
}
