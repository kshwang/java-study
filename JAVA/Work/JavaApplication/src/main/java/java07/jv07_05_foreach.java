package java07;

public class jv07_05_foreach {
    
    public static void main(String[] args ) {
        int[] numb = {10,20,30};
        
        for (int j=0; j<=numb.length-1; j=j+1) {
            System.out.println(numb[j]);
        }

        for (int value : numb) {
            System.out.println(value);
        }
    }
    
}
