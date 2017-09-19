package java04;

import java.util.Scanner;

public class ex04_04_합계구하기 {
    
    public static void main(String[] args) {

        int stt = 0, end = 0;
        int sum = 0;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("시작값을 입력하세요: ");
        stt = scn.nextInt();

        System.out.print("종료값을 입력하세요: ");
        end = scn.nextInt();

//        for (int i=stt; i<=end; i=i+1) {
//          sum = sum + i;
//        }

        if (end > stt) {
            for (int i=stt; i<=end; i=i+1) {
                sum = sum + i;
            }
        }
        else {
            for (int i=end; i<=stt; i=i+1) {
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println(stt+" 부터 "+end+"의 합계는 "+sum+"입니다");

    }
    
}
