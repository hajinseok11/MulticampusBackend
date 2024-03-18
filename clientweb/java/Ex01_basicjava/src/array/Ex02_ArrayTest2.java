package array;
// 배열의 사용 - 배열의 선언과 생성을 동시에 처리

public class Ex02_ArrayTest2 {
    public static void main(String[] args) {
        int[] myarr = new int[3];
        myarr[0] = 1000;
        myarr[1] = 2000;
        myarr[2] = 3000;
        System.out.println("0번요소 => " + myarr[0]);
        System.out.println("1번요소 => " + myarr[1]);
        System.out.println("2번요소 => " + myarr[2]);

        System.out.println("==========================");
        // 코드의 최적화(코드의 리팩토링)
        for(int i=0; i<3; i++){
            System.out.println(i+"번 요소=>" + myarr[i]);
        }
        System.out.println("배열의 요소의 개수 => " + myarr.length);
        System.out.println("배열접근하기 => " + myarr[3]);
    }
}
