package java07;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_05_유효점수 {
    
    public static void main(String[] args) {
        
        int[] arr = new int[5];
        int sum = 0;
        
        Scanner keyin = new Scanner(System.in);
        for (int i=0; i<arr.length; i=i+1) {
            System.out.print("점수를 입력하세요: ");
            arr[i] = keyin.nextInt();
        }
        
        System.out.print("입력 점수: ");
        ArrPrint(arr);

        Arrays.sort(arr);
        
        System.out.print("유효점수: ");
        for (int i=1; i<=3; i=i+1) {
            sum = sum + arr[i];
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        System.out.println("합계: "+sum);
        System.out.printf("평균: %.2f",(double)sum/3);
    }

    private static void ArrPrint(int[] arr) {
        // TODO Auto-generated method stub
        for (int i=0; i<arr.length; i=i+1) {
            System.out.print(arr[i]);
            if (i == arr.length-1) {
                System.out.println(".");
            }    
            else {
                System.out.print(", ");
            }
        }
    }
    
}
