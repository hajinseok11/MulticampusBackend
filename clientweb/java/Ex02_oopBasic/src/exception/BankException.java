package exception;

public class BankException extends Exception {
    public BankException(String str){
        super(str); // Exception을 발생시키면서 전달하는 문자열이 Exception객체의 message로 셋팅될 수 있도록 처리
                    /**                                ------------------------------------------------
                     *                                  1. Exception이 발생될 때 메세지로 출력될 수 있도록 하기위해
                     *                                  2. getMessage() 메소드 호출하면 출력
                     *                                  
                     */
    }
}

