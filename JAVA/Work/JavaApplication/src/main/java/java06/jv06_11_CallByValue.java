package java06;

public class jv06_11_CallByValue {
    
    public static void main(String[] arg) {
        int a=5, b=3;
        
        System.out.println("swap전: a="+a+", b="+b);
        Swap(a,b);
        System.out.println("swap후: a="+a+", b="+b);
    }

    private static void Swap(int a, int b) {
        // TODO Auto-generated method stub
        int temp = b;
        b = a;
        a = temp;
        System.out.println("swap내: a="+a+", b="+b);
    }
    
}
