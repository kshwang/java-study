package java12.st3car;

public class Car {
    
    // 필드
    private String color = "빨강";
    private int    speed = 100;
    private int    gear  = 4;
    private int    carid = 0;

    // static필드
    public static int numberOfCars = 0;
    
    // 동작:메서드
    public void speedUp(int s) {
        speed = speed + s;
    }

    public void speedDn(int s) {
        speed = speed - s;
    }

    public void speedPrint() {
        System.out.println("속도"+speed+"km");
    }

    // getter & setter:메서드
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    // constructor(생성자)
    public Car() {
        super();
        carid = ++numberOfCars; //첫번째 id = 1
    }

    public Car(String color, int speed, int gear) {
        super();
        this.color = color;
        this.speed = speed;
        this.gear  = gear;
        carid = ++numberOfCars; //첫번째 id = 1
    }

    // toString()
    @Override
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear
                + ", carid=" + carid + "]";
    }
   
}
