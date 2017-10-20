package java14.st7student;

public class GradStudent extends Student {
    
    public String lab;

    //getter/setter
    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    //toString
    @Override
    public String toString() {
        return "GradStudent [lab=" + lab + ", name=" + name + ", phon=" + phon
                + ", toString()=" + super.toString() + "]";
    }

    //constructor
    public GradStudent() {
        super();
    }
    public GradStudent(String lab) {
        super();
        this.lab = lab;
    }
    public GradStudent(int numb, String name, int phon, String lab) {
        super(numb, name, phon);
        this.lab = lab;
    }

}
