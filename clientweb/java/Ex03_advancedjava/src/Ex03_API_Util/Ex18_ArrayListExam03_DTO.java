package Ex03_API_Util;

import java.util.ArrayList;

/** ArraryListExam03을 수정 실제 데이터를 객체에 셋팅
 * => DB에서 조회하는 데이터를 처리하는 방법
 */

public class Ex18_ArrayListExam03_DTO {
    public static void main(String[] args) {
        ArrayList<StudentDTO> studentList = new ArrayList<>();
        System.out.println("번호\t성명\t국어\t수학\t영어\t총점\t평균");
        StudentDTO student1 = new StudentDTO(1,"장동건",100,99,88);
        StudentDTO student2 = new StudentDTO(2,"이민호",89,100,100);
        StudentDTO student3 = new StudentDTO(3,"김범룡",95,89,100);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for (StudentDTO student: studentList){
            System.out.println(student.getNum()+"\t"+student.getName()
            +"\t"+student.getKor()+"\t"+student.getMath()+"\t"+student.getEng());

            int sum = student.getKor() + student.getMath()+student.getEng();
            
            System.out.println("\t"+sum+"\t"+(sum/studentList.size()));
        }
        

        
    }   
}
