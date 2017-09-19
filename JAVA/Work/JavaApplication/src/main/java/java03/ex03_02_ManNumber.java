package java03;

import java.util.Scanner;

public class ex03_02_ManNumber {
    
    public static void main(String[] args) {
        int k=0, x, y, z, max=0;
        char grd;
        
        Scanner scn = new Scanner(System.in);
/*
        System.out.print("정수를 입력하세요: ");
        k = scn.nextInt();
*/
        System.out.print("첫번째 정수를 입력하세요: ");
        x = scn.nextInt();
        
        System.out.print("두번째 정수를 입력하세요: ");
        y = scn.nextInt();
        
        System.out.print("세번째 정수를 입력하세요: ");
        z = scn.nextInt();
        /*
        if (k == 0) {
            grd = 'A';
        }
        else if (k > 3) {
            grd = 'B';
        }
        else {
            grd = 'C';
        }
        System.out.println();
        System.out.println(grd);
*/
/*        
        if (x > y) {
            System.out.println("x: " + x);
        }
        else if (x < y) {
            System.out.println("y: " + y);
            
        }
        else {
            System.out.println("x = y: " + x);
        }
*/
        if ((x >= y) && (x >= z)) {
            max = x;
        }
        else if ((y >= x) && (y >= z)) {
            max = y;
        }
        else {
            max = z;
        }
        System.out.println();
        System.out.println("입력 받은 수중 가장 큰수: " + max);
    }
  
}
