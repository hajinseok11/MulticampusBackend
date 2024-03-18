package array;

public class Ex08_ArrayCopyTest2 {
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

        int [] secondArr = new int[firstArr.length*2];
        System.arraycopy(firstArr,0,secondArr,4,firstArr.length);
        for(int i =0; i<secondArr.length;i++){
            System.out.print(secondArr[i] + "\t");
        }


    }
}
