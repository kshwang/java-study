package java12.st3car;

public class CarTest {
    
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speedUp(100); //myCar.speed == 100
        myCar.speedPrint();
        System.out.println(myCar.toString());
        System.out.println("NumberOfCars="+myCar.getNumberOfCars());
        
        Car yourCar = new Car();
        yourCar.setColor("blue");
        yourCar.setSpeed(60);
        yourCar.setGear(3);
        System.out.println(yourCar.toString());
        System.out.println("NumberOfCars="+yourCar.getNumberOfCars());

        Car otherCar = new Car("blue",60,3);
        System.out.println(otherCar.toString());
        System.out.println("NumberOfCars="+otherCar.getNumberOfCars());

        System.out.println("----------------");
        System.out.println("NumberOfCars="+myCar.getNumberOfCars());
        System.out.println("NumberOfCars="+yourCar.getNumberOfCars());
        System.out.println("NumberOfCars="+otherCar.getNumberOfCars());

        System.out.println("----------------");
        System.out.println(Car.getNumberOfCars());
        System.out.println(Car.numberOfCars);
    }
    
}
