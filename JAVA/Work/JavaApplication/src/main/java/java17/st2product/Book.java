package java17.st2product;

public class Book extends Product {

    protected int    isbn;
    protected String writer;
    protected String booktl;
    
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getBooktl() {
        return booktl;
    }
    public void setBooktl(String booktl) {
        this.booktl = booktl;
    }
    
    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", writer=" + writer + ", booktl="
                + booktl + "]";
    }
    
    public Book() {
        super();
    }
     
}
