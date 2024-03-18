package array;

public class Ex03_ArrayExam {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 100;
        intArray[1] = 200;
        intArray[2] = 300;
        intArray[3] = 400;
        intArray[4] = 500;
        for(int i=0; i < intArray.length;i++){
            System.out.println("intArray의 요소 => "+ intArray[i]);
        }
    }
}
