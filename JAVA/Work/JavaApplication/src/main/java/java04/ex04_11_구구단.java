package java04;

import java.util.Scanner;

public class ex04_11_구구단 {
    
    public static void main(String[] args) {
        int s, e, r;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("시작 단수를 입력하세요: ");
        s = scn.nextInt();
        
        System.out.print("종료 단수를 입력하세요: ");
        e = scn.nextInt();
        
        if (e > s) {
            for (int i=s; i<=e; i=i+1) {
                for (int j=1; j<=9; j=j+1) {
                    r = i * j;
                    System.out.format("%2d*%d=%3d ",i,j,r);
                }
            System.out.println();
            }
        }
        else {
            
            for (int i=e; i<=s; i=i+1) {
                for (int j=1; j<=9; j=j+1) {
                    r = i * j;
                    System.out.format("%2d*%d=%3d ",i,j,r);
                }
            System.out.println();
            }
        }
  
    }
    
}
