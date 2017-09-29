package java07;

public class jv07_09_MaxArray {
    
    public static void main(String[] args) {
        
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 8;
        arr[3] = 0;
        arr[4] = 3;
        
        int max = MaxVal(arr);

        System.out.println("최대값: "+max);
    }

    private static int MaxVal(int[] arr) {
        // TODO Auto-generated method stub
        java.util.Arrays.sort(arr);
        
        int max = arr[arr.length-1];
        return max;
    }
    
}
