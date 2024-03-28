package Ex03_API_Util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

// java에서 국제화를 지원하는 핵심 클래스 - 스프링에서 다국어 지원을 처리할 때 지역 정보를 설정할 때 사용
// 각 지역의 국가 언어 정보를 갖고 있는 클래스
public class Ex08_TimeZoneTest {
    public static void main(String[] args) {
        Calendar cal1 = new GregorianCalendar();
        // TimeZone정보출력
        // String [] idInfo = TimeZone.getAvailableIDs();
        // for (String data:idInfo){
        //     System.out.println(data);
        // }

        TimeZone timezone = TimeZone.getTimeZone("America/Los_Angles");
        Calendar cal2 = Calendar.getInstance(timezone);
        getInfo(cal2);

        TimeZone timezone2 = TimeZone.getTimeZone("Australia/Sydney");
        Calendar cal3 = Calendar.getInstance(timezone2);
        getInfo(cal3);
        
    }
    public static void getInfo(Calendar cal){
        System.out.print(cal.get(Calendar.YEAR)+"년");
        System.out.print(cal.get((Calendar.MONTH)+1)+"월");
        System.out.print(cal.get(Calendar.DATE)+"일");
        System.out.print(cal.get(Calendar.HOUR_OF_DAY)+"시");
        System.out.print(cal.get(Calendar.MINUTE)+"분");
        System.out.println(cal.get(Calendar.SECOND)+"초");

    }
}
