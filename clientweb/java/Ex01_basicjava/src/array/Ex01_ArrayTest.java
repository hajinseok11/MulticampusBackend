package array;

import java.util.Random;

// 배열의 사용방법
public class Ex01_ArrayTest {
    public static void main(String[] args) {
        // 1. 배열의 선언
        // - 배열을 참조할 변수를 정의하는 과정
        // - int형의 데이터를 저장할 수 있는 배열변수를 선언
        // [형식]
        // 데이터타입 [] 변수명;
        // 데이터타입 변수명 [];
        int[] myarr;
        // int myarr2 [];

        // 2. 배열의 생성
        // => 실제 데이터를 저장할 수 있는 구조를 만드는 과정
        // => 생성된 배열은 힙에 할당된다.
        // => 힙에 할당되므로 프로그램 안에서 활용하기 위해서는 변수에 대입한다.
        // int데이터가 5개 저장될 수 있는 배열을 생성(5개의 요소를 갖고있는 배열을 생성)
        myarr = new int[5];
        System.out.println(myarr);

        // 3. 배열의 초기화
        // 생성되는 배열에는 각 타입별로 초기값이 있다.
        // 정수 = 0
        // 실수 = 0.0
        // boolean = false
        // 참조형 배열 = null
        System.out.println("배열의 0번 요소의 값 => " + myarr[0]);
        boolean [] boolArray = new boolean[2];
        System.out.println("배열의 0번 요소의 값 => " + boolArray[0]);
        double [] doubleArray = new double[2];
        System.out.println("배열의 0번요소의 값 => " + doubleArray[0]);
        Random[] randomArray = new Random[2];
        System.out.println("배열의 0번요소의 값 => " + randomArray[0]);


    }
}
