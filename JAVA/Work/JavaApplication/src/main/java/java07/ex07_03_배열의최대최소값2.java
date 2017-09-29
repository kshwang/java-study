package java07;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_03_배열의최대최소값2 {
    
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        
        Scanner keyin = new Scanner(System.in);
        for (int i=0; i<arr.length; i=i+1) {
            System.out.print("배열값을 입력하세요: ");
            arr[i] = keyin.nextInt();
        }
        
        System.out.print("정렬전: ");
        ArrPrint(arr);

        Arrays.sort(arr);

        System.out.print("정렬후: ");
        ArrPrint(arr);

        System.out.println("최대값: "+arr[arr.length-1]);
        System.out.println("최소값: "+arr[0]);
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
