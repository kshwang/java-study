package java07;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_06_유효점수 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int siz=0, scr=0, sum=0;
        Scanner scn = new Scanner(System.in);

        System.out.print("심사위원 수를 입력하세요: ");
        siz = scn.nextInt();
        int[] cnt = new int[siz];

        for (int i=0; i<cnt.length; i=i+1) {
            System.out.print("점수를 입력하세요: ");
            scr = scn.nextInt();
            cnt[i] = scr;
        }
        System.out.print("입력점수:");
        for (int i=0; i<cnt.length; i=i+1) {
            System.out.print(" "+cnt[i]);
        }
        Arrays.sort(cnt);

        System.out.println();
        System.out.print("유효점수:");
        for (int i=1; i<=3; i=i+1) {
            sum = sum + cnt[i];
            System.out.print(" "+cnt[i]);
        }
        System.out.println();
        System.out.println("합계점수: "+sum);
        System.out.format("평균점수: %.2f",(double)sum/3);
       
    }
    
}
