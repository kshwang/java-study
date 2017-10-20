package java14.st11pattern;

public class Rectangle extends Shape {
    
    private int widht;
    private int height;

    public int getWidht() {
        return widht;
    }
    public void setWidht(int widht) {
        this.widht = widht;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle [widht=" + widht + ", height=" + height + ", color="
                + color + ", pt=" + pt + ", toString()=" + super.toString()
                + "]";
    }

    public Rectangle() {
        super();
    }
    public Rectangle(int widht, int height) {
        super();
        this.widht = widht;
        this.height = height;
    }

}
