package java14.st7student;

public class GradStudentTest {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        GradStudent s1 = new GradStudent();
        s1.setNumb(1);
        s1.setName("홍길동");
        s1.setPhon(1033333392);
        
        GradStudent s2 = new GradStudent("lab");
        s2.setNumb(2);
        s2.name = "김길동";
        s2.phon = 987654321;
        
        GradStudent s3 = new GradStudent(3,"이길동",1234567890,null);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
    
}
