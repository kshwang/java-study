package java06;

public class jv06_02_메서드사용 {
    
    public static void main(String[] args) {
        
        int sum=0, sum2=0, sum3=0;
        
        for (int i=1; i<=10; i=i+1) {
            sum = sum + i;
        }
        System.out.println("1부터 10까지의 합: "+sum);

        for (int i=1; i<=100; i=i+1) {
            sum2 = sum2 + i;
        }
        System.out.println("1부터 100까지의 합: "+sum2);

        for (int i=100; i<=sum2; i=i+1) {
            sum3 = sum3 + i;
        }
        System.out.println("100부터 "+sum2+"까지의 합: "+sum3);
    }

}
