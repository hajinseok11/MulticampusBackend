package statement;

import java.util.Scanner;

public class Ex03_SwitchExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*******미니계산기*******");
        System.out.println("1.더하기");
        System.out.println("2.빼기");
        System.out.println("3.곱하기");
        System.out.println("4.나누기");
        System.out.println("5.종료");
        System.out.print("연산자를 선택하세요.");
        int calculate = scan.nextInt();
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
                }
                System.out.println(num1/num2);
                break;
        }
    }
        
}
