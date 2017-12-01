package board.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Arrays;

public class ModelBoard {

    private String  boardcd     = ""; //VARCHAR(20) NOT NULL,
    private String  boardnm     = ""; //VARCHAR(40) NOT NULL,
    private Integer UseYN       = null; //TINYINT(1) NULL DEFAULT '1',
    private String  InsertUID   = ""; //VARCHAR(40) NULL DEFAULT NULL,
    private java.sql.Date InsertDT = null; //DATETIME NULL DEFAULT NULL,
    private String  UpdateUID   = ""; //VARCHAR(40) NULL DEFAULT NULL,
    private java.sql.Date UpdateDT = null; //DATETIME NULL DEFAULT NULL,

    // getter,setter
    public String getBoardcd() {
        return boardcd;
    }
    public void setBoardcd(String boardcd) {
        this.boardcd = boardcd;
    }
    public String getBoardnm() {
        return boardnm;
    }
    public void setBoardnm(String boardnm) {
        this.boardnm = boardnm;
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
        return "ModelBoard [boardcd=" + boardcd + ", boardnm=" + boardnm
                + ", UseYN=" + UseYN + ", InsertUID=" + InsertUID
                + ", InsertDT=" + InsertDT + ", UpdateUID=" + UpdateUID
                + ", UpdateDT=" + UpdateDT + "]";
    }

    // 생성자
    public ModelBoard() {
        super();
    }
    public ModelBoard(String boardcd, String boardnm, Integer useYN,
            String insertUID, Date insertDT, String updateUID, Date updateDT) {
        super();
        this.boardcd = boardcd;
        this.boardnm = boardnm;
        UseYN = useYN;
        InsertUID = insertUID;
        InsertDT = insertDT;
        UpdateUID = updateUID;
        UpdateDT = updateDT;
    }

}
