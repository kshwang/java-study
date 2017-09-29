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
        int  cnt=0;
        char chr;
        
        if (str == null || str.length() == 0) {
            return false;
        }
        
        for (int i=0; i<str.length(); i=i+1) {
            chr = str.charAt(i);
            if (chr>='0' && chr<='9') {
                cnt = cnt + 1;
            }
            else {
                return false;
            }
        }
        
        if (cnt == str.length()) {
            return true;
        }
        else {
            return false;
        }
    }
}
