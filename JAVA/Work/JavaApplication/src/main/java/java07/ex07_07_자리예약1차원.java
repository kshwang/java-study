package java07;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_07_자리예약1차원 {
    
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        int rsno, sum = 0;
        
        // 초기값(0) Set
        for (int i=0; i<10; i=i+1) {
            arr[i] = 0;
        }
        
        for (int i=0; 1>0; i=i+1) {
            ArrPrint(arr);
            
            Scanner keyin = new Scanner(System.in);
            System.out.println();
            System.out.print("예약할 좌석을 입력하세요(종료:-1): ");
            rsno = keyin.nextInt();
            if (rsno== -1) {
                System.out.println("예약을 종료합니다.");
                break;
            }
            if (arr[rsno-1] == 0) {
                arr[rsno-1] = 1;
                System.out.println("예약 처리 되었습니다.");
            }
            else {
                System.out.println("이미 예약된 좌석입니다.");
            }
        }
    }

    private static void ArrPrint(int[] arr) {
        // TODO Auto-generated method stub
        System.out.print("좌석: ");
        // 좌석번호 출력
        for (int i=1; i<=10; i=i+1) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.print("예약: ");
        // 예약여부 출력
        for (int i=0; i<10; i=i+1) {
            System.out.print(arr[i]+" ");
        }
      
    }
    
}
