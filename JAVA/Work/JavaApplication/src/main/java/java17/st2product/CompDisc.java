package java17.st2product;

public class CompDisc extends Product {
    
    protected String albumtl;
    protected String singer;
 
    public String getAlbumtl() {
        return albumtl;
    }
    public void setAlbumtl(String albumtl) {
        this.albumtl = albumtl;
    }
    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }
    
    @Override
    public String toString() {
        return "CompDisc [albumtl=" + albumtl + ", singer=" + singer + "]";
    }
    
    public CompDisc() {
        super();
    }
    
}
