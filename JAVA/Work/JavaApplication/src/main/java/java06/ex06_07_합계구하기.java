package java06;

import java.util.Scanner;

public class ex06_07_합계구하기 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int si=0, ei=0, sum=0;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("시작값을 입력하세요: ");
        si = scn.nextInt();
        System.out.print("종료값을 입력하세요: ");
        ei = scn.nextInt();

        sum = isum(si, ei);
    }
    
    public static int isum(int s, int e) {
        int sum=0;
        for (int i=s; i<=e; i=i+1) {
            sum = sum + i;
        }
        System.out.println(s+"부터"+e+"까지의 합은 "+sum+"입니다.");
        return sum;
        
    }
    
}
