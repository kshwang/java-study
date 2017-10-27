package java18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex18_05_Date {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Date dt = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat yf = new SimpleDateFormat("yyyy");
        String fo = sf.format(dt);

        System.out.print("현재날자와시간: ");
        System.out.println(fo);
        System.out.print("현재년도: ");
        System.out.println(yf.format(dt));
//        System.out.println(1900+dt.getYear());
        System.out.print("현재월: ");
        System.out.println(dt.getMonth()+1);
        System.out.print("현재일: ");
        System.out.println(dt.getDate());
        System.out.print("현재시간: ");
        System.out.println(dt.getHours());
        System.out.print("현재분: ");
        System.out.println(dt.getMinutes());
        System.out.print("현재초: ");
        System.out.println(dt.getSeconds());

        dt.setYear(dt.getYear()+3);   //+3년
        dt.setMonth(dt.getMonth()-4); //-4월
        dt.setDate(dt.getDate()+2);   //+2일
        
        dt.setHours(dt.getHours()+4);      //+4시간
        dt.setMinutes(dt.getMinutes()-30); //-30분
        dt.setSeconds(dt.getSeconds()+10); //+10초
        
        SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat hms = new SimpleDateFormat("HH:mm:ss");
        String fo2 = ymd.format(dt);
        String fo3 = hms.format(dt);
        System.out.print("현재+3년,-4월,+2일: ");
        System.out.println(ymd.format(dt));
        System.out.print("현재+4시간,-30분,+10초: ");
        System.out.println(hms.format(dt));
        
    }
    
}
