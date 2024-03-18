package statement;

import java.util.Scanner;

public class Ex01_MultiifExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수입력: ");
        int score = scan.nextInt();
        if (score >= 0 & score <= 100){
            if(score >= 90 & score < 100){
                System.out.println(score+", A학점");
            }else if(score >= 80) {
                System.out.println(score+", B학점");
            }else if (score >= 70){
                System.out.println(score+", C학점");
            }else if(score >= 60){
                System.out.println(score+", D학점");
            }else{
                System.out.println(score+", F학점");
            }
        }else{
            System.out.println("잘못입력");
        }
        scan.close();

    }
}
