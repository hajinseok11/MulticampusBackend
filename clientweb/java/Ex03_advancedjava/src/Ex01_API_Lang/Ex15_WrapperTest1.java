package Ex01_API_Lang;

public class Ex15_WrapperTest1 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        // 5.0 이전
        Integer in = new Integer(10);
        test(in);
        // 5.0 이후
        // Object = int
        int i = 10;
        test(i); // 5.0 이후 jdk 컴파일러가 자동으로 변환해준다.
                 // 참조형 매개변수를 요구하는 메소드에 기본형을 전달해도
                 // 자동으로 Integer in = new Integer(10); 와 같은 코드를 실행해서 전달
                 // 오토박싱
    }
    public static void test(Object obj){
        // 5.0 이전 
        Integer in = (Integer)obj;  // obj를 사용하기 위해서 Integer타입으로 캐스팅
        int myval = in.intValue();
        System.out.println("5.0이전 버전: " +myval);
        // 5.0 이후
        int myval2 = (int)obj;  // int형 변수에 참조형 매개변수를 전달하는 경우
                                // 컴파일러가 자동으로 객체로 포장된 값을 기본형으로 반환
                                // Integer in = in.intValue();
                                // int myval = in.intValue();
                                // 오토언박싱
        System.out.println("5.0이후 버전: " +myval2);   
    }

}
