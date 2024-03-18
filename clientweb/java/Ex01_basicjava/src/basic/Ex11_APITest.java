package basic;
import java.util.Random;

// API 사용하기
public class Ex11_APITest {
    public static void main(String[] args) {
        /**
         * 문자열을 처리하기 위한 기능들을 사용하기 위해서 String클래스를 JVM이 인식하는 작업공간에 할당
         *                                                                          -------
         *                                                                         JVN이 찾아서 사용할 수 있도록
         *                                                                         미리 약속된 공간(heap)
         * 클래스명 변수 = new 클래스명 ()
         * ------             --------
         * 할당되는        heap에 할당해서 사용하고 싶은 클래스명()
         * 클래스명
         * 클래스명이 데이터타입
         */
        String str = new String();
        // Object
        Object obj = new Object();
        // Thread생성
        Thread thd = new Thread();
        // JVM이 기본으로 인식하는 패키지의 위치는 java.lang 패키지와 현재 작업중인 클래스파일이 위치하는 패키지 (basic)
        // => 기본으로 인식하는 패키지 이외의 패키지는 JVM이 인식할 수 있도록 처리해야 한다.(import)
        Random rand = new Random();



    }
}
