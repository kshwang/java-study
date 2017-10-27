package java07;

import java.util.Scanner;

public class ex07_03_반평균구하기 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int siz=0, scr=0, sum=0;
        Scanner scn = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        siz = scn.nextInt();
        int[] cnt = new int[siz];
        
        for (int i=0; i<cnt.length; i=i+1) {
            System.out.print("성적을 입력하세요: ");
            scr = scn.nextInt();
            sum = sum + scr;
            cnt[i] = scr;
        }
        System.out.println("합계: "+sum);
        System.out.println("평균: "+(double)sum/siz);
    }
    
}
