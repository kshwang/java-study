package java04;

public class ex04_13_for실습 {
    
    public static void main(String[] args) {
        
        int i = 0, j = 1, sum = 0;
        
        for (i=2; j<=9; j=j+1) {
            sum = i * j;
            System.out.println(i+" * "+j+" = "+sum);
        }
    }
    
}
