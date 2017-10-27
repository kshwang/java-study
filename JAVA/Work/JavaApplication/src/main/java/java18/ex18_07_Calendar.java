package java18;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex18_07_Calendar {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calendar cd = Calendar.getInstance();
        
        //+3년, -4월, +2일 //yyyy-MM-dd
        //+4시,-30분,+10초 //HH:mm:ss
        cd.get(Calendar.YEAR);
 
        cd.set(2000,4,13,13,13,15);
        
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fm = sf.format(cd.getTime());
        System.out.println(fm);
        
        System.out.println(cd);
        System.out.println("년 >> "+cd.get(Calendar.YEAR));
        System.out.println("월 >> "+cd.get(Calendar.MONTH));
        System.out.println("일 >> "+cd.get(Calendar.DATE));
        System.out.println("시 >> "+cd.get(Calendar.HOUR));
        System.out.println("분 >> "+cd.get(Calendar.MINUTE));
        System.out.println("초 >> "+cd.get(Calendar.SECOND));
        
        cd.set(Calendar.YEAR, 2000);
        cd.set(Calendar.MONTH, 4);
        cd.set(Calendar.DATE, 13);
        cd.set(Calendar.HOUR, 12);
        cd.set(Calendar.MINUTE, 13);
        cd.set(Calendar.SECOND, 15);
        
    }
    
}
