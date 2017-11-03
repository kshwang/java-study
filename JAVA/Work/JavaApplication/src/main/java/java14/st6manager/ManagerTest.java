package java14.st6manager;

public class ManagerTest {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Manager[] mng = new Manager[5];

        for (int i=0; i<mng.length; i++) {
            mng[i] = new Manager();
            mng[i].setName("홍길동"+i);
            mng[i].setAddr("압구정"+i);
            mng[i].setSaly(100000000+i);
            mng[i].setBday(19940101+i);
            mng[i].test();
        }
        
    }
    
}
