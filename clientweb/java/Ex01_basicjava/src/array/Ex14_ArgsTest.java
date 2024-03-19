package array;
// 명령행매개변수 테스트
/**
 * 명령행매개변수
 * -> 프로그램이 실행될 때 외부에서 값을 입력 받아서 사용할 수 있도록 제공(jdk의 초창기 버전)
 * => 프로그램을 실행하면서 값을 입력하면 인터프리터가 클래스명 다음에 몇 개를 입력했는지 공백문자로 구분해서
 * 확인하고 그 개수만큼 String 배열을 만들어서 args에 할당
 * [command창에서 실행하는 경우]
 * java 클래스명 매개변수1 매개변수2....
 */
public class Ex14_ArgsTest {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(args[0]+":"+args[1]);
        int val2 = Integer.parseInt(args[1]);
        // String -> int로 변환
        System.out.println(Integer.parseInt(args[0])+val2);

        // Integer in = new Integer();
        // in.paresInt() // 일반적인 클래스의 메소드를 사용하는 방법이나
        // static이 추가된 메소드는 클래스명.메소드명()
    }
}
