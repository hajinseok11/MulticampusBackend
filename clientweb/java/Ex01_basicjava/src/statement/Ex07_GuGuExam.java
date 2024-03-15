package statement;
// for문을 중첩해서 사용하기
public class Ex07_GuGuExam {
    public static void main(String[] args) {
        for(int dan = 2; dan <= 9; dan++){
            for (int i = 1; i <= 9; i++){
                System.out.print(dan+"x"+i+"="+dan*i+"\t");
            }System.out.println();
        }
        System.out.println("==============================");
        for(int i = 1; i <= 9; i++){
            for (int dan = 2; dan <= 9; dan++){
                System.out.print(dan+"x"+i+"="+(dan*i)+"\t");
            }System.out.println();
        }
}

}
