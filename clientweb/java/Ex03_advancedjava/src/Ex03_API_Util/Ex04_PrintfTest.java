package Ex03_API_Util;

public class Ex04_PrintfTest {
    public static void main(String[] args) {
        /**
         * 출력형식을 기호를 이용해서 설정
         * %d -> 정수 출력
         * %s -> 문자열
         * %f -> 실수
         * %n -> 줄바꿈
         * System.out.printf("%s, %s %n",매개변수1, 매개변수2.....)
         *                   ----------- -----------------------
         *                     출력형식     출력형식에 연결할 값
         */
        String str = "java programming";
        String str2 = "재밌다.";

        System.out.printf("%s, %s %n", str,str2);
        System.out.printf("[%20s]%n", str); // [%20s]너비20자로 공간을 두고 출력
        System.out.printf("%d %n",1000);
        System.out.printf("값 => (%d, %d) %n",1000,2000);
        System.out.printf("값 => (%f) %n",1000.1234);
        System.out.printf("값 => (%10.2f) %n",1000.1234);   // 5.2는 전체자리를 5로 하고 소수점은 2자리
                                                                           // 5가 넘어가면 너비지정값보다 커지므로 그냥 무시하고
                                                                           // 사이즈만큼 출력
        System.out.printf("값 => (%5.2f) %n",567890.1234);
        
    }
    
    
}
