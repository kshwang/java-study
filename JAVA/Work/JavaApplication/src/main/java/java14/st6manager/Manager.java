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
        String info = "이름:"+super.getName();
        info = info+", 주소:"+super.getAddr();
        info = info+", 급여:"+super.getSaly();
        info = info+", 생일:"+super.getBday();
        
        System.out.println(info);
    }

}
