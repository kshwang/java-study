package java04;

public class jv04_12_구구단가로 {
    
    public static void main(String[] args) {
        int r;

        for (int i=2; i<=19; i=i+1) {
            for (int j=1; j<=9; j=j+1) {
                r = i * j;
                System.out.format("%2d*%d=%3d ",i,j,r);
            }
        System.out.println();
        }
    }
}
