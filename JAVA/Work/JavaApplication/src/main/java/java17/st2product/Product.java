package java17.st2product;

public class Product {
    
    protected int    id;
    protected String explan;
    protected String producer;
    protected int    price;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getExpln() {
        return explan;
    }
    public void setExpln(String explan) {
        this.explan = explan;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product [id=" + id + ", explan=" + explan + ", producer="
                + producer + ", price=" + price + "]";
    }
    
    public Product() {
        super();
    }
    
    
}
