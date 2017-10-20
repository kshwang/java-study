package java17.st1shape;

public class Circle extends Shape {
    public int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + ", x=" + x
                + ", y=" + y + ", toString()=" + super.toString() + "]";
    }

    public Circle() {
        super();
    }
    public Circle(int radius) {
        super();
        this.radius = radius;
    }
    
    @Override
    public Shape getShape() {
        return null;
    };

    @Override
    public void draw() {
        System.out.println("Circle draw");
    };
    
}
