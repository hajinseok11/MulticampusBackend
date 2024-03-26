package exception;

import java.io.FileNotFoundException;

public class Ex08_ThrowsTest02 {
    public static void main(String[] args) {
        Ex07_ThrowsTest01 obj = new Ex07_ThrowsTest01();
        obj.test("test2.txt");

         // 2. 예외를 발생한 곳에서 처리하지 않고 호출한 곳에서 처리
        try{
            obj.test2("test2.txt");
        }catch(FileNotFoundException e){
            // 호출한 곳에서 상황에 맞게 예외에 대한 처리를 할 수 있다.
            System.out.println("파일선택의 기회는 한 번..종료");    
        }
    }
    
}
