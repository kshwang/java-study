package java07;

public class jv07_02_ArrayExam {
    
    public static void main(String[] args) {
        int size = 6;
        int[] numb = new int[size];
        
        for (int i=0; i<numb.length; i=i+1) {
            numb[i] = i;
            System.out.println("numb["+numb[i]+": "+i);
        }
    }
    
}
