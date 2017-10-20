package java17.st1shape;

public class Rectangle extends Shape {
    public int wight;
    public int height;

    public int getWight() {
        return wight;
    }
    public void setWight(int wight) {
        this.wight = wight;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public String toString() {
        return "Rectangle [wight=" + wight + ", height=" + height + ", color="
                + color + ", x=" + x + ", y=" + y + ", toString()="
                + super.toString() + "]";
    }
    
    public Rectangle() {
        super();
    }
    public Rectangle(int wight, int height) {
        super();
        this.wight = wight;
        this.height = height;
    }

    @Override
    public Shape getShape() {
        return null;
    };

    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    };
    
}
