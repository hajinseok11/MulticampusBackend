package Ex03_API_Util;

import java.util.ArrayList;

public class Ex15_ArrayListExam02 {
	public static void main(String[] args) {
		String[] strArr = {"java","servlet","jsp","spring"};
        //2. changeArrayList 메소드를 호출
        ArrayList<String> changedArrayList = changeArrayList(strArr);
        //3. 메소드호출결과 출력
        for(String data:changedArrayList){
            System.out.println(data);
        }
        System.out.println(changedArrayList.getClass().getName());
    }

    // 배열을 ArrayList로 변환해서 리턴하는 메소드를 정의
    // 1. changeArrayList메소드를 정의
    public static ArrayList<String> changeArrayList(String[] strArr){
        ArrayList<String> changedArr = new ArrayList<>();
        for(int i = 0; i< strArr.length; i++){
            changedArr.add(strArr[i]);
        }
        return changedArr;
    }
}

