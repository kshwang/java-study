package java14.st6manager;

public class Manager extends Emp {
    
    private int bonus;
    
    //getter/setter
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    };
    
    //toString
    @Override
    public String toString() {
        return "Manager [bonus=" + bonus + ", saly=" + saly + ", toString()="
                + super.toString() + "]";
    }
    
    //constructor
    public Manager() {
        super();
    }
    public Manager(int bonus) {
        super();
        this.bonus = bonus;
    }

    //메서드
    public void test() {
        String info = "name:"+super.getName();
        info = info+", addr:"+super.getAddr();
        info = info+", saly:"+super.getSaly();
        info = info+", bday:"+super.getBday();
        
        System.out.println(info);
    }

}
