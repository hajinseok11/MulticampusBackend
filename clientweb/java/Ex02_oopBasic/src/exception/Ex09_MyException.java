package exception;
// 잔액이 0원일 때 발생하는 Exception
// 사용자 정의 클래스를 예외클래스의 하위클래스로 작업
public class Ex09_MyException extends Exception{
    public Ex09_MyException(String message){
        super(message);
        
    }    
}
