package java03;

import java.util.Scanner;

public class jv03_01_LargeSmall {
    
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        
        int n = keyin.nextInt();
        
        if (n >= 100) {
            System.out.println("Large");
        }
        else {
            System.out.println("Small");
        }
    }
    
}
