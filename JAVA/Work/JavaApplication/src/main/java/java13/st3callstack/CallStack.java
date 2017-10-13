package java13.st3callstack;

public class CallStack {
    
    public static void main(String[] args) {
        firstMeth();
    }
    
    public static void firstMeth() {
        secondMeth();
    }

    public static void secondMeth() {
        System.out.println("secondMeth");
    }
}
