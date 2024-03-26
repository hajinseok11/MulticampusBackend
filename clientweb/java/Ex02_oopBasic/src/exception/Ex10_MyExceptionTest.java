package exception;

import java.util.Scanner;

public class Ex10_MyExceptionTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int money = 1000; // 잔액
        System.out.println("***********인터넷뱅킹*************");
        System.out.println("출금하기");
        System.out.println("출금할 금액입력:");
        int money2 = key.nextInt(); // 출금금액
        // money2가 money보다 크면 출금을 할 수 없는 상황이므로 Exception을 발생시키기
        if (money2>money){
            // 예외가 발생되는 상황 - JVM이 인지하는 예외상황이 아니므로 인위적으로 Exceptioon을 발생
            // throw new Exception클래스생성자()
            try {
                throw new Ex09_MyException("잔액이 0원입니다.. 출금을 할 수 없습니다.");
            }catch(Exception e){
                System.out.println("잔액이 없어서 출금할 수 없습니다.");
                System.out.println(e.getMessage());
            }
        }else{
            // 정상상황
            System.out.println("정상상황의 step");
        }
    }
}
