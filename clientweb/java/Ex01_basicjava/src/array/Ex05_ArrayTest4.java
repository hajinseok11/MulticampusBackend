package array;

import java.util.Random;

// 참조형 저장하는 배열
public class Ex05_ArrayTest4 {
    public static void main(String[] args) {
        String[] strArr = new String[3];
        System.out.println(strArr);
        // 배열요소에 초기값으로 기본값이 할당된다.
        // 참조형인 경우 기본값 null
        System.out.println(strArr[0]);

        strArr[0] = new String("java");
        strArr[1] = new String("mysql");
        strArr[2] = new String("oracle");
        for(int i=0; i<strArr.length;i++){
            // strArr[i]요소가 String객체를 참조하는 변수
            // 기본형 배열에서는 strArr[i]이런 요소에 저장된 것이 값이지만
            // 참조형 배열에서는 strArr[i]이런 요소에 저장된 것이 힙에 할당된 객체의 주소
            System.out.println(strArr[i].length());
        }
        System.out.println("=========================================");
        // 향상된 for문에서는 배열요소로 접근하지 않으므로 쉽게
        for(String str:strArr){
            System.out.println(str.length());
        }

        // Random객체 5개를 엑세스할 수 있는 배열을 정의
        Random [] randomArr = new Random[5];
        randomArr[0] = new Random();
        randomArr[1] = new Random();
        randomArr[2] = new Random();
        randomArr[3] = new Random();
        randomArr[4] = new Random();
        // Thread [] threadArr = new Thread[5];
        for(Random rand:randomArr){
            System.out.println(rand);
        }

        
    }
}
