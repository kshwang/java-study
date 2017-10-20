package java15.st2enum;

public enum PhoneHeadEnum {
    
    P010("010"),
    P011("011"),
    P016("016"),
    P017("017"),
    P018("018"),
    P019("019");
   
    private final String value;
    
    PhoneHeadEnum(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}
