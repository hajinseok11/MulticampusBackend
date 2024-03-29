package Ex03_API_Util;

import java.util.HashSet;
import java.util.Iterator;

public class Ex20_HashSetTest01 {
    public static void main(String[] args) {
        // 1. HashSet생성
        HashSet<String> set = new HashSet<>();
        // 2. HashSet에 데이터 추가
        set.add("자바");
        set.add("서블릿");
        set.add("JSP");
        set.add("스프링");
        set.add("자바"); // 중복불가능
        // 3. set에 저장된 요소의 개수 
        System.out.println(set.size());
        System.out.println(set.contains("스프링")); // "스프링이 포함되어있는지 확인 있다면 true리턴"
        System.out.println("==========================================");
        // 4. 모든 데이터를 출력하기(기본 방법)
        for(String data:set){
            System.out.println(data);
        }
        System.out.println("==========================================");

        // 4. 모든 데이터를 출력하기 (표준 인터페이스를 이용해서 작업)

        // 순서가 있는 자료구조가 아니므로 자바 내부에서 제공되는 표준 인터페이스로 변경하고 작업(추출전용 인터페이스)
        // 1. HashSet을 Iterator로 변환하기
        Iterator<String> it = set.iterator();
        // 2. Iterator에 저장된 HashSet데이터들을 출력하기
        while(it.hasNext()){// Iterator에 데이터가 있는지 여부를 확인
            // 데이터를 꺼내기
            String data = it.next();
            System.out.println(data);
        }
        System.out.println("==========================================");
        set.remove("스프링");
        System.out.println(set.size());

    }
}
