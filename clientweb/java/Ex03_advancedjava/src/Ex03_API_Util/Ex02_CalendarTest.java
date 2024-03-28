package Ex03_API_Util;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex02_CalendarTest {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();
        System.out.println(cal);
        Date d = new Date();
        System.out.println(d);

        System.out.println("====================Calendar 객체의 사용법=====================");
        System.out.println(cal.get(Calendar.YEAR)+"년");
        System.out.println(cal.get((Calendar.MONTH)+1)+"월");
        System.out.println(cal.get(Calendar.DATE)+"일");
        System.out.println(cal.get(Calendar.HOUR)+"시");
        System.out.println(cal.get(Calendar.MINUTE)+"분");
        System.out.println(cal.get(Calendar.SECOND)+"초");
        cal2.set(2013,8,1);
        // System.out.println(cal2);

        // 오늘부터 6/18일까지 d-day 계산하기
        // 1970년 1월1일 자정 (0:0:0) UTC
        Calendar today = new GregorianCalendar();
        Calendar dday = new GregorianCalendar();
        dday.set(2024,5,18);
        // System.out.println(cal3);

        long time = dday.getTimeInMillis() - today.getTimeInMillis();
        System.out.println(time/1000/60/60/24);



    }
}
