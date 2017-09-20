package java04;

public class ex04_14_실습예제 {
    
    public static void main(String[] args) {
        
        int i = 0, j = 1, sum = 0;
        
        for (i=2; j<=9; j=j+1) {
            sum = i * j;
            
            if (j == 9) {
                System.out.print(i+"*"+j+"="+sum+".");

            }
            else {
                System.out.print(i+"*"+j+"="+sum+",");
                
            }
        }

    }
    
}
