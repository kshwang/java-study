package java06;

public class ex06_02_add {
    
    public static void main(String[] args) {
        int a=1, b=2, rslt;
        
        rslt = add(a,b);
        System.out.println("반환값: "+rslt);
        
    }

    public static int add(int a, int b){
        int sum;
        sum = a + b;
        return sum;
    }
    
}
