package statement;

public class Ex05_WhileTest {
    public static void main(String[] args) {
        int count =1;
        while (true) {// 반복문이 종료될 조건을 반드시 내부에 정의해야한다.
            System.out.println("자바프로그래밍");
            if (count ==5){
                break;
            }
            count++;
        }
    }
}
