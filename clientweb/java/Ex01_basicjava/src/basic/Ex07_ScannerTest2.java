package basic;

import java.util.Scanner;

//Scabber 클래스에 대한 내용
// API 활용
// Scanner는 사용자가 입력하는 값을 읽어서 처리하기 위한 기능을 제공
// System.out => 표준 출력 (모니터로 출력 - 콘솔에 출력)
// System.in => 표준 입력(키보드로 입력)
public class Ex07_ScannerTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Scanner에서 제공되는 메소드 중 키보드로 입력하는 값을 읽기 위한 메소드들은
        // space bar키나 enter키가 눌려지기 전에 입력한 단어(값)을 한 개만 읽어서 리턴
        System.out.print("단어입력: ");
        // 문자열(단어)를 읽기
        String val = scan.nextLine();
        System.out.println("읽은값: " + val);

        // double 값을 읽기
        System.out.print("실수입력: ");
        double doubleVal =scan.nextDouble();
        System.out.println("읽은값: " + doubleVal);

        // int 값을 읽기
        System.out.print("정수입력: ");
        double intVal =scan.nextInt();
        System.out.println("읽은값: " + intVal);


    }
}