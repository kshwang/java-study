package java06;

import java.util.Scanner;

public class ex06_03_isNumber {
    
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        String str; 

        System.out.print("문자열을 입력 하세요: ");
        str = keyin.nextLine();
//        str = keyin.next(); //next()는 엔터키를 인식못함..
        
        
        boolean rslt = isNumber(str);
        System.out.println("리턴 결과: "+rslt);
    }
    
    public static boolean isNumber(String str) {
        int cnt=0;
        
        for (int i=1; i<=str.length(); i=i+1) {
            if (str.charAt(i)>='0' && str.charAt(i)<='9') {
                
            }
            else {
                cnt = cnt + 1;
            }

            if (cnt > 0) {
                return false;
            }

            if (str == null || str.length() == 0) {
                return false;
            }
            else {
                return true;
            }
        }
        return true;
    }
}
