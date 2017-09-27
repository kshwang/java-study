package java07;

import java.util.Scanner;

public class ex07_01_동적배열 {
    
    public static void main(String[] args) {
        int size;
        Scanner keyin = new Scanner(System.in);
        System.out.print("배열 크기를 입력하세요: ");
        size = keyin.nextInt();
                
        int[] numb = new int[size];
        
        for (int i=0; i<numb.length; i=i+1) {
            numb[i] = i;
            System.out.println("numb["+numb[i]+"]: "+i);
        }
    }
    
}
