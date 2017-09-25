package java06;

import java.util.Scanner;

public class ex06_03_isNumber {
    
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        String str; 

        System.out.print("문자열을 입력 하세요: ");
        str = keyin.next();
        
        boolean rslt = isNumber(str);
        System.out.println("리턴 결과: "+rslt);
    }
    
    public static boolean isNumber(String str) {
        if (str != null && str.equals("")) {
            return true;
        }
        else {
            return false;
        }
        
    }
}
