package java23.jdbc;

public interface IServiceBook extends IBook {
    
    // 추가 메서드. Service 층 에서만 사용되는 메서드.
    public int transCommit(ModelBook b1, ModelBook b2) ;
    public int transRollback(ModelBook b1, ModelBook b2);
    
}
