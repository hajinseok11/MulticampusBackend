package exception;
// 자바에서 예외처리를 하는 방법 : try~catch
public class Ex02_ExceptionTest02 {
    public static void main(String[] args) {
        try{
            System.out.println("try블럭 시작");
            System.out.println(10/0);
            System.out.println("try블럭 종료");
        }catch(ArithmeticException e){
            // 예외가 발생하면 처리할 문장을 구현
            System.out.println("예외발생");
            // 개발자가 실수할 수 있는 부분을 찾아서 처리할 수 있도록 메시지를 출력
            System.out.println("예외메세지 : "+e.getMessage());
            // 예외를 추적해서 화면에 예외가 발생한 메소드의 라인넘버까지 출력하므로 개발시에 많이 사용
            e.printStackTrace();
        }
    }
}
