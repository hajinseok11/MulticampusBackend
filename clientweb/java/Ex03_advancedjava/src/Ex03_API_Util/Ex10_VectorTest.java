package Ex03_API_Util;

import java.util.Vector;

// List - Vector의 사용방법
public class Ex10_VectorTest {
    public static void main(String[] args) {
        // 1. Vector 생성
        // E는 Vector에 저장되는 요소의 타입
        // => Generic을 적용해서 Vector(모든 자료구조)에 저장되는 요소의 타입을 정의하고 작업
        Vector<Integer> v1 = new Vector<Integer>(); // int[] arr = new int[10];
        
        // v1.add("java");
        // 2. Vector에 데이터 저장하기
        v1.add(10); // arr[0] = 10;
        // 3. Vector에 저장된 요수의 갯수
        System.out.println("현재 벡터에 저장된 요소의 개수 => " + v1.size());   // arr.length
        System.out.println("현재 벡터의 용량 => " + v1.capacity());   

        for(int i = 1; i<=10; i++){
            v1.add(i);
        }
        System.out.println("현재 벡터에 저장된 요소의 개수 => " + v1.size());   // arr.length
        System.out.println("현재 벡터의 용량 => " + v1.capacity());   

        // 4. Vector에 저장돈 요소를 꺼내기 - 요소번호는 0번
        System.out.println("1번 요소에 저장된 값 => "+v1.get(1)); // sysout(arr[1])

        // 5 Vector에 저장된 모든 요소를 꺼내기
        for(int i = 0; i < v1.size(); i++){
            int data = v1.get(i);
            System.out.println(i+"번째 요소 => "+ data);
        }
        System.out.println("================================================");
        for(int data:v1){
            System.out.println(data);
        }
        
        
    }
}
