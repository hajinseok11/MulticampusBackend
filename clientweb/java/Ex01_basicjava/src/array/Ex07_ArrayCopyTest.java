package array;
// 배열의 사이즈를 변경하는 작업
// 배열의 요소를 변경하려면 현재 배열의 요소보다 큰 배열을 생성하고
// 배열의 요소를 복사하기
public class Ex07_ArrayCopyTest {
    public static void main(String[] args) {
        int[] firstArr = new int [5];
        System.out.println("첫번째 배열=> " + firstArr);
        // 배열에 값을 할당하기 위한 for문
        for(int i =0; i<firstArr.length;i++){
            firstArr[i] = 10 + i;
        }
        // 기존 배열에 저장된 요소의 값을 출력
        for(int i =0; i<firstArr.length;i++){
            System.out.print(firstArr[i] + "\t");
        }
        System.out.println();// 엔터를 누른것과 같은 효과

        // 배열의 사이즈를 변경
        // 1. 새로운 배열을 생성
        int [] secondArr = new int[firstArr.length*2];
        // 2. 기존배열을 새로운 배열에 copy
        for(int i =0; i<firstArr.length;i++){
            secondArr[i] = firstArr[i];
        }
        // 3. 복사된 배열을 확인
        for(int i =0; i<secondArr.length;i++){
            System.out.print(secondArr[i] + "\t");
        }
    }
}
