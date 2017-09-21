package tw01;

public class tw01_for_구구단가로 {
    
    public static void main(String[] args) {
        
        int i, j=1, sum, cnt=2;
        
        for (i=cnt; i<=9; i=i+1) {
            sum = i * j;
            System.out.print(i+"*"+j+"="+sum+"  ");
            if (i == 9) {
                System.out.println();
                j = j + 1;
                i = 2;
                cnt = cnt + 1;
            }
        }
    }
}
