package java22.junit;

public class Student {
    
    private String name;
    private int   score;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }

    public Student() {
        super();
    }
    public Student(String name, int score) {
        super();
        this.name = name;
        this.score = score;
    }
    
    public String getgrade(int x) {
        if (x >= 90) {
            return "A";
        }
        else if (x >= 80) {
            return "B";
        }
        else if (x >= 70) {
            return "C";
        }
        else if (x >= 60) {
            return "D";
        }
        else {
            return "F";
        }

    }
 
}
