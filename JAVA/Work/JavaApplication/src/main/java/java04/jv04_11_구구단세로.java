package java04;

public class jv04_11_구구단세로 {
    
    public static void main(String[] args) {
        int r;

        for (int i=2; i<=19; i=i+1) {
            for (int j=1; j<=9; j=j+1) {
                r = i * j;
                System.out.println(i+"*"+j+"="+r);
            }
        }
    }
}
