package java12;

public class Rect {
    
    private int width;
    private int height;

    // getter/setter
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    // constructor
    public Rect() {
        super();
    }
    public Rect(int width, int height) {
        super();
        this.width  = width;
        this.height = height;
    }
    
    // toString
    @Override
    public String toString() {
        return "Rect [width=" + width + ", height=" + height + "]";
    }

    public int Area() {
        return width * height;
    }

    public int Perimeter() {
        return (width + height) * 2;
    }

    public void printVolumn() {
        double area = Area();
        double perm = Perimeter();
        System.out.println("사각형의 넓이: "+area);
        System.out.println("사각형의 둘레: "+perm);
    }
}
