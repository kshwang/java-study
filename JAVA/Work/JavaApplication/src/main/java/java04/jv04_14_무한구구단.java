package java04;

import java.util.Scanner;

public class jv04_14_무한구구단 {

    public static void main(String[] args) {
        int s, e, r, t;
        Scanner scn = new Scanner(System.in);
        
        for (int k=1; 1>0; k=k+1) {
            System.out.print("시작 단수를 입력하세요: ");
            s = scn.nextInt();
            
            System.out.print("종료 단수를 입력하세요: ");
            e = scn.nextInt();
            
            if (s > e) {
                t = s;
                s = e;
                e = t;
            }

            if (s == 0 || e == 0) {
                System.out.println("탈출..");
                break;
            }
            
            for (int i=s; i<=e; i=i+1) {
                for (int j=1; j<=9; j=j+1) {
                    r = i * j;
                    System.out.format("%d*%d=%2d \n", i,j,r);
                }
            System.out.println();
            }
        }
    }
}
