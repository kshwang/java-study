package java04;

import java.util.Scanner;

public class jv04_21_무한루프 {
    
    public static void main(String[] args) {
        
        int in;
        Scanner keyin = new Scanner(System.in);

        for (int i=1; i>0; i=i+1) {
            System.out.print("정수를 입력 하세요: ");
            in = keyin.nextInt();
            
            if (in >= 0) {
                System.out.println("입력한 값은 " +in+"입니다.");
            }
            else {
                System.out.println("탈출..");
                break;
            }
        }
    }
    
}
