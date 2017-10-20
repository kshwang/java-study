package java14.st6manager;

public class Emp {
    
    private   String name;
    private   String addr;
    protected int    saly;
    private   int    bday;
    
    //getter/setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public int getSaly() {
        return saly;
    }
    public void setSaly(int saly) {
        this.saly = saly;
    }
    public int getBday() {
        return bday;
    }
    public void setBday(int bday) {
        this.bday = bday;
    }
    
    //toString
    @Override
    public String toString() {
        return "Emp [name=" + name + ", addr=" + addr + ", saly=" + saly
                + ", bday=" + bday + "]";
    }
    
    //constructor
    public Emp() {
        super();
    }
    public Emp(String name, String addr, int saly, int bday) {
        super();
        this.name = name;
        this.addr = addr;
        this.saly = saly;
        this.bday = bday;
    }
   
}
