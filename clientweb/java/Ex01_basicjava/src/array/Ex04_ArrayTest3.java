package array;
// 배열의 선언과 생성과 초기화를 한 번에 작업

public class Ex04_ArrayTest3 {
 public static void main(String[] args) {
    // 타 언어에서 주로 쓰는 방식 ,로 구분된 항목이 요소에 저장
    int[] myarr = {10,20,55,90}; 
    // 향상된 for문(jdk5.0이후에 추가)
    // 컬렉션을 다루기 편하도록 for문이 추가
    // 배열변수에서 요소를 하나씩 꺼내서 변수에 저장해서 엑세스
    // [문법]
    // for (데이터타입 변수 : 배열변수(컬렉션 변수)){
    //     ----------
    //      배열의 타입(배열요소에 할당된 데이터의 타입)
    //}
    int i = 0;
    for (int data:myarr){
        System.out.println("배열요소의 값: " + data+":"+i);
        i++;
        }

    // 자바답게 
    int j = 0;
    int [] myarr2 = new int [] {10,20,30,40};
    for(int data : myarr2){
        System.out.println("배열요소의 값: " + data + ":"+j);
        j++;
    }

    // String배열 - 리터럴로 처리하는 경우
    String[] subjectlist = {"java","servlet","spring","spring boot"};
    for(String data : subjectlist){
        System.out.println(data);
    }
    }   
}
