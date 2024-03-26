package exception;
// 다중 catch의 다른 표현
public class Ex05_ExceptionTest4_2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            System.out.println(args[0]);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("예외발생: "+e.getMessage());
            if(e instanceof ArithmeticException){
                System.out.println("0으로 나누지마");
            }else{
                System.out.println("배열선언안함");
            }
        }
    }
}
