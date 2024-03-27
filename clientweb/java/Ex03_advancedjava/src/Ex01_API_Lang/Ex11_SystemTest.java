package Ex01_API_Lang;

public class Ex11_SystemTest {
    public static void main(String[] args) {
        // 시스템 (OS, JVM) 정보를 담고있는 프로퍼티를 추출
        // 환경변수
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));

        // 1970/1/1 부터 현재시간 사이의 날짜를 milliseconds로 반환 
        long start = System.currentTimeMillis(); // 시작시간을 측정
        for(int i = 1; i <= 100; i++){
            // System.out.println(i);
        }
        long end = System.currentTimeMillis(); // 종료시간을 측정
        System.out.println(start);
        System.out.println(end);
        System.out.println("실행시간: " + (end - start));

        // 나노초로 측정해서 반환 - 1/10억
        long start1 = System.nanoTime(); // 시작시간을 측정
        for(int i = 1; i <= 100; i++){
            // System.out.println(i);
        }
        long end1 = System.nanoTime(); // 종료시간을 측정
        System.out.println(start1);
        System.out.println(end1);
        System.out.println("실행시간: " + (end1 - start1));
    }
}
