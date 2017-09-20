package java04;

public class ex04_15_for실습예제 {
    
    public static void main(String[] args) {
        
        int i = 0, j = 9, sum = 0;
        
        for (i=2; j>=1; j=j-1) {
            sum = i * j;
            System.out.println(i+" * "+j+" = "+sum);
        }
    }
    
}
