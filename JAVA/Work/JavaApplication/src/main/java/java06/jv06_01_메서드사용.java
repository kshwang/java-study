package java06;

public class jv06_01_메서드사용 {
    
    public static void main(String[] args) {
        
        int sum=0, sum2=0, sum3=0;
        
        sum = getsum(1, 10);
        System.out.println("1부터 10까지의 합: "+sum);

        sum2 = getsum(1, 100);
        System.out.println("1부터 100까지의 합: "+sum2);

        sum3 = getsum(1, sum2);
        System.out.println("100부터 "+sum2+"까지의 합: "+sum3);
    }

    public static int getsum(int stt, int end) {
        int sum=0;
        
        for (int i=stt; i<=end; i=i+1) {
            sum = sum +i;
        }
        return sum;
    }
}
