package array;

public class Ex11_Array2DTest2 {
    public static void main(String[] args) {
       // 평균은 double연산
       // 1. 2학급의 국어 수학 영어 점수를 저장할 배열을 만들고 값을 저장하기
       int[][] score = new int [2][3];
       String[] banArr = {"A반","B반"};
       // A반 점수
       score[0][0] = 90;
       score[0][1] = 89;
       score[0][2] = 100;

       // B반 점수
       score[1][0] = 98;
       score[1][1] = 89;
       score[1][2] = 97;
       // 값을 하나씩 요소에 할당하기
       // 2. 저장된 배열의 모든 값을 출력하기 (연산)
       int sum = 0; // 각 반의 총합을 더할 변수
       for(int row = 0; row < score.length;row++){
            sum = 0;
            System.out.println("["+banArr[row]+"]");
            
            for (int i = 0; i < score[row].length; i++){
                sum = sum + score[row][i];
            }
            System.out.println("합계: " +sum);
            System.out.println("평균: " + ((double)sum/score[row].length));
            System.out.println("=========================================");

       }
    }
}
