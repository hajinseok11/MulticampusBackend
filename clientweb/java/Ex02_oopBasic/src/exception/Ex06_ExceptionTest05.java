package exception;
// try~catch~finally
public class Ex06_ExceptionTest05 {
    public static void main(String[] args) {
        try{
            System.out.println("프로그램시작");
            System.out.println("디비연동");
            System.out.println("디비처리진행중..."+10/0);
            System.out.println("완료");
            System.out.println("자원반납코드");
        }catch(Exception e) {
            System.out.println("오류코드확인");
        }finally{
            // 예외가 발생되거나 발생되지 않거나 무조건 실행되는 코드
            System.out.println("자원반납코드");
        }
    }
}
