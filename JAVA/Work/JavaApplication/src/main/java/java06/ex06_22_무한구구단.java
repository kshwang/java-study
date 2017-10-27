package java06;

import java.util.Scanner;

public class ex06_22_무한구구단 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int si=0, ei=0, ti=0, ri=0, sum;
        Scanner scn = new Scanner(System.in);
        
        for (; true;) {
            System.out.print("시작단을 입력하세요: ");
            si = scn.nextInt();
            System.out.print("종료단을 입력하세요: ");
            ei = scn.nextInt();

            if (si == 0 || ei == 0) {
                System.out.println("구구단 끝..");
                break;
            }
            if (si > ei) {
                ti = ei;
                ei = si;
                si = ti;
            }
            sum = isum(si, ei);

        }
    }
    
    public static int isum(int s, int e) {
        int sum=0;
        for (int i=s; i<=e; i=i+1) {
            for (int j=1; j<=9; j=j+1) {
                sum = i * j;
                System.out.format("%d * %d = %2d \n", i,j,sum);
            }
            System.out.println("----------");
        }

        return sum;
        
    }
    
}
