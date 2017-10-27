package java17.st2product;

public class CorverBook extends Book {
    
    private String langnm;

    public String getLangnm() {
        return langnm;
    }

    public void setLangnm(String langnm) {
        this.langnm = langnm;
    }

    @Override
    public String toString() {
        return "CorverBook [langnm=" + langnm + "]";
    }

    public CorverBook() {
        super();
    }
    
}
