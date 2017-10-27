package java19.st3studmap;

public class Student {
    
    private int    mumb;
    private String name;

    public int getMumb() {
        return mumb;
    }
    public void setMumb(int mumb) {
        this.mumb = mumb;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [mumb=" + mumb + ", name=" + name + "]";
    }

    public Student() {
        super();
    }
    public Student(int mumb, String name) {
        super();
        this.mumb = mumb;
        this.name = name;
    }
    
}
