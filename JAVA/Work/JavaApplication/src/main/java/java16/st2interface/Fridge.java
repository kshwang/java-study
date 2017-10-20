package java16.st2interface;

public class Fridge implements RemoteCont {
    
    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println("Fridge.turnOn()");
    }
    
    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("Fridge.turnOff()");
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        System.out.println("Fridge.moveLeft()");
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        System.out.println("Fridge.moveRight()");
    }
    
}
