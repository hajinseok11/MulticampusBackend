package Ex03_API_Util;

import java.time.LocalDateTime;

// LocalDate, LocalDateTime, LocalTime => 8버전에서 추가
public class Ex06_LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime date1 = LocalDateTime.of(2024,3,28,13,20,10);
        System.out.println(date1);
        
        LocalDateTime date2 = date1.plusYears(1).plusMonths(2).plusHours(2);
        System.out.println(date2);
    }
}
