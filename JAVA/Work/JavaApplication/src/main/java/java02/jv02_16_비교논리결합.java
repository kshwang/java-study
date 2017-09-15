package java02;

public class jv02_16_비교논리결합 {
    
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        
        System.out.println((x == y) && (x != y));
        System.out.println((x  > y) || (x  < y));
        System.out.println((x >= y) || (x <= y));
        System.out.println((x == y) && (x != y) || (x < y));

        int a = 1;
        int b = 1;
        
//        System.out.println(++a);
//        System.out.println(b++);

        int aa = ++a * 2;
        int bb = b++ * 2;
        
        System.out.println(aa);
        System.out.println(bb);
    }
    
}
