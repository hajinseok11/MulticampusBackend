package array;

import java.util.ArrayList;
// 사이즈가 변경될 수 없는 배열의 문제점을 해결하기 위해서 자바 API로 컬렉션을 제공한다.
// 리스트 : 선형구조 (순서가있다) - ArrayList
// 집합 : 중복을 허용하지 않는다. -HashSet
// Map : key와 value를 같이 저장 - HashMap

public class Ex09_ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<100000; i++){
            list.add(""+i); // 값을 저장
            System.out.println(list.get(i)); // 값을 가져오기
        }
        System.out.println("요소의 개수 => " + list.size()); // 요소의 개수 출력
    }
}
