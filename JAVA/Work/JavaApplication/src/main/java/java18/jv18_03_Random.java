package java18;

import java.util.Random;
import java.util.Scanner;

public class jv18_03_Random {
    
    public static void main(String[] args) {
        
        // 난수(임의의 수) 만들기
        // new Random(), .nextDouble()은 0~1사이의 실수값
        Random rd  = new Random();
        double db1 = rd.nextDouble();
        System.out.println("----- 0~1사이의 실수 -------");
        System.out.println(db1);
        
        // 난수를 이용하여 0~2사이의 실수값 만들기
        double db2 = rd.nextDouble() * 2;
        System.out.println("----- 0~2사이의 실수 -------");
        System.out.println(db2);
        
        //문제1. 난수를 이용하여 1부터 3사이의 실수값 만들기
        double db3 = rd.nextDouble() * 3;
        System.out.println("----- 1~3사이의 실수 -------");
        System.out.println(db3);
        
        //문제2. 0이상 10미만의 난수(실수값) 5개 생성 및 출력
        double[] db5 = new double[5];
        int i=0;
        
        System.out.println("---- 0~9사이의 실수 5개 ----");
        for (i=0; i<5; i=i+1) {
            db5[i] = rd.nextDouble() * 9;
            System.out.println(db5[i]);
        }
        
        //문제3. 사용자로 부터 최대 정수 A와 최소 정수 b를 입력받고,
        //       A와 B사이의 난수 10개를 생성 및 출력 
        int[] i10 = new int[10];
        int max=0, min=0, j=0;
        
        Scanner scn = new Scanner(System.in);
        System.out.print("최대정수를 입력하시오: ");
        max = scn.nextInt();

        System.out.print("최소정수를 입력하시오: ");
        min = scn.nextInt();
     
        System.out.println("-- "+max+"~"+min+"사이의 정수10개 --");
        for (j=0; j<10; j=j+1) {
            i10[j] = rd.nextInt(max-min)+min;
            System.out.println(i10[j]);
        }
    }
    
}
