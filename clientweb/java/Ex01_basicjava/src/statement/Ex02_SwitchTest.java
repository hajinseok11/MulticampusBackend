package statement;

public class Ex02_SwitchTest {
    public static void main(String[] args) {
        int data = 0;
        float data2 = 10.0f;
        double data3 = 10.5;
        long data4 = 10L;
        char data5 = 'A';
        String data6 = "01";
        // switch()안의 올 수 있는 변수나, 연산식, 메소드 호출문의 결과가 int로 변환될 수 있는 값과 
        // String만 사용할 수 있다
        // 비교연산자는 사용할 수 없다.
        switch (data6) {
            case "01":
                System.out.println("통과");
        }

    }
}
