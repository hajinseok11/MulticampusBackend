package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// throws를 이용해서 예외를 처리하는 방법
public class Ex07_ThrowsTest01 {
    // 1. 예외가 발생한 곳에서 예외를 처리
    //  => 호출한 곳에서 예외가 발생된 것을 알 수 없다.
    //  => 예외가 발생되면 예외에 대한 모든 처리가 끝난 상태로
    //     실행되므로 호출한 곳에서 다양하게 처리할 수 없다.
    public void test(String fileName){
        try{
        FileInputStream fis = new FileInputStream(fileName);
        }catch (FileNotFoundException e){
            // 예외를 처리
            System.out.println("지정한 파일을 찾을 수 없습니다 ! !");
        }
    }
    //2. 예외가 발생된 곳에서 처리하지 않고 호출한 곳에서 처리하도록 예외를 넘기기
    // public void 메소드명() throws 예외클래스 1, 예외클래스 2,,,,{}
    public void test2(String fileName) throws FileNotFoundException, ArithmeticException{
        FileInputStream fis = new FileInputStream(fileName);
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        // 예외가 발생될 메소드인 test() 메소드를 호출해서 사용하는 곳
        // 1. 예외가 발생되지만 이미 발생된 곳에서 예외처리가 끝난 test메소드를 호출
        Ex07_ThrowsTest01 obj = new Ex07_ThrowsTest01();
        obj.test("test2.txt");

        // 2. 예외를 발생한 곳에서 처리하지 않고 호출한 곳에서 처리
        try{
            obj.test2("test2.txt");
        }catch(FileNotFoundException e){
            // 호출한 곳에서 상황에 맞게 예외에 대한 처리를 할 수 있다.
            System.out.println("파일명이 틀렸으므로 파일을 다시 선택할 수 있는 대화상자를 출력");    
        }
    }
}
