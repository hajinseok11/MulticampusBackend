package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 catch사용하기
// 예외처리 : try~catch~catch...
//          각각의 예외가 발생핧 때마다 다르게 처리하고 싶은 경우 catch블럭을 여러개 정의하고 사용할 수 있다.
//          단, 상위 Exception은 가장 아래에 정의한다.
public class Ex04_ExceptionTest04 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String str = null;
        try {
            // 예외 발생 가능성이 있는 코드
            System.out.println("시작");
            System.out.print("숫자입력: ");
            int num1 = key.nextInt();
            System.out.println("나눌 숫자 입력: ");
            int num2 = key.nextInt();
            System.out.println("결과=> "+(num1/num2));
            if(num1%2==0){
                System.out.println(args[0]); // 짝수
            } else{
                System.out.println("종료: "+str.length());  // 홀수
            }
        }catch(ArithmeticException e){
            System.out.println("0으로 나눔");
        } catch (InputMismatchException e){
            System.out.println("사용자가 문자를 입력함");
        } catch(NullPointerException e){
            System.out.println("널이야....");
        }catch (Exception e){
            System.out.println("기타오류...");
        }
        // Exception 예외클래스는 모든 예외 클래스의 상위클래스이므로 예외가 발생됐을 때 동일한
        // 처리를 하려면 상위타입으로 정의해서 작업
        // try{
        //     System.out.println(10/0);
        //     String str = null;
        //     str.lastIndexOf(10);
        //     System.out.println(args[0]);
        // } catch (Exception e) {
        //     System.out.println("예외발생");
        // }
        
    }
}
