package java13.st4emp;

import java.util.Scanner;

public class EmpTest2 {
    
    public static void main(String[] args) {
        //int[] arr = new int[3]
        Emp[] arr = new Emp[3];
        Scanner scan = new Scanner(System.in);
        
        for (int i=0; i<3; i=i+1) {
            System.out.print("이름을 입력하시오: ");
            String name = scan.next();
            System.out.print("주소를 입력하시오: ");
            String addr = scan.next();
            System.out.print("급여를 입력하시오: ");
            int    saly = scan.nextInt();
            System.out.print("생년월일(yyyymmdd)을 입력하시오: ");
            int    bday = scan.nextInt();
            
            Emp emp1 = new Emp(name,addr,saly,bday);
            
            //직원의 인스턴스를 배열에 저장
            arr[i] = emp1;
            //emp1의 모든 필드값 출력
            System.out.println(emp1.toString());
            
        }
        System.out.println("------------------------");
//        for (int i=0; i<arr.length; i=i+1) {
        //foreach문 이용하여 출력
        for (Emp e : arr) {
            System.out.println(e.toString());
        }
        System.out.println("---------- 끝 ----------");
        
    }
    
}
