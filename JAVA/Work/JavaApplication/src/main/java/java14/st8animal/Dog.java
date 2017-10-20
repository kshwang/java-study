package java14.st8animal;

public class Dog extends Animal {
    
    //메서드
    public void bark() {
        System.out.println("bark");
    }
    
    @Override // @Override를 가급적 기록하여 알아볼 수 있게한다
    public void eat() {
        System.out.println("코로 먹는다");
    }
    
    public void eat(String food) {
        System.out.println("코로 먹는다");
    }

}
