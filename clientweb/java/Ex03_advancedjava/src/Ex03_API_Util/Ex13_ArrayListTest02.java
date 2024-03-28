package Ex03_API_Util;

import java.util.ArrayList;
import java.util.List;

public class Ex13_ArrayListTest02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("oracle");
        list.add("servlet");
        list.add("jsp");
        list.add("spring");
        display(list);
        // 업데이트 4번 요소의 값을 수정
        list.set(4,"spring && spring boot");
        display(list);
        System.out.println("사이즈=>"+list.size());
        list.add("spring && spring boot"); // 마지막에 요소를 추가
        display(list);
        System.out.println("사이즈=>"+list.size());
        // 지우기
        list.remove(1);
        // 여러개가 있으면 첫 번째 요소를 찾아서 제거
        list.remove("spring && spring boot");
        display(list);
        System.out.println(list.contains("java"));
        System.out.println(list.contains("spring"));
        System.out.println(list.isEmpty());

        List<String> list2 = new ArrayList<>();
        list2.add("Mybatis");
        list2.add("JPA");
        list2.add("MongoDB");
        display(list2);
        list2.addAll(list);
        display(list2);
    }
    // ArrayList의 요소를 출력하는 메소드
    public static void display(List<String> list){
        System.out.println("============================");
        for(String data:list){
            System.out.println(data);
        }
    }
}
