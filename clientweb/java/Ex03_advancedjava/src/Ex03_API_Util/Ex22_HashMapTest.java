package Ex03_API_Util;

import java.util.HashMap;
import java.util.Set;

// Map
// key와 Value를 저장하기 위해서 사용
// key와 value에 대한 모든 타입을 정의하고 작업하기
// servlet과 jsp 내부에서 사용하는 데이터 저장구조가 모두 MAP구조
public class Ex22_HashMapTest {
    public static void main(String[] args) {
        // HashMap의 생성
        HashMap<String, Integer> map = new HashMap<>();
        // 데이터 저장하기
        // => Map은 순서가 없는 자료구조, key의 값으로 저장될 위치를 계산해서 저장하므로 데이터를
        // 추출하는 경우 순서대로 나오지 않는다.
        map.put("a01", 1000);
        map.put("a02", 2000);
        map.put("a03", 3000);
        map.put("a04", 4000);
        map.put("a05", 4000);
        map.put("a06", 6000);
        map.put("a06", 7000);   //  key는 중복될 수 없다. - 동일한 key를 정의하고 put하면 해당 키에 대한
                                          //  value가 업데이트
        // 사이즈
        System.out.println(map.size());
        // 값 출력하기
        System.out.println(map.get("a04"));
        System.out.println(map.get("a05"));

        // Map에 저장된 모든 데이터 꺼내기
        // 1. 모든 키를 추출
        Set<String> keylist = map.keySet();
        // 2. 키를 이용해서 value를 꺼내기
        for(String key : keylist){
            System.out.println(map.get(key));
        }

    }    
}
