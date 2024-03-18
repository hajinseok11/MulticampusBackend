package basic;

import java.util.Scanner;

// Scanner를 이용해서 숫자를 입력받고 입력받은 숫자가 홀수인지 짝수인지 출력하세요
// [출력형태]
// 숫자입력:__
// 입력한 숫자 8은 짝수입니다.
// 입력한 숫자 7은 홀수입니다.
public class Ex06_ScannerTest {
    public static void main(String[] args) {
        // 사용자 입력을 받기 위해 지원되는 자바의 기능을 사용
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자입력: ");
        // nextInt는 사용자가 입력한 숫자를 읽어서 반환(spacebar나 enter키를 만나기 전까지의 입력한 값)
        int inputNum = scan.nextInt();
        // 저장된 값으로 평가
        if (inputNum % 2 == 0) {
            System.out.println("입력한 숫자"+inputNum+"은 짝수입니다");
        }else{
            System.out.println("입력한 숫자"+inputNum+"은 홀수입니다");
        }
        scan.close();
    }
}
