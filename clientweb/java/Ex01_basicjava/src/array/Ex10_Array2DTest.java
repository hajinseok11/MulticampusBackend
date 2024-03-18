package array;
// 2차원 배열을 정의하고 엑세스 - 배열의 배열(배열을 참조하는 배열)
public class Ex10_Array2DTest {
    public static void main(String[] args) {
        int [][] myarr = new int [3][2];

        // 2차원 배열에 값을 저장
        myarr[0][1] = 200;
        myarr[1][0] = 100;
        myarr[2][0] = 100;

        System.out.println("myarr의 0번 요소가 참조하는 배열의 값" + myarr[0][1]);
        System.out.println(myarr.length);
        System.out.println(myarr[0].length);
        System.out.println(myarr[1].length);
        System.out.println(myarr[2].length);

        for (int row =0; row < myarr.length; row++){
            for(int i = 0; i < myarr[row].length;i++){
                System.out.print(myarr[row][i] + "\t");
            }
            System.out.println();
        }
    }
}
