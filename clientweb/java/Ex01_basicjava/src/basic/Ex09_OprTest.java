package basic;

// 연산자 - 자바스크립트와 동일
public class Ex09_OprTest {
    public static void main(String[] args) {
        // 논리연산자 - & (and), | (or)
        // => 모든 항을 다 검사한다.
        int num1 = 200;
        String str = null ; // str변수가 아무것도 참조하고 있지 않다
        // System.out.println(num1 > 100 | str.length() > 0);
        // System.out.println(str.length());

        // 논리연산자 - &&(and), ||(or)
        // => short-circuit 연산을 수행
        // || 연산이 경우 앞의 항을 검사해서 true면 뒤의 항을 검사하지 않는다.
        System.out.println(num1 > 100 || str.length() > 0);

        // && 연산자
        // && 연산자의 특징으로 첫 번째 항이 false이면 두 번째 항은 검사하지 않는다.
        System.out.println(num1 < 100 && str.length() > 0);
        // 모든 항을 검사
        // System.out.println(num1 < 100 & str.length() > 0);

        // 조건삼항연산자
        // 조건?조건이만족하는경우 리턴될 값: 조건이 만족하지 않는 경우 리턴될 값
        int num = 99;
        String result = num>90?"합격":"불합격";

        int intvalResult = num>90?10000:0;
        System.out.println(result);
        System.out.println(intvalResult);
    }    
}
