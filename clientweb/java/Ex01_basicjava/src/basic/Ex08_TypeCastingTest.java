package basic;

public class Ex08_TypeCastingTest {
    public static void main(String[] args) {
        // 1. 자동형변환 - JVM 내부에서 자동으로 변환
        byte b = 100;
        short s = b; // 자동형변환
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("l=> " + l);
        System.out.println("d=> " + d);

        char c = 'a';
        System.out.println("char값: " + c);
        int data = c;
        System.out.println("int값: " + data);

        // char = int; X
        // char data2 = data;
        // 2. 명시적 형변환
        int data2 = 100;
        char data3 = (char)data2;  // data2가 int형이지만 char타입으로 변환해서 저장
        System.out.println((char)data2);
        System.out.println(data3);

        double result = (double)10/3;
        System.out.println("결과=> " + result);
    }
}
