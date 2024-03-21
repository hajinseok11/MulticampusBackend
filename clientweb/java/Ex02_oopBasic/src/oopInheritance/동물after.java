package oopInheritance;

public class 동물after{
    public static void main(String[] args) {
        // 상속관계에서 생성해서 사용하는 객체는 주로 하위 클래스
        코끼리after obj = new 코끼리after();
        obj.이동방법 = "기어서";
        obj.이동하다();


    }
}
// 일반화시킨다. - 상속관계를 만들기
class 동물{ // 상위클래스
    String 이름;
	String 이동방법;
    public void 몸무게출력하기(int 몸무게, String 이름){
        System.out.println("몸무게는 "+몸무게+"이름은 "+이름);
    }
    public void 이동하다(){
		System.out.println(이동방법+"으로 이동함");
	}
}
//일반화시키기전
class 뱀after extends 동물{
	int 몸길이;
	public void set몸길이(int 몸길이){
		this.몸길이 = 몸길이;
	}
	
}
class 독수리after extends 동물{
    int 날개길이;
    public void set날개길이(int 날개길이){
        this.날개길이 = 날개길이;
    }
}
class 코끼리after extends 동물{
	int 귀크기;
	public void set귀크기(int 귀크기){
		this.귀크기 = 귀크기;
	}
}
class 고래after extends 동물{
	int 지느러미길이;
	public void set지느러미길이(int 지느러미길이){
		this.지느러미길이 = 지느러미길이;
	}
}






