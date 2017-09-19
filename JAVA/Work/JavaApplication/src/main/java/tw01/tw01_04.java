package tw01;

import java.util.Scanner;

public class tw01_04 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("가로값을 입력하세요: ");
        double w = scn.nextInt();
        
        System.out.print("세로값을 입력하세요: ");
        double h  = scn.nextInt();
        
        double are = w * h;
        double per = 2*(w + h);
        
        System.out.println("사각형의 넓이: " + are);
        System.out.println("사각형의 둘레: " + per);
    }
    
}
