package array;
// 다차원 배열 - 가변 배열을 지원한다.
// => 다차원 배열을 참조하는 배열이므로 각 배열의 요소가 참조하는 배열의 사이즈가 달라도 된다.
public class Ex13_Array2DTest3 {
    public static void main(String[] args) {
        char[][] myarr = new char[5][]; // 실제 값이 저장될 배열의 사이즈는 생성하면서 지정한다.
        myarr[0] = new char[1];
        myarr[1] = new char[2];
        myarr[2] = new char[3];
        myarr[3] = new char[4];
        myarr[4] = new char[5];

        // 값을 할당
        for(int row = 0; row < myarr.length; row++){
            for(int i = 0; i < myarr[row].length; i++){
                myarr[row][i] = '*';
            }
        }
        // 2차원 배열에 저장된 값을 꺼내기 - 향상된 for문
        for(char[] data : myarr){
            for(char c : data){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
