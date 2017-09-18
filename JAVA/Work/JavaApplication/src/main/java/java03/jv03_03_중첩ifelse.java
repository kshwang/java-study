package java03;

import java.util.Scanner;

public class jv03_03_중첩ifelse {
    
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        
        int sco = keyin.nextInt();
        
        if (sco >= 90) {
            System.out.println("점수: "+ sco);
            System.out.println("학점: A");
        }
        else if (sco >= 80) {
            System.out.println("점수: "+ sco);
            System.out.println("학점: B");
        }
        else if (sco >= 70) {
            System.out.println("점수: "+ sco);
            System.out.println("학점: C");
        }
        else if (sco >= 60) {
            System.out.println("점수: "+ sco);
            System.out.println("학점: D");
        }
        else {
            System.out.println("점수: "+ sco);
            System.out.println("학점: F");
        }
    }
    
}
