package ooppolymorphism;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Ex02_RefTypeCastingTest {
    public static void main(String[] args) {
        // 상속관계에 있는 클래스는 자동캐스팅
        // 서브클래스의 인스턴스를 슈퍼클래스 타입으로 변환하는 작업 - 업케스팅(안전)
        // 상위클래스타입 변수 = new 하위클래스()
        ArrayList<String> list = new ArrayList<>();
        AbstractList<String> ablist = new ArrayList<String>();
        AbstractCollection<String> aclist = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        String str = new String("java");
        StringBuffer sb = new StringBuffer();

        // String = StringBuffer
        // 참조형에서 상속관계가 아닌 경우에는 캐스팅을 할 수 없다.
        // 참조형에서 캐스팅을 하려면 무조건 상속관꼐에 있는 클래스.
        // str = (String)sb; 컴파일 오류
    }
}
