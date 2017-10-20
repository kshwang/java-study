package java15.st2enum;

import java.util.Scanner;

public class PhoneHeadTest {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner keyb = new Scanner(System.in);
        
        System.out.print("폰번호를 입력하시오: ");
        String  pnum = keyb.next();
        String  hnum = pnum.substring(0,3);
        
        if (hnum.equals(PhoneHeadClass.P010)) {
            System.out.println("General");
        }
        else if (hnum.equals(PhoneHeadClass.P011)) {
            System.out.println("SK");
        }
        else if (hnum.equals(PhoneHeadClass.P016)) {
            System.out.println("KT");
        }
        else if (hnum.equals(PhoneHeadClass.P019)) {
            System.out.println("LG");
        }
        else {
            System.out.println("그럼 뭐?");
        }
        

        if (hnum.equals(PhoneHeadEnum.P010.getValue())) {
            System.out.println("General");
        }
        else if (hnum.equals(PhoneHeadEnum.P011.getValue())) {
            System.out.println("SK");
        }
        else if (hnum.equals(PhoneHeadEnum.P016.getValue())) {
            System.out.println("KT");
        }
        else if (hnum.equals(PhoneHeadEnum.P019.getValue())) {
            System.out.println("LG");
        }
        else {
            System.out.println("그럼 뭐?");
        }
    }
    
}
