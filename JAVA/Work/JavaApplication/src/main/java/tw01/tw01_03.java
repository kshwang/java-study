package tw01;

import java.util.Scanner;

public class tw01_03 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("월급을 입력하세요: ");
        int sal = scn.nextInt();
        int dep = sal * 120;
        System.out.print("10년 동안의 저축액: " + dep);
        
    }
    
}
