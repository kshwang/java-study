package java08;

import java.util.Scanner;

public class ex08_04_문자열비교 {
    
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        System.out.print("Please input first string: ");
        String s1 = keyin.next();
        System.out.print("Please input second string: ");
        String s2 = keyin.next();
        
        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2): same");
            
        }
        else {
            System.out.println("s1.equals(s2): not same");
        }
        
        if (s1==s2) {
            System.out.println("s1==s2: same");
            
        }
        else {
            System.out.println("s1==s2: not same");
        }
    }

}
