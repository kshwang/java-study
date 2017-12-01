package board.model;

import java.sql.Date;
import java.time.LocalDateTime;

public class ModelArticle {

    private Integer articleno  = null; //AUTO_INCREMENT,
    private String  boardcd    = "";
    private String  title      = "";
    private String  content    = "";
    private String  email      = "";
    private Integer  hit       = null;
    private java.sql.Date regdate = null;
    private Integer  countgood = null;
    private Integer  countbad  = null;
    private Integer UseYN      = null;
    private String  InsertUID  = "";
    private java.sql.Date InsertDT = null;
    private String  UpdateUID  = "";
    private java.sql.Date UpdateDT = null;
    
    // getter,setter
    public Integer getArticleno() {
        return articleno;
    }
    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }
    public String getBoardcd() {
        return boardcd;
    }
    public void setBoardcd(String boardcd) {
        this.boardcd = boardcd;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getHit() {
        return hit;
    }
    public void setHit(Integer hit) {
        this.hit = hit;
    }
    public java.sql.Date getRegdate() {
        return regdate;
    }
    public void setRegdate(java.sql.Date regdate) {
        this.regdate = regdate;
    }
    public Integer getCountgood() {
        return countgood;
    }
    public void setCountgood(Integer countgood) {
        this.countgood = countgood;
    }
    public Integer getCountbad() {
        return countbad;
    }
    public void setCountbad(Integer countbad) {
        this.countbad = countbad;
    }
    public Integer getUseYN() {
        return UseYN;
    }
    public void setUseYN(Integer useYN) {
        UseYN = useYN;
    }
    public String getInsertUID() {
        return InsertUID;
    }
    public void setInsertUID(String insertUID) {
        InsertUID = insertUID;
    }
    public java.sql.Date getInsertDT() {
        return InsertDT;
    }
    public void setInsertDT(java.sql.Date insertDT) {
        InsertDT = insertDT;
    }
    public String getUpdateUID() {
        return UpdateUID;
    }
    public void setUpdateUID(String updateUID) {
        UpdateUID = updateUID;
    }
    public java.sql.Date getUpdateDT() {
        return UpdateDT;
    }
    public void setUpdateDT(java.sql.Date updateDT) {
        UpdateDT = updateDT;
    }

    // toString
    @Override
    public String toString() {
        return "ModelArticle [articleno=" + articleno + ", boardcd=" + boardcd
                + ", title=" + title + ", content=" + content + ", email="
                + email + ", hit=" + hit + ", regdate=" + regdate
                + ", countgood=" + countgood + ", countbad=" + countbad
                + ", UseYN=" + UseYN + ", InsertUID=" + InsertUID
                + ", InsertDT=" + InsertDT + ", UpdateUID=" + UpdateUID
                + ", UpdateDT=" + UpdateDT + "]";
    }

    // 생성자
    public ModelArticle() {
        super();
    }
    public ModelArticle(Integer articleno, String boardcd, String title,
            String content, String email, Integer hit, Date regdate,
            Integer countgood, Integer countbad, Integer useYN,
            String insertUID, Date insertDT, String updateUID, Date updateDT) {
        super();
        this.articleno = articleno;
        this.boardcd = boardcd;
        this.title = title;
        this.content = content;
        this.email = email;
        this.hit = hit;
        this.regdate = regdate;
        this.countgood = countgood;
        this.countbad = countbad;
        UseYN = useYN;
        InsertUID = insertUID;
        InsertDT = insertDT;
        UpdateUID = updateUID;
        UpdateDT = updateDT;
    }

}
