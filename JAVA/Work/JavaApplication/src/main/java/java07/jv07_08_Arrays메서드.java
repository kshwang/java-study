package java07;

public class jv07_08_Arrays메서드 {
    
    public static void main(String[] args) {
        int size = 6;
        int[] arr = new int[size];
        
        for (int i=0; i<arr.length; i=i+1) {
            arr[i] = arr.length-i;
        }
        printArray(arr);
        
        java.util.Arrays.sort(arr);
        printArray(arr);

        int val = java.util.Arrays.binarySearch(arr,4);
        System.out.println("4값의 배열 위치: "+val);
        
        java.util.Arrays.fill(arr,-1);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        // TODO Auto-generated method stub
        for (int i=0; i<=arr.length-1; i=i+1) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        return;
    }

}
