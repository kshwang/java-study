package 황경수;

import java.util.Scanner;

import java22.junit.Oper;

public class ex4 {

    public static void main(String[] args) {
        
        int si=0, ei=0;
        Scanner scn = new Scanner(System.in);

        System.out.print("First num: ");
        si = scn.nextInt();
        System.out.print("Second num: ");
        ei = scn.nextInt();

        Oper op = new Oper(si, ei);        

        System.out.println();
        System.out.println("Add : "+op.add());
        System.out.println("Minus: "+op.minus());
        System.out.println("Mul: "+op.mul());
        System.out.format("Div: %.6f",op.div());
        
    }

}
