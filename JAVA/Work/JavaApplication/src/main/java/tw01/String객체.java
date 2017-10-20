package tw01;

public class String객체 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String  s = "abc defg ijklm nop qrs wx yz";
        System.out.println("문자열길이:"+s.length());
        System.out.println("문자열추출:"+s.substring(4,8));
        System.out.println("문자열치환:"+s.replace("ijk","*#$%^"));

//아래부터 다시..
        String  s1 = "74 874 9883 73 9 73646 744";
        String[] arrs = new String[7];
        int[]    arri = new int[7];
        arrs = s1.split(s1);
        System.out.println("split:"+s1.split(s1));
        System.out.println("split:"+arrs);
        
    }
    
}
