package java02;
   
public class ja02_12_ASCII코드 {
    
     public static void main(String[] args) {
        
            int x = '4'; //문자가 숫자로 변환됨, ASCII:52
            int y = '5'; //문자가 숫자로 변환됨, ASCII:53
            int res = 0;
            
            res = x + y;
            System.out.println(res);
    
            res = x - y;
            System.out.println(res);
            
            res = x * y;
            System.out.println(res);
        
            res = x / y;
            System.out.println(res);
    
            res = x % y;
            System.out.println(res);
     }
        
}
