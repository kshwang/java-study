package java04;

import java.util.Scanner;

public class ex04_04_합계구하기swap {
    
    public static void main(String[] args) {

        int stt = 0, end = 0, sum = 0, tmp = 0;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("시작값을 입력하세요: ");
        stt = scn.nextInt();

        System.out.print("종료값을 입력하세요: ");
        end = scn.nextInt();

        if (end > stt) {
            tmp = end;
            end = stt;
            stt = end;
        }
        else {
        }
        System.out.println();
        System.out.println(stt+" 부터 "+end+"의 합계는 "+sum+"입니다");

    }
    
}
