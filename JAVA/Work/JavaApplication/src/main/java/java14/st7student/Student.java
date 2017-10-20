package java14.st7student;

public class Student {
    
    private int    numb;
    public  String name;
    protected  int phon;
    
    //getter/setter
    public int getNumb() {
        return numb;
    }
    public void setNumb(int numb) {
        this.numb = numb;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhon() {
        return phon;
    }
    public void setPhon(int phon) {
        this.phon = phon;
    }

    //toString
    @Override
    public String toString() {
        return "Student [numb=" + numb + ", name=" + name + ", phon=" + phon
                + "]";
    }
    
    //constructor
    public Student() {
        super();
    }
    public Student(int numb, String name, int phon) {
        super();
        this.numb = numb;
        this.name = name;
        this.phon = phon;
    }
    
}
