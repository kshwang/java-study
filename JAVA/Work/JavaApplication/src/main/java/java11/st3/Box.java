package java11.st3;

public class Box {
    
    // 데이터, 필드, 멤버변수
    private int width;
    private int length;
    private int height;
    
    // getter,setter 생성
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    // constructor(생성자) 생성
    public Box() {
        super();
    }
    public Box(int width, int length, int height) {
        super();
        this.width  = width;
        this.length = length;
        this.height = height;
    }
    
    // toString() 생성
    @Override
    public String toString() {
        return "Box [width=" + width + ", length=" + length + ", height="
                + height + "]";
    }
 
    public int getVolumn() {
        return width * length * height;
    }
    
    public void printVolumn() {
        int volumn = getVolumn();
        System.out.println(volumn);
        
    }
    
}
