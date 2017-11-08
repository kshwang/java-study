package 황경수;

public class ex2 {
    public static void main(String[] args) {
        
        int[] arr = {23,96,35,42,81,19,8,77,50};
        
        System.out.print("정렬전: ");
        for (int i=0; i<arr.length; i=i+1) {
            System.out.print(arr[i]+" ");
        }
        
        java.util.Arrays.sort(arr);

        System.out.println();
        System.out.print("정렬후: ");
        for (int i=0; i<arr.length; i=i+1) {
            System.out.print(arr[i]+" ");
        }

    }

}