package java18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class jv18_09_LocalDateTime {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LocalDate today = LocalDate.now(); //현재일
        LocalTime curtm = LocalTime.now(); //현재시간
        
        
        System.out.println(today.get(ChronoField.YEAR)); //현재년도
        System.out.println(today.get(ChronoField.MONTH_OF_YEAR)); //현재월
        System.out.println(today.get(ChronoField.DAY_OF_MONTH)); //현재일
        
        System.out.println(curtm.get(ChronoField.HOUR_OF_DAY)); //현재24시
        System.out.println(curtm.get(ChronoField.HOUR_OF_AMPM)); //현재12시
        System.out.println(curtm.get(ChronoField.MINUTE_OF_HOUR)); //현재분
        System.out.println(curtm.get(ChronoField.SECOND_OF_MINUTE)); //현재초
        
        //현재 +3년, -4월, +2일 //yyyy-MM-dd
        //현재 +4시,-30분,+10초 //HH:mm:ss
        LocalDateTime ldt = LocalDateTime.now();
        ldt.plusYears(+3);
        ldt.plusMonths(-4);
        ldt.plusDays(+2);
        ldt.plusHours(+4);
        ldt.plusMinutes(-30);
        ldt.plusSeconds(+10);
        System.out.println(ldt);

        ldt.with(ChronoField.YEAR, +3);
        ldt.with(ChronoField.MONTH_OF_YEAR, -4);
        ldt.with(ChronoField.DAY_OF_MONTH, +2);
        
        ldt.with(ChronoField.HOUR_OF_DAY, +4);
        ldt.with(ChronoField.MINUTE_OF_HOUR, -30);
        ldt.with(ChronoField.SECOND_OF_MINUTE, -10);
        
        System.out.println(ldt.toString());
        
    }
    
}
