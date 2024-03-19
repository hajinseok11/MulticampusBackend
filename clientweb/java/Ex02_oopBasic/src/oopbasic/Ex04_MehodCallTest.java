package oopbasic;

public class Ex04_MehodCallTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        if(i==j){
            System.out.println("i와 j가 같다.");
        }else{
            System.out.println("i와 j가 다르다.");
        }
        MyMethod obj = new MyMethod();
        int result = obj.add(100, 200);
        System.out.println("result = " + result);
        String result2 = "test";

        for (int k = 1; k <= 1000; k++){
            result2 = result2 + "---java";
        }
        System.out.println(result2);
    }
}
