package 황경수;

import java.util.Scanner;

import 황경수.Manager;
import java22.junit.Oper;

public class ex5 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Employee[] emp = new Employee[3];

        for (int i=0; i<emp.length; i++) {
            emp[i] = new Manager();
            System.out.print("이름: ");
            emp[i].setName(scn.next());
            System.out.print("주소: ");
            emp[i].setAddr(scn.next());
            System.out.print("급여: ");
            emp[i].setSalary(scn.nextInt());
            System.out.print("생일: ");
            emp[i].setRrn(scn.nextInt());
        }
        
        for (int i=0; i<emp.length; i++) {
            System.out.println(emp[i].toString());
        }
    }
}
