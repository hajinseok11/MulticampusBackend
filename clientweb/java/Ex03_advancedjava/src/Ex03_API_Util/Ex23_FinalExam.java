package Ex03_API_Util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/** ArraryListExam03을 수정 실제 데이터를 객체에 셋팅
 * => DB에서 조회하는 데이터를 처리하는 방법
 */

public class Ex23_FinalExam {
    public static void main(String[] args) {
        ArrayList<StudentDTO> studentList = new ArrayList<>();
        System.out.println("번호\t성명\t국어\t수학\t영어\t총점\t평균");
        StudentDTO student1 = new StudentDTO(1,"장동건",100,99,88);
        StudentDTO student2 = new StudentDTO(2,"이민호",89,100,100);
        StudentDTO student3 = new StudentDTO(3,"김범룡",95,89,100);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        HashSet<StudentDTO> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);

        HashMap<Integer,StudentDTO > studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);

        // ArrayList에 저장된 student1, student2,student3을 HashSet에 넣기
        // ArrayList에 저장된 student1, student2,student3을 HashMap에 넣기
        print(studentList);
        System.out.println("*********************************");
        print(studentSet);
        System.out.println("*********************************");
        print(studentMap);


    }
    public static void print(HashSet<StudentDTO> studentSet){
        for (StudentDTO student: studentSet){
            int sum = student.getKor() + student.getMath()+student.getEng();
    
            System.out.println(student.getNum()+"\t"+student.getName()
            +"\t"+student.getKor()+"\t"+student.getMath()+"\t"+student.getEng()
            +"\t"+sum+"\t"+(sum/studentSet.size()));
            }        
        }

    public static void print(HashMap<Integer,StudentDTO> studentMap){
        Set<Integer> keylist = studentMap.keySet();
        for (Integer key: keylist){
            StudentDTO student = studentMap.get(key);
            int sum = student.getKor() + student.getMath()+student.getEng();

            System.out.println(student.getNum()+"\t"+student.getName()
            +"\t"+student.getKor()+"\t"+student.getMath()+"\t"+student.getEng()
            +"\t"+sum+"\t"+(sum/studentMap.size()));
            }        
        }   
    

    public static void print(ArrayList<StudentDTO> studentList){
        for (StudentDTO student: studentList){
            int sum = student.getKor() + student.getMath()+student.getEng();

            System.out.println(student.getNum()+"\t"+student.getName()
            +"\t"+student.getKor()+"\t"+student.getMath()+"\t"+student.getEng()
            +"\t"+sum+"\t"+(sum/studentList.size()));
            }        
    }
}

