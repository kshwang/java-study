package java03;

import java.util.Scanner;

public class jv03_01_if {
    
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        
        int sco = keyin.nextInt();
        
        System.out.println();
        
        if ( sco >= 60 ) {
            System.out.println("합격입니다.");
            System.out.println("장학금도 받을 수 있습니다.");
        }
        else {
            System.out.println("불합격입니다.");
            System.out.println("장학금을 받을 수 없습니다.");
        }
            
    }
    
}
