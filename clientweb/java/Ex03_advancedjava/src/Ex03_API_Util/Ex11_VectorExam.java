package Ex03_API_Util;

import java.util.Vector;

public class Ex11_VectorExam {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<Integer>();
        int[] score = {78,99,100,95,100};
        for(int i = 0; i< score.length;i++){
            v1.add(score[i]);
        }
        int sum = 0;
        for(int jumsu:v1){
            sum += jumsu;
        }
        System.out.println("총점 : "+sum);
        System.out.println("총점 : "+(sum/v1.size()));
    }
}
