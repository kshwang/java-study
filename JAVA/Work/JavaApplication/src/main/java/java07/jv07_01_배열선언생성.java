package java07;

public class jv07_01_배열선언생성 {
    
    public static void main(String[] args) {
        int[] numb = new int[6];
        
        numb[0] = 0;
        numb[1] = 1;
        numb[2] = 2;
        numb[3] = 3;
        numb[4] = 4;
        numb[5] = 5;
        
        for (int j=0; j<numb.length; j=j+1) {
            System.out.println(numb[j]);
        }
        
    }
    
}
