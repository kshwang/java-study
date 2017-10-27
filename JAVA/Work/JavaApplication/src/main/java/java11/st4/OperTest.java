package java11.st4;

import java.util.Scanner;

public class OperTest {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.print("천번째 정수를 입력하세요: ");
        int x = scn.nextInt();
        
        System.out.print("두번째 정수를 입력하세요: ");
        int y = scn.nextInt();
        Oper op = new Oper();

        int add    = op.Add(x, y);
        int minus  = op.Minus(x, y);
        int mul    = op.Mul(x, y);
        double div = op.Div(x, y);
        System.out.println("add: "+add);
        System.out.println("minus: "+minus);
        System.out.println("mul: "+mul);
        System.out.println("div: "+div);
        
    }
    
}
