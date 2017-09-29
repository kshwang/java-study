package java07;

public class jv07_07_CallByRef {
    
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 5;
        arr[1] = 3;
        
        System.out.println("Swap 전: a="+arr[0]+", b="+arr[1]);
        swap(arr);
        System.out.println("Swap 후: a="+arr[0]+", b="+arr[1]);
        
        }

    private static void swap(int[] arr) {
        // TODO Auto-generated method stub
        int temp = arr[1];
        arr[1] = arr[0];
        arr[0] = temp;
        System.out.println("Swap 내: a="+arr[0]+", b="+arr[1]);
        
    }
    
}
