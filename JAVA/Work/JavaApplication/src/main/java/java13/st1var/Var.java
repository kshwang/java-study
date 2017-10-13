package java13.st1var;

public class Var {
    
    public void sub(int... v) {
        System.out.println("인수의 갯수: "+v.length);
        for (int i : v) {
            System.out.println(i+" ");
        }
        System.out.println();

        System.out.println("--------");
        for (int i=0; i<v.length; i=i+1) {
            System.out.println(v[i]+" ");
        }
        System.out.println();
        System.out.println("************************");
    }
    
}
