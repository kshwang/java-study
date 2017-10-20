package java16.st2interface;

public class Television implements RemoteCont, SerialComm {

    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println("Television.turnOn()");
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("Television.turnOff()");
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        System.out.println("Television.moveLeft()");
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        System.out.println("Television.moveRight()");
    }

    @Override
    public void send() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void recv() {
        // TODO Auto-generated method stub
        
    }

    
}
