package Ex03_API_Util;

import java.util.Calendar;
import java.util.Locale;

// java에서 국제화를 지원하는 핵심 클래스 - 스프링에서 다국어 지원을 처리할 때 지역 정보를 설정할 때 사용
// 각 지역의 국가 언어 정보를 갖고 있는 클래스
public class Ex07_LocaleTest {
    public static void main(String[] args) {
        // java플랫폼에서 사용할 수 있는 로케일 정보를 구하기
        Locale [] locales = Locale.getAvailableLocales();
        // for(Locale data:locales){
        //     System.out.println(data);
        // }
        // 빌더 패턴
        // Locale 객체를 생성하기 위해서 Locale 내부 정보를 셋팅해서 하나씩 정보를 추가해가면서 객체를 완성
        // Locale.Builder builder = new Locale.Builder();
        // builder = builder.setLanguage("en");
        // builder = builder.setLanguage("US");
        // Locale locale2 = builder.build();

        Locale locale1 = new Locale.Builder()
                                   .setLanguage("en")
                                   .setRegion("US")
                                   .build();

        Locale locale2 = new Locale.Builder()
                                   .setLanguage("ko")
                                   .setRegion("KR")
                                   .build();
        // 언어와 국가 설정 내용을 기본 설정된 로케일에 맞춰 출력하기
        System.out.println(locale1.getDisplayName());
        System.out.println(locale1.getDisplayName(Locale.CHINESE));
        System.out.println(locale1.getCountry());

        Calendar cal1 = Calendar.getInstance(locale1);
        System.out.println();
        getInfo(cal1);
        // Locale을 US로 설정 - TimeZone확인
        // Calendar에 Locale을 설정해도 Calendar객체를 만들때 설정된 타임존 정보를 갖고 있으므로 별도로 설정해주는 작업을 해야한다.
        System.out.println(cal1.getTimeZone());
    }
    public static void getInfo(Calendar cal){
        System.out.print(cal.get(Calendar.YEAR)+"년");
        System.out.print(cal.get((Calendar.MONTH)+1)+"월");
        System.out.print(cal.get(Calendar.DATE)+"일");
        System.out.print(cal.get(Calendar.HOUR_OF_DAY)+"시");
        System.out.print(cal.get(Calendar.MINUTE)+"분");
        System.out.print(cal.get(Calendar.SECOND)+"초");

    }
}
