package java16.st2interface;

public class RemoteContTest {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        RemoteCont t1 = new Television();
        t1.turnOn();
        t1.turnOff();
        
        Fridge f1 = new Fridge();
        f1.turnOn();
        f1.turnOff();

        RemoteCont obj = new Television();
        obj.turnOn();
        obj.turnOff();
        
        obj = new Fridge();
        obj.turnOn();
        obj.turnOff();
    }
    
}
