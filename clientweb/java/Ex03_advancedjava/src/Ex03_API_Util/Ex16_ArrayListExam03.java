package Ex03_API_Util;

import java.util.ArrayList;
import java.util.List;

/** 번호   성명   국어   수학   영어   총점   평균
 * 1      장동건  100    99     88    ____    ___
 * 2      이민호  89     100    100   ____    ___
 * 3      김범룡  95     89     100   ____    ___
 * 
 * 1. 1, 2, 3 번의 모든 데이터를 ArrayList에 저장(ArrayList<ArrayList<String>>)
 * 2. 위의 형식과 같이 출력
 * 3. 제목은 sysout으로 출력
 * 4. ArrayList에는 학생들의 정보만 저장
 * 5. 총점과 평균은 출력할때 추가하기
 */

public class Ex16_ArrayListExam03 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> studentList = new ArrayList<>();
        System.out.println("번호\t성명\t국어\t수학\t영어\t총점\t평균");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("장동건");
        list1.add("100");
        list1.add("99");
        list1.add("88");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("2");
        list2.add("이민호");
        list2.add("89");
        list2.add("100");
        list2.add("100");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("3");
        list3.add("김범룡");
        list3.add("95");
        list3.add("89");
        list3.add("100");
        studentList.add(list1);
        studentList.add(list2);
        studentList.add(list3);

        for(ArrayList<String> student: studentList){
            int sum = Integer.parseInt(student.get(2))
            +Integer.parseInt(student.get(3))+Integer.parseInt(student.get(4));
            for(String val:student){
                System.out.print(val+"\t");
            }
            System.out.println(sum+"\t" + ((double)sum/studentList.size()));
        }


    }
    
}
