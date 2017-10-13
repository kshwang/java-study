package java13.st2method;

public class MethodTest {
    
    public static void main(String[] args) {

        Method m = new Method();
        
        m.instanceMethod(); // 인스턴스이름.메서드명
        m.staticMethod(); // 비추천
        Method.staticMethod(); //클래스이름.메스드명
    }
    
}
