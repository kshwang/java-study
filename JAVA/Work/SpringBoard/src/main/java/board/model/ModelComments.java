package board.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Arrays;

public class ModelComments {

    private Integer commentno = null; //INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    private Integer articleno = null; //INT(10) UNSIGNED NOT NULL,
    private String  email     = ""; //VARCHAR(60) NULL DEFAULT NULL,
    private String  memo      = ""; //VARCHAR(4000) NULL DEFAULT NULL,
    private java.sql.Date regdate   = null; //DATETIME NULL DEFAULT NULL,
    private Integer UseYN     = null; //TINYINT(1) NULL DEFAULT '1',
    private String  InsertUID = ""; //VARCHAR(40) NULL DEFAULT NULL,
    private java.sql.Date InsertDT  = null; //DATETIME NULL DEFAULT NULL,
    private String  UpdateUID = ""; //VARCHAR(40) NULL DEFAULT NULL,
    private java.sql.Date UpdateDT  = null; //DATETIME NULL DEFAULT NULL,

    // getter,setter
    public Integer getCommentno() {
        return commentno;
    }
    public void setCommentno(Integer commentno) {
        this.commentno = commentno;
    }
    public Integer getArticleno() {
        return articleno;
    }
    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    public java.sql.Date getRegdate() {
        return regdate;
    }
    public void setRegdate(java.sql.Date regdate) {
        this.regdate = regdate;
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
        return "ModelComments [commentno=" + commentno + ", articleno="
                + articleno + ", email=" + email + ", memo=" + memo
                + ", regdate=" + regdate + ", UseYN=" + UseYN + ", InsertUID="
                + InsertUID + ", InsertDT=" + InsertDT + ", UpdateUID="
                + UpdateUID + ", UpdateDT=" + UpdateDT + "]";
    }

    // 생성자
    public ModelComments() {
        super();
    }
    public ModelComments(Integer commentno, Integer articleno, String email,
            String memo, Date regdate, Integer useYN, String insertUID,
            Date insertDT, String updateUID, Date updateDT) {
        super();
        this.commentno = commentno;
        this.articleno = articleno;
        this.email = email;
        this.memo = memo;
        this.regdate = regdate;
        UseYN = useYN;
        InsertUID = insertUID;
        InsertDT = insertDT;
        UpdateUID = updateUID;
        UpdateDT = updateDT;
    }

}
