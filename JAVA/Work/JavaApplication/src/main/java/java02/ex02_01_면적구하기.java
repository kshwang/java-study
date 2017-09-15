package java02;

import java.util.Scanner;

public class ex02_01_면적구하기 {
    
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);

        System.out.print("가로값을 입력하세요: ");
        int w = keyin.nextInt();
        
        System.out.print("세로값을 입력하세요: ");
        int h = keyin.nextInt();

        double are = w * h;
        double per = 2*(w+h);
        
        System.out.println(w);
        System.out.println(h);
        
        System.out.print("사각형의 넓이: ");
        System.out.println(are);
        System.out.print("사각형의 둘레: ");
        System.out.println(per);
    }
    
}
