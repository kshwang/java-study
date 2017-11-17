package 황경수;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        int stt = 0, end = 0, sum = 0, tmp = 0;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("시작값을 입력하세요: ");
        stt = scn.nextInt();

        System.out.print("종료값을 입력하세요: ");
        end = scn.nextInt();

        if (stt > end) {
            tmp = stt;
            stt = end;
            end = tmp;
        }
        for (int i=stt; i<=end; i=i+1) {
            if (i < end) {
                System.out.print(i+" + ");
            } else {
                System.out.print(i+" = ");
                
            }
            sum = sum + i;
        }
        System.out.print(sum);

    }
}
