package oopbasic;
// 매개변수와 리턴값이 참조형인 경우
public class Ex09_MethodTest3 {
    public static void main(String[] args) {
        MyMethod3 obj = new MyMethod3();
        int [] data = {88,70,66,100};
        // 1. MyMethod3에 정의한 메소드를 호출해서 작업 
        // - 호출할 때 data를 매개변수로 전달
        int[] resultArr = obj.changeArr(data);
    
        // 2. 호출한 결과를 출력해보기
        for(int i = 0; i < resultArr.length; i++){
            System.out.print(resultArr[i]+"\t");
        }
        // [출력형태]
        // ___ ___ ___ ___
        
        System.out.println();
        // 원본출력하기
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]+"\t");
        }

    }
}
