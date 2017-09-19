package tw01;

import java.util.Scanner;

public class tw01_02 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int i = scn.nextInt();
        System.out.println(i);
        
        System.out.println();
        System.out.print("문자를 입력하세요: ");
        String s = scn.next();
        System.out.println(s);
        
    }
    
}
