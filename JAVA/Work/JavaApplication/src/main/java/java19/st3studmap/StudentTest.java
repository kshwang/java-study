package java19.st3studmap;

import java.util.*;

public class StudentTest {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //HashMap 인스턴스 생성
        Map<String, Student> map = new HashMap<>();
        
        //Map에 추가
        //key     --> (이름,학번)
        //170101  --> new Student(170101,구준표)
        //170102  --> new Student(170102,금잔디)
        //170103  --> new Student(170103,윤지후)
        map.put("170101",new Student(170101, "구준표"));
        map.put("170102",new Student(170102, "금잔디"));
        map.put("170103",new Student(170103, "윤지후"));

        //entrySet,foreach map에 항목 출력
        System.out.println("foreach문으로 Map 출력 >> ");
        for (Map.Entry<String,Student> e : map.entrySet()) {
            int    no = e.getValue().getMumb();
            String nm = e.getValue().getName();
            System.out.format("학번: %6d, 이름: %3s,\n",no,nm);
        }

        //학번 170102를 삭제
        map.remove("170102");
        System.out.println(map.toString());
        
        //윤지후=>윤지훈 변경
//        map.replace("170103", "윤지후", "윤지훈");
        Integer key=0;
        for (Student s:map.values()) {
            if (s.getName().equals("윤지후")) {
                key = s.getMumb();
                break;
            }
        }
        map.put(String.valueOf(key), new Student(170103, "윤지훈"));
        System.out.println(map.toString());

    }
    
}
