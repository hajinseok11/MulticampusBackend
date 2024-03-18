package statement;

import java.util.Scanner;

public class Ex04_SwitchExamWhile {
    public static void main(String[] args) {
    // 무한루프는 반드시 반복문을 빠져나갈 수 있는 조건을 내부에 명시
    while (true) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*******미니계산기*******");
        System.out.println("1.더하기");
        System.out.println("2.빼기");
        System.out.println("3.곱하기");
        System.out.println("4.나누기");
        System.out.println("5.종료");
        System.out.print("연산자를 선택하세요.");
        int calculate = scan.nextInt();
        if (calculate == 5){
            System.out.println("계산기 종료");
            break;
        }
        // 문제가 발생되지 않으면 while문이 실행되지 않도록
        while(calculate < 1 | calculate > 5){
            System.out.println("연산자 잘못 선택");
            System.out.print("연산자를 선택하세요.");
            calculate = scan.nextInt();
        }
        System.out.print("숫자를 입력하세요");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        switch (calculate) {
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                if(num2==0){
                    System.out.println("0으로 나눌수 없습니다.");
                continue;
                }
                System.out.println(num1/num2);
                break;
            }
        scan.close();
        }
    }
}
