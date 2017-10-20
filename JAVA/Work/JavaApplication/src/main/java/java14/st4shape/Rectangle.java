package java14.st4shape;

public class Rectangle extends Shape {
    
    private int width;
    private int heigth;
    
    //g,s
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeigth() {
        return heigth;
    }
    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    //toString
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", heigth=" + heigth
                + ", toString()=" + super.toString() + "]";
    }
    
    //constructor
    public Rectangle() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Rectangle()");
    }
    public Rectangle(int x, int y, String color) {
        super(x, y, color);
        // TODO Auto-generated constructor stub
        System.out.println("Rectangle(int x, int y, String color)");
    }
    public Rectangle(int width, int heigth) {
        super();
        this.width = width;
        this.heigth = heigth;
        System.out.println("Rectangle(int width, int heigth)");
    }
    public Rectangle(int x, int y, String color, int width, int heigth) {
        super(x, y, color);
        this.width = width;
        this.heigth = heigth;
        System.out.println("Rectangle(int x, int y, String color, int width, int heigth)");
    }
    
}
