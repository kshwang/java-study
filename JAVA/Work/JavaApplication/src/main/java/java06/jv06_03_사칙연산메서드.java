package java06;

import java.util.Scanner;

public class jv06_03_사칙연산메서드 {
    
    public static void main(String[] args ) {
        
        Scanner keyin = new Scanner(System.in);
        System.out.print("천번째 정수를 입력하세요: ");
        int x = keyin.nextInt();
        
        System.out.print("두번째 정수를 입력하세요: ");
        int y = keyin.nextInt();

        int add    = Add(x, y);
        int minus  = Minus(x, y);
        int mul    = Mul(x, y);
        double div = Div(x, y);
        System.out.println("add: "+add);
        System.out.println("minus: "+minus);
        System.out.println("mul: "+mul);
        System.out.println("div: "+div);
    }

    private static int Add(int x, int y) {
        // TODO Auto-generated method stub
        int sum = x + y;
        return sum;
    }
    
    private static int Minus(int x, int y) {
        // TODO Auto-generated method stub
        int sum = x - y;
        return sum;
    }
    
    private static int Mul(int x, int y) {
        // TODO Auto-generated method stub
        int sum = x * y;
        return sum;
    }

    private static int Div(int x, int y) {
        // TODO Auto-generated method stub
        double sum = (double)x / (double)y;
        System.out.println("div-sum: "+sum);
        return 0;
    }

}
