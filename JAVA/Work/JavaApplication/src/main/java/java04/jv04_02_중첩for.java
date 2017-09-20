package java04;

public class jv04_02_중첩for {
    
    public static void main(String[] args) {
        
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("==========");

        int i, j, sum;
        
        for (i =1; i<=5; i=i+1) {
            System.out.println("**********");
            
        }
        System.out.println("==========");

        for (i =1; i<=5; i=i+1) {
            for (j =1; j<=10; j=j+1) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
    
}
