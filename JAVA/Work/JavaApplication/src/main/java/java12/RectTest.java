package java12;

import java.util.Scanner;

public class RectTest {
    
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);

        System.out.print("가로값을 입력하세요: ");
        int w = keyin.nextInt();
        System.out.print("세로값을 입력하세요: ");
        int h = keyin.nextInt();
        
        Rect tRect = new Rect(w,h);
        tRect.printVolumn();
        
    }
}
