package java11.st3;

public class BoxTest {
    
    public static void main(String[] args) {

        Box tBox = new Box(100,100,100);
        
        tBox.setWidth(100);
        tBox.setLength(100);
        tBox.setHeight(100);

        System.out.println(tBox.toString());
        tBox.printVolumn();
    }
    
}
