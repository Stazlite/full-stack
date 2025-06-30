import java.time.LocalTime;
import java.time.Month;
import java.time.LocalDate;
import java.time.ZoneId;



public class stream006 {
    public static void main(String[] args){
        LocalDate d=LocalDate.of(2000,Month.MAY,22);
        System.out.println(d);
        LocalTime t = LocalTime.now(ZoneId.of("Asia/Dubai"));
        System.out.println(t);
        for(String i:ZoneId.getAvailableZoneIds()){
            System.out.println(t);
        }
    }
}
