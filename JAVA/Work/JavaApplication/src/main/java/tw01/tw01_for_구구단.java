package tw01;

public class tw01_for_구구단 {
    
    public static void main(String[] args) {
        
        int i = 0, j = 1, sum = 0;
        
        for (i=2; j<=9; j=j+1) {
            if (i < 9 && j == 9) {
                i = i + 1;
                j = 1;
                System.out.println("======");
            }
            sum = i * j;
            System.out.format("%d*%d=%2d \n", i,j,sum);
//            System.out.println(i+"*"+j+"="+sum);
        }
    }
}
