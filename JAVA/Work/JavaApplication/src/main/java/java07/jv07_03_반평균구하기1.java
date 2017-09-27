package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기1 {
    
    public static void main(String[] args) {
        int size, sum;
        Scanner keyin = new Scanner(System.in);
        System.out.print("배열 크기를 입력하세요: ");
        size = keyin.nextInt();
                
        int[] numb = new int[size];
        
        for (int i=0; i<numb.length; i=i+1) {
            System.out.print("성적을 입력하세요: ");
            numb[i] = keyin.nextInt();
        }
        
        System.out.print("배열의 값은: ");
        for (int i=0; i<numb.length; i=i+1) {
            System.out.print(numb[i]);
            if (i == numb.length-1) {
                System.out.print(".");
            }
            else {
                System.out.print(", ");
            }
        }
    }
    
}
