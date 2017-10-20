package java14.st2hasa;

public class Point {
    
    private static Object java;
    private int x, y;
    
    
    public static Object getJava() {
        return java;
    }
    public static void setJava(Object java) {
        Point.java = java;
    }
   public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public Point() {
        super();
    }
    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

//    public Circle
    
}
