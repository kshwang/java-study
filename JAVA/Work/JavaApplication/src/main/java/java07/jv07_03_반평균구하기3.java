package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기3 {
    
    public static void main(String[] args) {
        int size, sum=0;
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
            sum = sum + numb[i];
            System.out.print(numb[i]);
            if (i == numb.length-1) {
                System.out.println(".");
            }
            else {
                System.out.print(", ");
            }
        }
        System.out.println("배열의 합계: "+sum);
        System.out.println("배열의 평균: "+(double) sum / size);
    }
    
}
