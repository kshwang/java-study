package board.model;

import java.sql.Date;
import java.time.LocalDateTime;

public class ModelUser {
        
    private Integer userno    = null; // AUTO_INCREMENT,
    private String  userid    = ""; 
    private String  email     = ""; 
    private String  passwd    = ""; 
    private String  name      = ""; 
    private String  mobile    = ""; 
    private Integer retireYN  = null;
    private String  InsertUID = "";
    private java.sql.Date InsertDT  = null;
    private String  UpdateUID = "";
    private String  UpdateDT  = "";
    
    // getter,setter
    public Integer getUserno() {
        return userno;
    }
    public void setUserno(Integer userno) {
        this.userno = userno;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Integer getRetireYN() {
        return retireYN;
    }
    public void setRetireYN(Integer retireYN) {
        this.retireYN = retireYN;
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
    public String getUpdateDT() {
        return UpdateDT;
    }
    public void setUpdateDT(String updateDT) {
        UpdateDT = updateDT;
    }

    // toString
    @Override
    public String toString() {
        return "ModelUser [userno=" + userno + ", userid=" + userid + ", email="
                + email + ", passwd=" + passwd + ", name=" + name + ", mobile="
                + mobile + ", retireYN=" + retireYN + ", InsertUID=" + InsertUID
                + ", InsertDT=" + InsertDT + ", UpdateUID=" + UpdateUID
                + ", UpdateDT=" + UpdateDT + "]";
    }

    // 생성자
    public ModelUser() {
        super();
    }
    public ModelUser(Integer userno, String userid, String email, String passwd,
            String name, String mobile, Integer retireYN, String insertUID,
            Date insertDT, String updateUID, String updateDT) {
        super();
        this.userno = userno;
        this.userid = userid;
        this.email = email;
        this.passwd = passwd;
        this.name = name;
        this.mobile = mobile;
        this.retireYN = retireYN;
        InsertUID = insertUID;
        InsertDT = insertDT;
        UpdateUID = updateUID;
        UpdateDT = updateDT;
    } 

}
