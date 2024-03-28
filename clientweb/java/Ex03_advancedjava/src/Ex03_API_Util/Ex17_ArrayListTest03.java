package Ex03_API_Util;

import java.util.ArrayList;

// ArrayList에 ArrayList 저장하기
public class Ex17_ArrayListTest03 {
    public static void main(String[] args) {
        /**
         *     *   *   *   * 
         *     *   *   *   * 
         *     *   *   *   * 
         *     *   *   *   * 
         *     *   *   *   * 
         */
        // 저장 - 모든 데이터가 담길 ArrayList
        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        for(int row = 1; row<=5; row++){
            for(int i = 1; i<=5; i++){
                list.add("*");
            }
            lists.add(list);
        }
        System.out.println(lists);
        //1. 코드 분석하기
        //2. ArrayList<ArrayList<String>> lists = new ArrayList<>(); 선언된 위치에 따라 결과 다른 이유
        //3. 알맞게 출력하기
        // list2에 저장된 데이터를 위의 형식에 맞게 출력하기
        

        // // 출력
        // for(String star:list){
        //     System.out.print(star+"\t");
        // }
    }
}
