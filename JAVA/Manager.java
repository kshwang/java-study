package 황경수;

public class Manager extends Employee {
    
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
        return "Manager [bonus=" + bonus + ", salary=" + salary + ", toString()="
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
        info = info+", 급여:"+super.getSalary();
        info = info+", 생일:"+super.getRrn();
        
        System.out.println(info);
    }

}