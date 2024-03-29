package basic;
// 자바에서 로컬변수의 특징(클래스 블럭을 빼고 모든 블럭안에서 선언된 변수를 자바에서는 로컬변수라 한다.)
public class Ex04_LocalVariableTest {
    public static void main(String[] args) {
        int j = 10; // 로컬변수(지역변수)
        int num;
        //1. 로컬 변수는 사용하기 전에 초기화(=연산자로 값을 할당) 해야한다
        // System.out.println(num);
        if (j >= 10){
            // val 변수는 if블럭에서 선언된 지역변수
            int val = 100;
        }
        // 2. 로컬변수는 선언된 블럭 내부에서만 사용할 수 있다.
        // 블럭이 끝나면 메모리에서 해제
        // System.out.println(val);
        for(int i=0; i < 10; i++){
            System.out.println("지역변수...");
        }
        // 3. for문을 사용하기 위해 선언된 초기화 변수도 for블럭 안에서 선언된 지역변수
        // System.out.println("for문에서 사용한 i변수=>" + i);

        //4. for문에서 사용하는 초기화 변수를 for문 밖에서 사용해야 한다면 for문 밖에서 선언하고 사용
        int i = 0; //정수형 변수는 0으로 초기화
        for(i=0; i < 10; i++){
            System.out.println("지역변수...");
        }
        System.out.println("for문에서 사용한 i변수=>" + i);

    }
}
