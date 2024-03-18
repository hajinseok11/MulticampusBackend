package array;

import java.util.Random;

public class Ex06_ArrayExam2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] myarr = new int[5]; // 기본형 배열 - 기본형 변수 5개를 하나의 변수로 엑세스 할 수 있도록 정의

        // Random 수를 할당하기 위한 for문
        for(int i = 0; i < myarr.length; i++){
            myarr[i] = rand.nextInt(100)+1;
        }
        // 배열 변수에 할당된 값을 평가하기 위한 for문
        for(int i = 0; i < myarr.length; i++){
            if(myarr[i] % 2 == 0){
                System.out.println(i+"번요소 -> " + myarr[i] + "(짝수)");
            }else{
                System.out.println(i+"번요소 -> " + myarr[i] + "(홀수)");
            }
        }
    }
}
