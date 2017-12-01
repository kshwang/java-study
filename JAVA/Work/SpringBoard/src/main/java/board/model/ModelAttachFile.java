package board.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Arrays;

public class ModelAttachFile {

    private Integer attachfileno = null; //INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    private String  filename     = ""; //VARCHAR(50) NOT NULL,
    private String  filetype     = ""; //VARCHAR(30) NULL DEFAULT NULL,
    private Integer filesize     = null; //INT(11) NULL DEFAULT NULL,
    private Integer articleno    = null; //INT(11) NULL DEFAULT NULL,
    private Integer UseYN        = null; //TINYINT(1) NULL DEFAULT '1',
    private String  InsertUID    = ""; //VARCHAR(40) NULL DEFAULT NULL,
    private java.sql.Date InsertDT = null; //DATETIME NULL DEFAULT NULL,
    private String  UpdateUID    = ""; //VARCHAR(40) NULL DEFAULT NULL,
    private java.sql.Date UpdateDT = null; //DATETIME NULL DEFAULT NULL,
    private byte[]  imageData    = null; //LONGBLOB NULL,

    // getter,setter
    public Integer getAttachfileno() {
        return attachfileno;
    }
    public void setAttachfileno(Integer attachfileno) {
        this.attachfileno = attachfileno;
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getFiletype() {
        return filetype;
    }
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }
    public Integer getFilesize() {
        return filesize;
    }
    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }
    public Integer getArticleno() {
        return articleno;
    }
    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
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
    public byte[] getImageData() {
        return imageData;
    }
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    // toString
    @Override
    public String toString() {
        return "ModelAttachFile [attachfileno=" + attachfileno + ", filename="
                + filename + ", filetype=" + filetype + ", filesize=" + filesize
                + ", articleno=" + articleno + ", UseYN=" + UseYN
                + ", InsertUID=" + InsertUID + ", InsertDT=" + InsertDT
                + ", UpdateUID=" + UpdateUID + ", UpdateDT=" + UpdateDT
                + ", imageData=" + Arrays.toString(imageData) + "]";
    }

    // 생성자
    public ModelAttachFile() {
        super();
    }
    public ModelAttachFile(Integer attachfileno, String filename,
            String filetype, Integer filesize, Integer articleno, Integer useYN,
            String insertUID, Date insertDT, String updateUID, Date updateDT,
            byte[] imageData) {
        super();
        this.attachfileno = attachfileno;
        this.filename = filename;
        this.filetype = filetype;
        this.filesize = filesize;
        this.articleno = articleno;
        UseYN = useYN;
        InsertUID = insertUID;
        InsertDT = insertDT;
        UpdateUID = updateUID;
        UpdateDT = updateDT;
        this.imageData = imageData;
    }

}
