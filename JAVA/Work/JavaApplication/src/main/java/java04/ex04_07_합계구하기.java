package java04;

import java.util.Scanner;

public class ex04_07_합계구하기 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int si=0, ei=0, ti=0, sum=0;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("시작값을 입력하세요: ");
        si = scn.nextInt();
        System.out.print("종료값을 입력하세요: ");
        ei = scn.nextInt();

        if (si > ei) {
            ti = ei;
            ei = si;
            si = ti;
        }
        for (int i=si; i<=ei; i=i+1) {
            sum = sum + i;
        }
        System.out.println(si+"부터"+ei+"까지의 합은 "+sum+"입니다.");
        
    }
    
}
