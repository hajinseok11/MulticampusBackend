package oopbasic;

public class Ex08_MethodTest {
    public String test(){
        String result = "";
        int num = 90;
        if (num > 90){
            result = "A";
        } else if (num > 90){
            result = "B";
        }
        return result;
    }
    // return은 블럭의 마지막 명령문으로 정의
    // 블럭 안에서 return하는 경우 모든 블럭에 return명령어를 추가해야한다.
    public String retrunTest(){
        String result = "";
        int num = 90;
        if (num > 90){
            return "A";
        } else if (num > 80){
            return "B";
        }else{
            return "기타";
        }
    }

    public static void main(String[] args) {
        
    }
}
