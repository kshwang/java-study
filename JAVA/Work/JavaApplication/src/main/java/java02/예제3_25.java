package java02;

import java.util.Scanner;

public class 예제3_25 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        char chr = ' ';
        System.out.println("문자를 하나 입력하세요");
        
        String input = scn.nextLine();
        chr = input.charAt(0);
        
        if('0' <= chr && chr <= '9') {
            System.out.println("입력하신 문자는 숫자 입니다.");
        }
        
        if(('a' <= chr && chr <= 'z') || ('A' <= chr && chr <= 'Z')) {
            System.out.println("입력하신 문자는 영문자 입니다.");
        }
    }
    
}
