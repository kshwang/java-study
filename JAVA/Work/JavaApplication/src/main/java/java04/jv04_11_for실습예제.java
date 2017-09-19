package java04;

public class jv04_11_for실습예제 {
    
    public static void main(String[] args) {
/*        
        for (int i=4; i<=9; i=i+1) {
            System.out.println(i);
        }
*/        
        int j = 0, sum = 0;

        for (j=1; j<=10; j=j+1) {
            sum = sum + j;
            System.out.println("1부터 "+j+"까지의 합: "+ sum);
        }
    }
    
}
