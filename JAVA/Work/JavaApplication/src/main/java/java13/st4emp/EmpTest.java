package java13.st4emp;

import java.util.Scanner;

public class EmpTest {
    
    public static void main(String[] args) {
        String[] name = new String[3];
        String[] addr = new String[3];
        int[]    saly = new int[3];
        int[]    bday = new int[3];

        Scanner scan = new Scanner(System.in);
        for (int i=0; i<3; i=i+1) {
            System.out.print("이름을 입력하시오: ");
            name[i] = scan.next();
            System.out.println();
            System.out.print("주소를 입력하시오: ");
            addr[i] = scan.next();
            System.out.println();
            System.out.print("급여를 입력하시오: ");
            saly[i] = scan.nextInt();
            System.out.println();
            System.out.print("생년월일(yyyymmdd)을 입력하시오: ");
            bday[i] = scan.nextInt();
        }
        
    }
    
}
