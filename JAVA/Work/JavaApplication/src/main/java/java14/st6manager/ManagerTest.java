package java14.st6manager;

public class ManagerTest {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Manager m1 = new Manager("강다니엘","압구정",100000000,19940101);
        Manager m1 = new Manager();
        m1.setName("강다니엘");
        m1.setAddr("압구정");
        m1.setSaly(100000000);
        m1.setBday(19940101);
        m1.test();
        
//        System.out.println(m1.toString());
        
    }
    
}
