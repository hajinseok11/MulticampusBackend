package basic;

import java.util.Random;

public class Ex14_APIExam2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int result = rand.nextInt();
        System.out.println("랜덤수:" + result);

        result = rand.nextInt(100)+1; // 0~99랜덤수 + 1;
        System.out.println("랜덤수: "+result);

        // 로또번호 - 6개


    }
}
